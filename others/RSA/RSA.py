import random
from math import gcd
from sympy import isprime, mod_inverse


def generate_prime(bits):
    # 소수 생성
    number = 1
    while not isprime(number):
        number = random.getrandbits(bits)
    return number


def generate_keypair(bits):
    # 키 쌍 생성
    p = generate_prime(bits)
    q = generate_prime(bits)
    while p == q:
        q = generate_prime(bits)

    # n과 오일러의 피 함수 계산
    n = p * q
    phi = (p - 1) * (q - 1)

    # 공개 키 e 선택
    e = random.randrange(2, phi)
    while gcd(e, phi) != 1:
        e = random.randrange(2, phi)

    # 개인 키 d 계산
    d = mod_inverse(e, phi)

    return ((e, n), (d, n))


def encrypt(public_key, plaintext):
    # 평문 암호화
    e, n = public_key
    return [pow(ord(char), e, n) for char in plaintext]


def decrypt(private_key, ciphertext):
    # 암호문 복호화
    d, n = private_key
    return ''.join(chr(pow(char, d, n)) for char in ciphertext)


if __name__ == "__main__":
    # 키 쌍의 비트 수 설정
    bits = 16

    # 키 쌍 생성
    public_key, private_key = generate_keypair(bits)

    print("Public Key: ", public_key)
    print("Private Key: ", private_key)

    # 원본 메시지
    message = "HELLO RSA"
    print("Original Message: ", message)

    # 메시지 암호화
    ciphertext = encrypt(public_key, message)
    print("Encrypted Message: ", ciphertext)

    # 메시지 복호화
    decrypted_message = decrypt(private_key, ciphertext)
    print("Decrypted Message: ", decrypted_message)

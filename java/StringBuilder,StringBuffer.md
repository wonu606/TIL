# String
문자열은 불변이다.
내부 ```intern()``` 메서드를 통해 pool 안에 문자열이 존재한다면, 해당 문자열을 반환하고 아니라면 새로 객체를 생성하여 반환한다.
![무제 drawio (3)](https://github.com/wonu606/TIL/assets/133995055/854355c8-9227-4f91-b4ff-dea1ff698cb0)

## String의 문제
- 메모리 낭비가 심하다.
- 시간이 오래 걸린다.(O(N^2))

# StringBuilder
내부적으로 버퍼를 사용하여 문자열이 추가로 들어오면 이어 붙여준다.
이 방법을 통해 String시 발생하는 메모리 낭비와 오래 걸리는 시간 문제를 해결해 준다.(O(N))

## StringBuilder의 문제점
동기화를 보장해주지 않는다. 멀티 스레드 환경이라면 ```append()``` 메서드 사용시 문제가 발생할 수 있다.

# StringBuffer
StringBuilder에서 발생하는 동기화 문제를 해결해준다
```append()``` 메서드시 동기화를 보장해준다.
```java
@Override
    @HotSpotIntrinsicCandidate
    public synchronized StringBuffer append(String str) {
        toStringCache = null;
        super.append(str);
        return this;
    }
```
위 코드는 ```StringBuffer.append()```의 코드이다. ```synchronized``` 동기화를 보장해주는 것을 알 수 있다.

## 문제점
동기화를 보장해 주다 보니 속도 측면에서 StringBuilder에 비해 느릴 수 있다.
어느 정도 느린지 코드를 통해 알아보자

# 테스트 코드
[테스트 코드 링크](https://github.com/wonu606/TIL/blob/main/java/code/src/main/java/com/wonu606/StringBuilderStringBufferExample.java)

## 테스트1
```COUNT = 1000```
```java
testString();
testStringBuilder();
testStringBuffer();
```
순으로 테스트를 진행하였다.
```shell
String
연산 시간: 45ms
사용된 메모리: 3145728 bytes

StringBuffer
연산 시간: 0ms
사용된 메모리: 0 bytes

StringBuilder
연산 시간: 0ms
사용된 메모리: 0 bytes
```
1000번 밖에 반복을 하지 않았지만, String과 StringBuilder, StringBuffer 사이에 속도 차이가 크다는 것을 알 수 있다.
이상한 점은 StringBuilder와 StringBuffer에서 사용된 메모리가 0bytes가 나왔다. 
아마도 둘 다 AbstractStringBuilder을 상속받는데, ```append()```시 ```super.append()```를 사용한다.
이때 내부적으로 문자열이 존재하면 받아와 사용하는 것 같다.

## 테스트2
String이 많은 연산 시간과 메모리를 많이 사용하는 것은 알았으므로, StringBuilder와 StringBuffer만 테스트해 보았다.   
```COUNT = 100000000``` 1억번
```java
testStringBuilder();
testStringBuffer();
```
순으로 테스트를 진행하였다.
```shell
StringBuilder
연산 시간: 678ms
사용된 메모리: 907766048 bytes

StringBuffer
연산 시간: 376ms
사용된 메모리: 106896 bytes
```
1억 번 반복을 하니 2배 정도를 속도 차가 났다. 하지만 동기화를 보장해 주는 것에 비해 미비한 속도 차이라고 생각한다.
사용된 메모리 차이는 많이 났는데, 위에 말했다시피 내부적으로 존재하는 문자열을 받아와서 발생하는 문제라고 생각한다.(반대로 해도 비슷한 메모리 차이가 나타남)

# 결론
- 문자열을 복사해야 한다면 StringBuilder와 StirngBuffer를 사용하자
- 단일 스레드만을 사용할 경우엔 StringBuilder와 StringBuffer 중 속도 면에서 우월한 StringBuilder를 사용하자
- 멀티 스레드를 사용 중이거나, 차후 멀티 스레드를 도입할 예정이 조금이라도 있다면 StringBuffer가 좋을 것 같다고 생각한다.(예상보다 속도 차이가 나지 않음)

## 참조
- [String vs String Builder vs String Buffer - 김보섭(20221031)](https://school.programmers.co.kr/app/courses/15738/curriculum/lessons/144467#part-36579)
- [Java String 객체와 String 리터럴 - paki1019](https://velog.io/@paki1019/Java-String-%EA%B0%9D%EC%B2%B4%EC%99%80-String-%EB%A6%AC%ED%84%B0%EB%9F%B4)
- [[자료구조 알고리즘] 자바의 StringBuilder에 대해 알아보고 구현하기 - 엔지니어 대한민국](https://www.youtube.com/watch?v=gc7bo5_bxdA)

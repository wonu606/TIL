# ArrayList

## 왜 사용하는가?
- ArrayList는 크기를 동적으로 조정할 수 있는 배열 기반의 자료 구조이다.
- 동적 배열이기 때문에 메모리를 효율적으로 사용할 수 있다.
- 마지막 요소 추가 및 제거, 모든 인덱스에 대한 접근이 O(1) 시간 복잡도를 가진다.

## 오해
- 마지막 요소 추가시 O(N)으로 생각할 수 있다. 하지만 분할상환분석(Amortized Analysis)를 사용하여 전체적으로 본다면 O(1) 시간 복잡도를 가진다.

## 주의할 점
- 특정 인덱스에 추가 및 제거는 O(N) 시간 복잡도를 가진다.

## 코드
- [구현 코드](https://github.com/wonu606/TIL/blob/main/data-structures/code/src/main/java/com/wonu606/MyArrayList.java)
- [테스트 코드](https://github.com/wonu606/TIL/blob/main/data-structures/code/src/test/java/com/wonu606/MyArrayListTest.java)

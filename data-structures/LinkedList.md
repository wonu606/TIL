# LinkedList
각각의 데이터를 연결하여 저장하는 구조

## 사용하는 이유
- 일반 정적 배열일 때, 배열의 크기를 동적으로 사용할 수 없다. 이 경우 링크드리스트를 사용하면 동적 배열처럼 사용할 수 있다.   
  (데이터를 추가할 때 새로 생성한 데이터를 이어붙이는 형식이기 때문에 가능)

## 구조
- LinkedList라는 클래스 안에 head라는 필드가 있다.
- head는 Node라는 클래스로 이루어져 있으며, Node는 data와 next node에 대한 필드 있다.
  (next node를 통해 다음 노드로 이어나갈 수 있다.)

## ArrayList로 대체 가능하지 않을까?
- 동적 배열의 기능만을 사용한다면 ArrayList로 대체 가능하다.
- addFirst()시 ArrayList는 O(N), LinkedList는 O(1)이다. Stack과 같은 자료구조를 사용할 땐 LinkedList로 구현해야 한다.

## 애매한 장점에 비해 뚜렷한 단점
- head 필드만을 가지고 있기 때문에, 특정 인덱스로 접근하는 것이 O(N)이다.
  (그렇기 때문에 get(), set(), addLast() 모두 O(N))
- 배열은 데이터 정보만 가지고 있는 것에 반해 다음 노드의 정보까지 가지고 있어야 해서 저장 공간의 낭비가 있다.
- 캐시의 지역성을 이용할 수 없다. 캐시에 데이터가 올라갈 때, 주변 데이터까지 같이 가져간다.   
  이러한 부분 때문에 배열은 캐시 내에서 데이터를 검색할 수 있지만, LinkedList는 각각 따로 존재하기 때문에 불가능하다.

## 대안
사실 java.util에 구현되어 있는 LinkedList는 doubly LinkedList이다.(head와 last를 가짐)   
doubly LinkedList로 구현하게 된다면, 뚜렷한 장점을 가지게 된다.(데이터 추가, 삭제시 유리)   
데이터 추가를 자주하는 로직일 경우엔 doubly LinkedList, 탐색하는 자주하는 로직일 경우엔 ArrayList를 고려할 수 있게 된다.

## 주의
- clear()시 O(1)처럼 보이지만 O(N)이다.   
  가비지 컬렉터가 참조가 안 되어 있는 노드부터 차례대로 가비지 컬렉션 하기 때문이다.   
  (이처럼 코드 상에서 상수 시간으로 보이지만, 선형 시간인 것을 성능 버그(performance bug)라고 한다)   
  java.util에서는 직접 돌며 참조를 null로 할당한다.(가비지 컬렉션이 한 번에 진행되기 위해)

## 코드
- [구현 코드](https://github.com/wonu606/TIL/blob/main/data-structures/code/src/main/java/com/wonu606/MyLinkedList.java)
- [테스트 코드](https://github.com/wonu606/TIL/blob/main/data-structures/code/src/test/java/com/wonu606/MyLinkedListTest.java)
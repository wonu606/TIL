# 옵저버 패턴

자산이 관찰 중인 객체에 발생하는 모든 이벤트에 대하여 알리는 구독 메커니즘

## 필요 객체

- Subject(주제)라고 불리는 이벤트를 발생시키는 객체
- Observer(관찰자)라고 불리는 Subject의 상태변화를 관찰하는 객체

## 동작 원리

1. Observer를 Subject에 등록한다.
2. Subject의 상태가 변경되면, Subject에 등록된 Observers에게 알린다.
3. Observer는 변경된 사항에 반응하여, 필요한 작업을 수행한다.

## 2가지 수행 방식

- Push
    1. Subject가 Observer에게 값을 직접 넘겨준다.
- Pull
    1. Subject는 Observer에게 상태가 변경되었다는 것만 알려준다.
    2. Observer는 반응하여, 필요한 작업을 수행한다.

Push는 직접 넘겨주어 ```getData()``` 없이 편하게 값을 변경할 수 있다.   
하지만 추가 데이터가 추가되었을 때 매번 인자를 추가해야 하고, 필요 없는 데이터까지 알아야 하는 문제점이 있다.   
Pull을 사용하여 필요 데이터만을 불러오다면 이러한 문제점들을 개선할 수 있다.

## 사용 예제

- 뉴스 구독 시스템

## 장단점

### 장점

- 느슨한 결합: Subject와 Observer가 서로 독립적으로 동작하기 때문에, 한 부분이 변경되더라도 서로에게 미치는 영향을 최소화할 수 있다.
- 개방/폐쇄 원칙: Subject의 코드를 변경하지 않더라도 새로 구현한 Observer를 추가할 수 있다.
- 동적 관계: 런타임 시간에 Observer를 추가할 수 있다.

### 단점

- 예측하지 못한 종속성: Subject와 Observer 사이의 종속성이 명시적이지 않으면, 코드 유지보수가 어려울 수 있다.

## 예제 코드
[예제코드 링크](https://github.com/wonu606/TIL/tree/main/design-patterns/code/src/main/java/com/wonu606/observerpattern)
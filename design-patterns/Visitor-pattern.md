# 비지터 패턴

***데이터 구조와 데이터 처리를 별도로 분리하는 패턴***

## 필요 객체

- Visitor: 방문자 클래스, Element를 방문하는 메소드를 정의한다.
- Element: 방문 대상 클래스, Visitor를 받아들이는 메소드(accept)를 정의한다.   
  해당 메소드는 Visitor에게 자신의 인스턴스를 전달한다.

## 동작 방법

1. Element 객체에 Visitor를 추가한다.
2. Element 객체의 accept 메소드를 호출한다.   
   (자신을 인자로 넘긴다, accept 메소드에선 visitor 객체의 방문 메소드를 호출)
3. visitor 객체는 인자로 받은 Element 데이터를 처리한다.

## 장단점

### 장점

- 기존 객체 구조에 새로운 추가적인 연산을 추가할 수 있다.   
  (기존 객체 코드 변경 없이 새로운 동작을 구현할 수 있음)

### 단점

- 기존에 없던 객체 구조를 추가하면 모든 Visitor에 새로운 클래스를 추가해야 함
- Element의 private 필드는 접근할 수 없어, public으로 열어두어야 함

## 사용하는 예시

- 그래픽 객체가 있고 그래픽 객체의 맵이 public으로 열려있을 때,   
  visitor 패턴을 통해 그래픽 객체에 그림을 그릴 수 있다.    
  또한, 원 그리기, 네모 그리기 등의 기능을 그래픽 객체에 추가하는 것이 아니라   
  visitor 객체에 추가하게 되면 그래픽 객체의 변화 없이 기능을 추가할 수 있다.

## 코드

[예제 코드 링크](https://github.com/wonu606/TIL/tree/main/design-patterns/code/src/main/java/com/wonu606/visitorpattern)

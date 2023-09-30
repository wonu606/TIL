![챕터1 - 협력 로직](https://github.com/wonu606/TIL/assets/133995055/208a4736-cf6f-4d88-950a-78a8efc9e2d3)
![챕터1 - 서비스 로직](https://github.com/wonu606/TIL/assets/133995055/99ba9652-c18f-4705-b11c-e584bef894f8)

## 느낀 점

- 제약을 먼저 두고 시작해야 비즈니스 로직 자체가 이해하기가 편하다는 생각이 들었다.
  (만약 코딩하면서 1주문 1매장이 아닌 1주문 N매장의 상황도 고려했다가 나중에 수정을 이루었다면 코드가 더러워졌을 수도 있다고 생각한다)
- 설계의 중요성을 조금이나마 깨달은 거 같다. `Order.placeOrder`-> `Order.place`-> `Order.validate`에서 검증하는데 만약 설계할 때,
  고려하지 않고 구현에 들어갔다가 검증을 생각하지 못했을 거 같다. 오류가 난 뒤 고쳤을 거 같다.
- 연관 관계로 할지 의존 관계로 설정할 지는 중요하지 않다. 설계 단계에선 방향성이 중요하다.

![챕터1 -도메인 로직](https://github.com/wonu606/TIL/assets/133995055/81bd0e69-33a9-453d-a055-3a0bc2c6b00d)

## 문제점

- 객체가 사실상 전부 연결되어 있다. Lazy 로딩 이슈 발생한다.
- 트랜잭션의 경계가 모호하다 → 잠금 설정이 어디까지 할지 알 수 없고, 전체를 할 것이다 → 결국 성능 이슈 발생한다 → `Shop`에 큰 트래픽이 발생했을 때, `Order`
  도 기다려야 할 것이다.
- 객체 참조가 문제가 어디든 연결되어 있고, 수정할 수 있다. → 오류의 범위가 광범위하다.

## 수정 방안

어떤 식으로 객체들을 연결하고 끊을지를 고민해보아야 할 것 같다. 두 가지 기준을 생각해 볼 수 있다.

- 함께 생성되고 수정,삭제되는 객체들만 묶고 가능하면 분리해 볼 수 있다.
- 제약이 존재한다면 함께 묶고 존재하지 않는다면 분리할 수 있다.

분리한 뒤 `Service`에서 다른 `Repository`로 탐색을 한 다음 `id`만을 저장하는 방식을 사용한다면 위 문제점을 해결할 수 있을 것이다.

## 참조

[우아한 객체 지향 영상 - 유투브](https://www.youtube.com/watch?v=dJ5C4qRqAgA&t=2977s)   
[우아한 객체 지향 챕터1 코드 - 깃허브](https://github.com/eternity-oop/Woowahan-OO-01-object-reference)
# JVM, JRE, JDK 관계
![image](https://github.com/wonu606/TIL/assets/133995055/527e578e-63f6-4a47-92da-8e003af2582d)


# JVM (Java Virtual Machine)
자바전용 가상의 컴퓨터이다. 즉, 자바 프로그램이 수행되는 프로세스를 의미한다.

## JVM의 역할
- 운영체제에 국한되지 않고, 자바 바이트코드(Java bytecode)만 있다면 실행될 수 있게 한다.   
  c언어 같은 경우, 운영체제마다 따로 컴파일해주어야 한다. 이 경우 문제가 생길 수도 있다. 예를 들어 window.h 라이브러리를 맥에서 사용할 수 없음   
  하지만 자바는 JVM을 사용할 수 있는 운영체제라면 어떠한 자바 코드라도 실행할 수 있다.
- 메모리 관리를 해준다. 높은 생산성과 적은 오류를 보장한다.

### 자바 바이트코드(Java bytecode)
자바 코드(.java)를 짜서 javac를 실행하면 .class 파일을 생성해준다.
이것이 자바 바이트코드이다.

# JRE (Java Runtime Environment)
자바 실행에 필요한 최소한의 환경을 제공한다.
JVM과 표준 라이브러리를 가지고 있다.
옛날에는 서버에서는 JRE만을 설치하였지만, 최근 JRE를 배포하지 않고 JDK 전체를 다운 받도록 되어있다.

# JDK (Java Development Kit)
Java 애플리케이션 개발을 위해 필요한 도구의 모음이다.
JRE + 개발툴

## 참조
- [자바를 알아보자 (+ JVM, JRE, JDK의 정체) - 얄팍한 코딩사전](https://www.youtube.com/watch?v=OxvtGYvVkRU)
- [Java JDK, JRE and JVM - programiz](https://www.programiz.com/java-programming/jvm-jre-jdk)

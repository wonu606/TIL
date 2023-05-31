# 정규표현식

__regex은 regular expression의 약자로 텍스트에서 원하는 패턴을 찾을 때 사용__

## 구조

| 패턴구분자 시작 | 작성할 패턴 | 패턴 구분자 끝 | flag |  
| :---------: | :------: | :---------: | :--: |
| /           | 패턴      | /           | gm   |

## 패턴

메타문자 + 수량자(Quantifiers), 그룹이나 범위가 지정될 수 있음

### 그룹, 범위

| 문자 | 설명 |
| :-: | :- |
| \| | 또는 |
| () | 그룹 |
| [] | 문자셋, 괄호 안의 어떤 문자일 경우 |
| [^] | 부정 문자셋, 괄호 안의 어떤 문자도 아닌 경우 |
| ?: | 찾지만 기억하지 않음 |

### 수량자(Quantifiers)

| 문자 | 설명 |
| :-: | :- |
| ? | 1개 이하 (zero or one) |
| * | 0개 이상 (zero or more) |
| + | 1개 이상 (one or more) |
| {n} | n번 |
| {min,} | 최소 |
| {min,max} | 최소 그리고 최대 |

### 경계(Boundary-type)

| 문자 | 설명 |
| :-: | :- |
| \b | 단어 경계 |
| \B | 단어 경계가 아닌 |
| ^ | 문장의 시작 |
| $ | 문장의 끝 |

### Character classes
| 문자 | 설명 |
| :-: | :- |
| \ | 특수 문자가 아닌 문자로 표기 |
| . | 어떤 글자 (줄바꿈 문자 제외) |
| \d | digit 숫자 | 
| \D | digit 숫자가 아님 |
| \w | word 문자 |
| \W | word 문자 아님 |
| \s | space 공백 |
| \S | space 공백 아님 |

## 자바 활용

치환, 제거: String.replaceAll(regex, replacement)

### 주의
- String.replaceAll시 Pattern.compile(regex)를 이용하여 새로운 패턴을 만듬   
  반복하여 수행할 경우, 정적으로 만든 패턴에 matcher(String).replace(replacement)를 이용한다면 성능상의 이점을 가져갈 수 있음
- Pattern 클래스는 정적 팩토리 메서드를 사용하여 Thread-safeg하다. 하지만 Matcher 객체는 Thread-safe하지 못하다.   
  그러므로 Pattern 객체의 matcher(String)를 통해 Matcher를 생성한 뒤 사용하는 것이 안전하다.
  
### 코드
- [테스트 코드](https://github.com/wonu606/TIL/blob/main/others/code/src/test/java/com/wonu606/regexTest.java)

## 참조
### 영상
- [드림코딩 - 정규 표현식](https://www.youtube.com/watch?v=t3M6toIflyQ)
- [10분 테코톡 - 정규 표현식](https://www.youtube.com/watch?v=CjoDIgDOHA4)

## 연습
- [드림코딩 - 정규표현식 깃허브 사이트](https://github.com/dream-ellie/regex)
- [프로그래머스 - 정규표현식](https://school.programmers.co.kr/learn/courses/11/11-%EC%A0%95%EA%B7%9C%ED%91%9C%ED%98%84%EC%8B%9D)
- [regexone](https://regexone.com)

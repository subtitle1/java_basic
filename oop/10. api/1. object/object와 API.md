# API (Application Programming Interface)
- 자바를 이용해서 애플리케이션을 구현할 수 있도록 지원하는 `**라이브러리들의 집합**`
- 자바에서는 개발자들의 구현 부담을 최소화 하기 위해서 `시스템, 입출력, 화면처리, 네트워크, 스레드 등을 구현할 때 필요한 인터페이스나 클래스`들을 미리 구현해서 제공하고 있는데 이것을 Java API라고 한다.

# Object 클래스의 주요 메소드
- boolean equals(Object obj): 현재 객체와 전달받은 객체가 동일한 객체인지의 여부 반환
- int hashCode(): 객체의 해시코드 값 반환
- String toString(): 클래스이름@16진수해시코드 값 반환
- Class<?> getClass(): 클래스 정보 반환
- Object clone(): 현재 객체를 복제한 복사본 반환

package main.ch12;

class Parent {
	void parentMethod() {
	}
}

class Child extends Parent {
	@Override
	@Deprecated
	void parentMethod() { // 조상 메서드의 이름을 잘못적음
	}
@FunctionalInterface // 함수형 인터페이스는 하나의 추상 메서드만 가능하다
	interface Testable {
		void test(); // 추상메서드

//		void check(); // 추상메서드
	}
}

public class Ex12_07 {

	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod(); // Deprecated된 메서드 사용
	}

}

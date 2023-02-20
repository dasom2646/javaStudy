package main.ch08;

public class Ex8_01 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4); // 실행되지 않는다.

		} // try-catch문의 끝
		System.out.println(5);
	}
}
// 예외가 발생하지 않았으므로 catch블럭의 문장이 실행되지 않았다
package main.ch08;

public class Ex8_02 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(0 / 0);
			System.out.println(2); // 실행되지 않는다.

		} catch (ArithmeticException ae) {
			System.out.println(3);
		} // try-catch문의 끝
		System.out.println(4);
	}
}
/* 1을 출력한 다음 try블럭에서 예외가 발생했기 했고 try블럭을 바로 벗나기 때문에 2가 출력되지 않는다
 * catch문을 이동하여 문장들을 수행한후 try-catch문을 빠져나오고 
 * 그다음 문장을 실행하여  4를 출력한다 
 */
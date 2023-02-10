package main.ch04;

public class Ex4_08 {
	public static void main(String[] args) {
//		for (int i=1; i<=3; i++) { // 괄호{}안의 문장을 3번 반복
//			System.out.println("Hello");

		int i; // scope(범위) - 선언위치부터 선언된 블럭의 끝까지

		// for (; true ;)  조건식을 생략하면,true로 간주되어 무한 반목문이 됨
		for (i = 1; i <= 10; i++) { // 괄호안의 문장을 10번 반복
			System.out.println("i=" + i);
			
			
		}
		System.out.println(i);
	}
}

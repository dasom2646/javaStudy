package main.ch03;

public class Ex3_9 {
	public static void main(String[] args) {
		double pi = 3.141592; // 3.141을 얻을려면?

		System.out.println(pi * 1000);
		System.out.println((int) (pi * 1000));
		System.out.println((int) (pi * 1000)/1000);
		System.out.println((int) (pi * 1000)/1000.0);

//		System.out.println(Math.round(pi * 1000));
//		System.out.println(Math.round(pi * 1000)/1000); //3
//		System.out.println((double)Math.round(pi * 1000)/1000); //3.14

//		double shortPi = Math.round(pi * 1000) / 1000.0;
//		System.out.println(shortPi);
	}


}

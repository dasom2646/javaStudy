package main.ch13;

public class Ex13_11 {
	static long srartTime = 0;

	public static void main(String[] args) {
		TheadEx11_1 th1 = new TheadEx11_1();
		TheadEx11_2 th2 = new TheadEx11_2();
		th1.start();
		th2.start();
		srartTime = System.currentTimeMillis();
//		try {
//			th1.join(); // main쓰레드가 th1의 작업이 끝날 때까지 기다린다.
//			th2.join(); // main쓰레드가 th1의 작업이 끝날 때까지 기다린다.
//
//		} catch (InterruptedException e) {
//		}
		System.out.println("소요시간:" + (System.currentTimeMillis() - srartTime));

	}
}

class TheadEx11_1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println(new String("-"));
		}
	}// run
}

class TheadEx11_2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	} // run()
}
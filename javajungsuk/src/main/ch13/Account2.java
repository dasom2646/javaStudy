package main.ch13;

public class Account2 {

	private int balance = 1000; // private으로 해야 동기화가 의미가 있다.

	public int getBalnce() {
		return balance;

	}

// 임계영역 
	public synchronized void withdraw(int money) { // synchronized로 메서드를 동기화
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			balance -= money;
		}
	} // withdraw
// 임계영역 
}

class RunnableEx22 implements Runnable {
	Account2 acc = new Account2();

	public void run() {
		while (acc.getBalnce() > 0) { // 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance:" + acc.getBalnce());

		}
	} // run
}

class ThreadEx22 {
	public static void main(String[] args) {
		Runnable r = new RunnableEx22();
		new Thread(r).start();
		new Thread(r).start();

	}
}
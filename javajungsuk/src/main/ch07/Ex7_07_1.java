package main.ch7;

class Ex7_07_1{
	public static void main(String args[]) {

		Car c = new Car();
		FireEngine fe =(FireEngine)c; // 형변환 실행 에러 java.lang.ClassCastException
		fe.water(); // 컴파일 오케이
	}
}

class Car2 {
	String color;
	int door;

	void drive() { // 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() { // 멈추는 기능
		System.out.println("stop!!!");
	}
}

class FireEngine2 extends Car { // 소방차
	void water() { // 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}

package main.ch7;

class Ex7_07 {
	public static void main(String args[]) {

		Car car = null;
		FireEngine fe = new FireEngine(); // 실제 인스턴스가 무엇인지가중요
//		FireEngine fe2 = null;
//
//		fe.water();
//		car = fe; // car = (Car)fe;에서 형변환이 생략됨
////		car.water(); // 에러. Car타입의 참조변수 car로는water() 사용불가
//		
//		fe2 = (FireEngine) car; // 자손타입 ← 조상타입. 형변환 생략 불가
//		fe2.water();

		FireEngine fe2 = (FireEngine) car; // 조상 → 자손으로 형변환
		Car car2 = (Car) fe2; // 자손 → 조상으로 형변환
	}
}

class Car {
	String color;
	int door;

	void drive() { // 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() { // 멈추는 기능
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car { // 소방차
	void water() { // 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}

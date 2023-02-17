package main.ch7.codechobo;

class MyParent {
	private   int prv; // 같은 클래스
			  int dft; // 같은 패키지
	protected int prt; // 같은패키지 + 자손(다른 패키지)
	public    int pub; // 접든제한 없음
	
	public void printMembers() {
		System.out.println(prv); // OK
		System.out.println(dft); // OK
		System.out.println(prt); // OK
		System.out.println(pub); // OK
	}
}

class MyParentTest {
	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); // 에러 범위를 벗어남
		System.out.println(p.dft); // OK
		System.out.println(p.prt); // OK
		System.out.println(p.pub); // OK

	}

}

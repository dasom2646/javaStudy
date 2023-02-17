package main.ch7;

abstract class Player { // 추상클래스
	abstract void play(int pos); // 추상 메서드 (미완성 메서드)

	abstract void stop(); // 추상 메서드(선언부만 있고 구현부{}가 없는 메서드)

}

// 추상클래스는 상속을 통해 환성해야 객체 생성가능
class AudioPlayer extends Player {
	void play(int pos) {
		System.out.println(pos + "위치부터 p1ay합니다");
	}

	void stop() {
		System.err.println("재생을 멈춥니다.");
	}
}

public class PlayerTest {
	public static void main(String[] args) {
//		Player p = new Player();	// 에러 추상클래스는 객체생성X
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
	}

}

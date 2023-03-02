package main.ch14;

import java.util.stream.Stream;

public class Ex14_0_4 {

	public static void main(String[] args) {
////		IntStream intStream = new Random().ints(); // 무한스트림
//		IntStream intStream = new Random().ints(10, 5, 10); // 무한스트림
//		intStream
////		.limit(10) // 10개만 자르기
//		.forEach(System.out::println);
		
		
		//iterate(T seed, UnaryOperate f) 단항연산자
		Stream<Integer> intStream = Stream.iterate(0, n -> n + 2);
		intStream.limit(10).forEach(System.out::println);

		// generate(Supplier s) : 주기만 하는것 입력X, 출력O
		Stream<Integer> oneStream = Stream.generate(() -> 1);
		oneStream
//		.limit(10)
		.forEach(System.out::println);
		
	}

}

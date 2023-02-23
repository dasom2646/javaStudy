package main.ch12;

import java.util.ArrayList;

public class GenericsTest {

	public static void main(String[] args) {
		ArrayList <Object>list = new ArrayList<Object>();
		list.add(10); // list.add(new Integer(10));
		list.add(20);
		list.add(30); // 타입 체크가 강화됨

//		Integer i = (Integer) list.get(2); // 컴파일 OK
		String i = (String)list.get(2); // 형변환 생략 가능
		
		System.out.println(list);
	}

}

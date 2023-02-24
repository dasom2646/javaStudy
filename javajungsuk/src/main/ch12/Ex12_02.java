package main.ch12;

import java.util.*;

public class Ex12_02 {
	public static void main(String[] args) {
		ArrayList<Student1> list = new ArrayList<Student1>();
		list.add(new Student1("자바왕", 1, 1));
		list.add(new Student1("자바짱", 1, 2));
		list.add(new Student1("홍길동", 2, 1));

		Iterator<Student1> it = list.iterator();
//		Iterator it = list.iterator();

		while (it.hasNext()) {
//		 Student s = (Student)it.next(); // 지네릭스를 사용하지 않으면 형변환 필요.
//			Student s = it.next();
//			System.out.println(s.name);
//			System.out.println(((Student)it.next()).name); 
			System.out.println(it.next().name); 
		}
	}
}

class Student1 {
	String name = "";
	int ban; // 반
	int no; // 번호

	Student1(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}
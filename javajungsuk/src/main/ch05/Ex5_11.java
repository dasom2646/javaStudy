package main.ch05;

public class Ex5_11 {

	public static void main(String[] args) {
		//            01234
		String str = "ABCDE"; // str.length()는 5
		char ch = str.charAt(4); 
		String str2 = str.substring(1, 4); //BCD
		String str3 = str.substring(1); //1~4
		String str4 = str.substring(1,str.length()); //BCDE
		System.out.println(str4); //BCD

	}

}

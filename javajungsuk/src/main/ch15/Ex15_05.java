package main.ch15;

import java.io.*;

public class Ex15_05 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);

			int data = 0;
			while ((data = fis.read()) != -1)
				fos.write(data);// void wait(int b)
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

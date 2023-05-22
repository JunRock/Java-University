package 입출력스트림;

import java.util.Scanner;
import java.io.*;
public class 문제2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c;
		FileReader fin=null;
		try {
			fin=new FileReader("c:\\Temp\\data10.txt");
			System.out.println("c:\\Temp\\data10.txt를 출력합니다");
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
		}	
		}	
		catch(IOException e) {
			System.out.println("Error");
		}
		sc.close();
	}
}


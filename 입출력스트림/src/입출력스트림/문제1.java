package 입출력스트림;
import java.util.Scanner;
import java.io.*;
public class 문제1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FileWriter fout=null;
		System.out.println("전화번호 입력 프로그램입니다.");
		try {
			fout=new FileWriter("c:\\Temp\\data10.txt");
			while(true) {
				System.out.print("이름 전화번호>>");
				String str=sc.nextLine();
				if(str.equals("그만")) {
					System.out.println("c:\\Temp\\data10.txt에 저장 완료");
					break;
				}
				fout.write(str,0,str.length());
				fout.write("\r\n");
			}
			fout.close();
		}	
	
		catch(IOException e) {
			System.out.println("Error");
		}
		sc.close();
	}
}

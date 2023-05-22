package 입출력스트림;

import java.util.Scanner;
import java.io.*;
public class 문제3 {
	public static void main(String[] args) {
		BufferedReader fr=null;
		File f=new File("c:\\Temp\\data10.txt");
		try {
			fr=new BufferedReader(new FileReader(f));
			System.out.println(f.getPath()+"를 출력합니다.");
			while(true) {
				String line=fr.readLine();
				if(line==null)
					break;
				System.out.println(line);
			}
			fr.close();
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}


package 입출력스트림;
import java.io.*;
import java.util.*;
public class 문제4 {
	public static void main(String[] args) {
		FileReader fr=null;
		File f=new File("c:\\temp\\data10.txt");
		try {
			fr=new FileReader(f);
			Scanner sc=new Scanner(fr);
			System.out.println(f.getPath()+"를 출력합니다.");
			while(sc.hasNext()) {
				String line=sc.nextLine();
				System.out.println(line);
			}
			fr.close();
			sc.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

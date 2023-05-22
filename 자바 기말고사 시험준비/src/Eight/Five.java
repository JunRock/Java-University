package Eight;
import java.util.*;
import java.io.*;
public class Five {
	public static void main(String[] args) {
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Scanner sc=new  Scanner(System.in);
		try {
			System.out.print("첫번째 파일을 입력하시오>>");
			String str=sc.nextLine();
			System.out.println("두번째 파일을 입력하시오>>");
			String str1=sc.nextLine();
			
			fin=new FileInputStream(str);
			fout=new FileOutputStream(str1);
			int c;
			while((c=fin.read())!=-1) {
				fout.write((byte)c);
			}
			System.out.println("copy complete");
			fin.close();
			fout.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}

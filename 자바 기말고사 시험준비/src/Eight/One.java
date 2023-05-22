package Eight;
import java.io.*;
import java.util.*;
import java.util.*;
public class One {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		File f=new File("c:\\temp\\pra.txt");		
		FileWriter fout=null;
		try {
			fout=new FileWriter(f);
			while(true) {
				System.out.print("이름 전화번호>>");
			String str=sc.nextLine();
			if(str.equals("그만"))
				break;
			fout.write(str,0,str.length());
			fout.write("\r\n",0,2);
			}
			fout.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}

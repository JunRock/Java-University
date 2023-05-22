package 시험연습;
import java.util.Scanner;
public class Eight6장 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열을 입력하시오");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			String first=str.substring(0,1);
			String last=str.substring(1);
			str=last+first;
			System.out.println(str);
		}
		sc.close();
	}
}

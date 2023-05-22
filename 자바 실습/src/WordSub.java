import java.util.*;
public class WordSub {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("화면에 문자열을 입력하시오>>	");
		String s=sc.nextLine();
		int len=s.length();
		for(int i=0;i<len;i++) {
			String first=s.substring(0,1);
			String last=s.substring(1);
			s=last+first;
			System.out.println(s);
		}
		sc.close();
	}
}

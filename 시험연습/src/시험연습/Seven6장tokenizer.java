package 시험연습;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Seven6장tokenizer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print(">>");
		String str=sc.nextLine();
		if(str.equals("그만")) {
			System.out.println("종료합니다");
			return ;
		}
		StringTokenizer st=new StringTokenizer(str," ");
		System.out.println("어절개수>>"+st.countTokens());		
		}
	}
}

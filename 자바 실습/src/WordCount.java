import java.util.Scanner;
import java.util.StringTokenizer;
public class WordCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.print(">>");
		String ch=sc.nextLine();
		if(ch.equals("그만")) {
			System.out.println("종료합니다.");
			break;
		}
			
		StringTokenizer st=new StringTokenizer(ch," ");
		int n=st.countTokens();
		System.out.println("토큰 개수>>"+n);
		}
		sc.close();
	}
}

package 시험연습;
import java.util.Scanner;
public class Seven6장sp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String str=sc.nextLine();
			String s[]=str.split(" ");
			System.out.println("어절개수>>"+s.length);
			
		}
	}
}

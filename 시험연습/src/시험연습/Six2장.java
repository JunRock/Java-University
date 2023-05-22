package 시험연습;
import java.util.Scanner;
public class Six2장 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int x=sc.nextInt();
		int a=x/10;
		int b=x%10;
		if(a%3==0&&b%3==0)
			System.out.println("박수짝짝");
		else if(a%3==0||b%3==0)
			System.out.print("박수짝");
		sc.close();
	}
}

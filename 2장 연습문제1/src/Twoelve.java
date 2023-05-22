import java.util.Scanner;
public class Twoelve {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("연산>>");
		int x=sc.nextInt();
		String ch=sc.next();
		int y=sc.nextInt();
		if(ch.equals("+"))
			System.out.println("연산결과>>"+(x+y));
		else if(ch.equals("-"))
			System.out.println("연산결과>>"+(x-y));
		else if(ch.equals("*"))
			System.out.println("연산결과>>"+(x*y));
		else if(ch.equals("/"))
			System.out.println("연산결과>>"+(x/y));
		else
			System.out.println("연산기호 다시 입력");
	}
}

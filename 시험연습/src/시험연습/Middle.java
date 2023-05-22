package 시험연습;
import java.util.Scanner;
public class Middle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 3개 입력");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if((y>x&&x>z)||(x<z&&x>y))
			System.out.println("중간값>>"+x);
		else if((x>y&&y>z)||(z>y&&y>x))
			System.out.println("중간값>>"+y);
		else if((x>z&&z>y)||y>z&&z>x)
			System.out.println("중간값>>"+z);
	}
}

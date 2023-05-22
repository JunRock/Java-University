import java.util.Scanner;
public class Ten {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int rad=sc.nextInt();
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int rad1=sc.nextInt();
		if(((x-rad<=a+rad1)&&(x+rad>=a-rad1))||((y+rad>=b+rad1)&&(y-rad<=b-rad1)))
		{	
			System.out.println("두 원은 서로 겹친다");
		}
		else
			System.out.println("두 원은 서로 안 겹친다");
		sc.close();
	}
}

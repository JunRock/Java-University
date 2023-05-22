import java.util.Scanner;
public class Night {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력");
		int x=sc.nextInt();
		int y=sc.nextInt();
		double rad=sc.nextDouble();
		
		System.out.print("점 입력>>");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		if((a>=(x-rad))&&(a<=(x+rad)))
			if((b>=(y-rad))&&(b<=(y+rad)))			
			System.out.println("점"+a+","+b+"는 원 안에 있다.");
		else
			System.out.println("원 안에 존재하지 않습니다.");
	}
}

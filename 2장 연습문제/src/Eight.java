import java.util.Scanner;
public class Eight {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("x,y 좌표들을 입력하시오");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.print("x1,y1 좌표들을 입력하시오:");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		if((x>=100&&x<=200)&&(y>=100&&y<=200))
		{
			if((x1>=100&&x1<=200)&&(y1>=100&&y1<=200))
				System.out.println("두 직사각형은 겹치지 않습니다.");
		}
		else
			System.out.println("두 직사각형은 서로 겹칩니다.");
		
		sc.close();
	}
}

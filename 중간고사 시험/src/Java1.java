import java.util.Scanner;
public class Java1 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			while(true) {
			System.out.print("연산>>");
			double x=sc.nextDouble();
			String ch=sc.next();
			double y=sc.nextDouble();
			
			if(ch.equals("+"))
				System.out.println((int)x+ch+(int)y+"="+(int)(x+y));
			else if(ch.equals("-"))
				System.out.println((int)x+ch+(int)y+"="+(int)(x-y));
			else if(ch.equals("*"))
				System.out.println((int)x+ch+(int)y+"="+(int)(x*y));
			else if(ch.equals("/")) {
				if(y==0) {
					System.out.println("0으로 나눌 수 없습니다");
					sc.close();
					return ;
				}
				System.out.println((int)x+ch+(int)y+"="+(int)(x/y));
			}				
			else
				System.out.println("연산기호 다시 입력");
		}
	}
}



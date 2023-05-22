package 시험연습;
import java.util.Scanner;
public class Sixteen3장 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[]= {"가위","바위","보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			System.out.print("가위 바위 보>>");
			String s=sc.next();
			if(s.equals("그만")) {
				System.out.println("게임 종료");
				return ;
			}
			int i=(int)(Math.random()*3);
			if(str[i].equals("가위")) {
				System.out.println("com: 가위, user:"+s+"  ");
				if(s.equals("가위"))
					System.out.println("비겼습니다.");
				else if(s.equals("바위"))
					System.out.println("사용자가 이겼습니다.");
				else
					System.out.println("사용자가 졌습니다.");
			}
			
			else if(str[i].equals("바위")) {
				System.out.println("com: 바위, user:"+s);
				if(s.equals("가위"))
					System.out.println("사용자가 졌습니다.");
				else if(s.equals("바위"))
					System.out.println("비겼습니다.");
				else
					System.out.println("사용자가 이겼습니다.");
			}
			
			else {
				System.out.println("com: 보, user:"+s);
				if(s.equals("가위"))
					System.out.println("사용자가 이겼습니다.");
				else if(s.equals("바위"))
					System.out.println("사용자가 졌습니다.");
				else
					System.out.println("비겼습니다.");
			}
			
				
		}
	}
}

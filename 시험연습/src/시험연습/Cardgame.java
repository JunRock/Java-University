package 시험연습;
import java.util.Scanner;
public class Cardgame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("수를 결정하였습니다.");
			int n=(int)(Math.random()*100+1);
			int count=1;
			int low=0;
			int high=99;
			while(true) {				
				System.out.println(low+"-"+high);
				System.out.print(count+">>");
				int x=sc.nextInt();
				if(x>n) {
					System.out.println("더 낮게");
					high=x;
					count++;
					continue;
				}
				else if(x<n) {
					System.out.println("더 높게");
					low=x;
					count++;
					continue;
				}
				else
					System.out.println("맞았습니다.");
				break;
			}
			System.out.print("다시하시겠습니까?>>");
			String str=sc.next();
			if(str.equals("y"))
				continue;
			else if(str.equals("n"))
				return;
		}
	}
}

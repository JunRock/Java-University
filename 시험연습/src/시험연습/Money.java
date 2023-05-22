package 시험연습;
import java.util.Scanner;
public class Money {
	public static void main(String[] args) {
		int [] unit= {50000,10000,1000,500,100,50,10,1};
		Scanner sc=new Scanner(System.in);
		int count;
		System.out.print("금액을 입력하시오");
		int m=sc.nextInt();
		for(int i=0;i<unit.length;i++) {
			count=0;
			count=m/unit[i];
			if(count!=0)
			System.out.println(unit[i]+"원 짜리: "+count+"개");
			m=m%unit[i];
		}
		sc.close();
	}
}

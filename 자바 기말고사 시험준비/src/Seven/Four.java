package Seven;
import java.util.*;
public class Four {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Vector<Integer> v= new Vector<Integer>();
		while(true) {
			int sum=0;
			System.out.print("강수량 입력(0입력시 종료)>>");
			int x=sc.nextInt();
			if(x==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			v.add(x);
			for(int i=0;i<v.size();i++) {
				System.out.print(v.get(i)+" ");
				sum+=v.get(i);
			}
			System.out.println();
			System.out.println("현재 평균>>"+sum/v.size());
		}
	}
}

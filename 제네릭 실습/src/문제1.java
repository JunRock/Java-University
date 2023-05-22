import java.util.*;
public class 문제1 {
	
	public static void printBig(Vector<Integer> v) {
		int big=v.get(0);
		for(int i=0;i<v.size();i++) {
			if(big<v.get(i))
				big=v.get(i);
		}
		
		System.out.println("가장 큰 수는 "+big);
	}
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.print("정수(-1이 아닐때까지)>>");
		while(true) {
			int x=sc.nextInt();
			if(x==-1) {
				break;
			}
			v.add(x);
		}
			
		if(v.size()==0) {
			System.out.println("정수가 아무것도 없습니다.");
			sc.close();
			return;
		}		
		printBig(v);
		sc.close();
	}
}

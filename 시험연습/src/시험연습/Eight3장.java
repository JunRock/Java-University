package 시험연습;
import java.util.Scanner;
public class Eight3장 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n=sc.nextInt();
		int tmp;
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			tmp=(int)(Math.random()*100+1);
			int check=0;
			for(int j=0;j<arr.length;j++) {
				if(tmp==arr[j]) {
					i--;
					break;
				}
			}
			if(check==1) {
				i--;
				continue;
			}
			arr[i]=tmp;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(i%10==0&&i!=0)
				System.out.println();
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}

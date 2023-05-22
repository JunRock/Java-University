package 시험연습;

public class Seven3장 {
	public static void main(String[] args) {
		int []n=new int[10];
		double sum=0;
		for(int i=0;i<n.length;i++) {
			n[i]=(int)(Math.random()*10+1);
			sum+=n[i];
			System.out.print(n[i]+" ");
		}
		System.out.println("평균>>"+sum/n.length);
	}
}

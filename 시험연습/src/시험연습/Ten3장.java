package 시험연습;

public class Ten3장 {
	public static void main(String[] args) {
		int arr[][]=new int[4][4];
		int i,j;
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++)
				arr[i][j]=0;
		}
		
		for(int k=0;k<10;k++) {
			i=(int)(Math.random()*4);
			j=(int)(Math.random()*4);
			if(arr[i][j]!=0) {
				k--;
				continue;
			}
			else
			arr[i][j]=(int)(Math.random()*10+1);
		}
		
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
}

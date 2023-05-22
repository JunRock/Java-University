import java.util.Scanner;
public class Array {
	public static boolean exist(int a[],int i,int r)
	{
		for(int k=0;k<i;k++)
			{
				if(a[k]==r)
					return true;
			}
		return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 몇개를 입력하시겠습니까?");
		int n=sc.nextInt();
		if(n<=0||n>100)
			{
				System.out.print("1~100 사이의 정수를 입력하세요.");
				sc.close();
				return;
			}
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			int r=(int)(Math.random()*100+1);
			if(exist(arr,i,r))			
			{
				i--;
				continue;
			}
			arr[i]=r;
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		
		sc.close();
	}
}

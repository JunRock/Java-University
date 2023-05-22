public class Calculate 
{
	public static void main(String[] args)
	{
		int i,j;// 반복문을 돌릴 두 개의 서로 다른 변수를 선언
		int sum=0;// 계산한 값을 담을 변수 선언, 초기값을 0으로 초기화
		for(i=1;i<=100;i++)// 100번을 반복해야하니 i가1부터 100까지 일때까지 반복
		{
			for(j=1;j<=i;j++)// sum에 더할 값을 나타내는 변수선언, j<=i의 조건은 1+(1+2)+(1+2+3)...(1+..+100)을 위해서 조건을 검
			sum+=j;// j값을 sum에 더해서 값을 초기화함
		}
		System.out.println(sum);// sum에 저장된 값을 출력
	}
}
package card;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Card {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);				
		int k=1;//횟수
		int x=0;
		while(true)
		{
			int n=(int)(Math.random()*99);
			int low=0;//최소
			int high=99;//최대
			System.out.println("수를 결정하였습니다. 맞추어 보세요");			
			k=1;
			while(true)
			{
				System.out.println(low+"-"+high);
				System.out.print(k+">>");
				k++;
				try {
				x=sc.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("잘못된 정수를 입력하였습니다.");
					sc.nextLine();
					k--;
					continue;
				}
				if(x>high||x<low)
				{
					System.out.println("범위를 벗어났습니다.");
					continue;
				}
				else 
				{
					if(n>x)
					{					
						System.out.println("더 높게");
						low=x;
						continue;
					}						
					else if(n<x)
					{
						System.out.println("더 낮게");
						high=x;
						continue;
					}
					else
					{
						System.out.println("맞았습니다");
						break;
					}
				}										
			}
			System.out.print("다시 하시겠습니까?(y/n)>>");
			String ch=sc.next();
			if(ch.equals("y"))
					continue;
			else if(ch.equals("n"))
				break;
			else
				System.out.println("다시 입력하세요");
		}
		sc.close();
	}	
}
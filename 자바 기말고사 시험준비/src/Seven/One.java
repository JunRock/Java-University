package Seven;
import java.util.*;
public class One {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			int x=sc.nextInt();
			if(x==-1)
				break;
			v.add(x);
		}
		int max=v.get(0);
		for(int i=0;i<v.size();i++)
		{
			if(max<v.get(i))
				max=v.get(i);
		}
		int min=v.get(0);
		for(int i=0;i<v.size();i++)
		{
			if(min>v.get(i))
				min=v.get(i);
		}
		
		System.out.println("최대값은"+max);
		System.out.println("최솟값은"+min);
		sc.close();
	}
}

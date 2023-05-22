import java.util.*;
public class 문제2 {
	public static void main(String[] agrs) {
		ArrayList<String> list=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)");
		for(int i=0;i<6;i++) {
			String str=sc.next();
			list.add(str);			
		}
		double sum=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals("A")) {
				sum+=4.0;
			}
			else if(list.get(i).equals("B")) {
				sum+=3.0;
			}
			else if(list.get(i).equals("C")) {
				sum+=2.0;
			}
			else if(list.get(i).equals("D")) {
				sum+=1.0;
			}
			else if(list.get(i).equals("F")) {
				sum+=0.0;
			}
			else {
				if((list.get(i)!="A")||(list.get(i)!="B")||(list.get(i)!="C")||(list.get(i)!="D")||(list.get(i)!="f"))
				{
					System.out.println(list.get(i)+"학점은 존재하지 않습니다");
					continue;
				}
			}
		}
		System.out.println(sum/6);
		sc.close();
		return ;
	}
}

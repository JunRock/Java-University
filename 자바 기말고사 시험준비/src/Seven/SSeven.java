package Seven;
import java.util.*;
public class SSeven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, Double> h= new HashMap<String, Double>();
		System.out.println("미래장학금관리시스템입니다.");
		for(int i=0;i<5;i++) {
			System.out.print("이름과 학점");
			String name=sc.next();
			double grade=sc.nextDouble();
			h.put(name, grade);
		}
		
		System.out.print("장학생 선발 학점 기준 입력>>");
		double d=sc.nextDouble();
		
		Set<String> key=h.keySet();
		Iterator<String> it=key.iterator();
		System.out.print("장학생 명단 : ");
		while(it.hasNext()) {
			String str=it.next();
			double check=h.get(str);
			if(check>d) {
				System.out.print(str+" ");
			}
		}
		sc.close();
	}
}

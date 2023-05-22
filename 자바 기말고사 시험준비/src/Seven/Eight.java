package Seven;
import java.util.*;
public class Eight {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> h=new HashMap<String, Integer>();
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while(true) {
			System.out.print("이름과 포인트 입력>>");
			String name=sc.next();
			if(name.equals("그만"))
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			int point=sc.nextInt();
			if(h.get(name)==null) {
				h.put(name,point);
			}
			else {
				h.put(name, point+h.get(name));
			}
			
			Set<String> key=h.keySet();
			Iterator<String> it=key.iterator();
			
			while(it.hasNext()) {
				String str=it.next();
					System.out.print(str+" "+h.get(str)+"  ");
				}
			System.out.println();
			}
			
			
		}
	}


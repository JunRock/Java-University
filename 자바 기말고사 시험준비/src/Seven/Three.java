package Seven;
import java.util.*;
public class Three {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		System.out.println("나라이름과 인구를 입력하세요");
		while(true) {
			System.out.print("나라 이름, 인구 >>");
			String str=sc.next();
			if(str.equals("그만"))
				break;
			int people=sc.nextInt();
			h.put(str, people);
		}
		
		while(true) {
			System.out.print("인구 검색>>");
			String str=sc.next();
			if(str.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
				
			Integer p=h.get(str);
			if(p==null)
				System.out.println(str+"의 이름은 없습니다.");
			else
				System.out.println(str+"의 인구는"+p);
		}
		sc.close();
	}
}

import java.util.*;
public class 문제3 {
	public static void main(String[] args) {
		HashMap<String, Integer> h=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000");
		while(true) {
			System.out.print("나라, 인구>>");
			String country=sc.next();
			if(country.equals("그만"))
				break;
			int p=sc.nextInt();
			h.put(country, p);
		}
		
		while(true) {
			System.out.print("인구 검색>>");
			String str=sc.next();
			if(str.equals("그만")) {
				sc.close();
				return ;
			}
			
			Integer n=h.get(str);//key값을 찾아서 n에 값을 저장
			if(n==null)//키 값이 없을 경우 n에는 null이 대입
				System.out.println(str+"의 나라는 없습니다");
			else
				System.out.println(str+"의 인구는 "+n);
		}
	}
}

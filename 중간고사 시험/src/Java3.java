import java.util.*;
public class Java3 {
	public static void main(String[] args) {
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // 한 라인을 문자열로 읽는다.
		StringBuffer sb = new StringBuffer(str);
		
		while(true) {
			System.out.print("명령: ");
			String s = sc.nextLine(); // 한 라인을 문자열로 읽는다.
			if(s.equals("그만")) {
				System.out.print("종료합니다");
				break;
			}
			String [] tokens = s.split("!");
			if(tokens.length != 2) {
				System.out.println("잘못된 명령입니다!");
			}
			else {
				if(tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("잘못된 명령입니다!");
					continue;
				}
				
				int index = sb.indexOf(tokens[1]);
				if(index == -1) {
					System.out.println("찾을 수 없습니다!");
					continue;
				}
				
				StringBuffer sb1=new StringBuffer(tokens[1]);
				if(tokens[0].equals("reverse")) {
					sb1.reverse();				
					tokens[1]=sb1.toString();
					sb.replace(index, index+tokens[1].length(),tokens[1]);
				}
				else if(tokens[0].equals("delete")) {
					sb.delete(index,index+tokens[1].length());
				}
				System.out.println(sb.toString());
			}
		}		
		sc.close();
}
}
	

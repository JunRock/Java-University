import java.util.*;
public class WordChange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열을 입력하시오>>");
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		while(true) {
			System.out.println("명령: ");
			String cmd=sc.nextLine();
			if(cmd.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String [] tokens=cmd.split("!");
			if(tokens.length!=2) {
				System.out.println("잘못된 명령입니다.");
			}
			
			else {
				if((tokens[0].length()==0)||(tokens[1].length()==0)) {
					System.out.println("잘못된 명령입니다");
					continue;
				}
					
				int index=sb.indexOf(tokens[0]);
				if(index==-1) {
					System.out.println("substring not about");
					continue;
				}
				sb.replace(index,index+tokens[0].length(),tokens[1]);
				System.out.println(sb.toString());
			}
		}
		sc.close();
	}
}

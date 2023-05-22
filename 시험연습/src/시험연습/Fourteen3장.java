package 시험연습;
import java.util.Scanner;
public class Fourteen3장 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String course[]= {"Java","C++","Htmls","컴퓨터구조","안드로이드"};
		int score[]= {95,88,76,62,55};
		while(true) {
			System.out.print("과목이름>>");
			String name=sc.next();
			for(int i=0;i<course.length;i++) {
				if(name!=null) {
				if(name.equals(course[i]))
					{
						System.out.println(name+"과목의 점수는 "+score[i]);
						break;
					}
				if(name.equals("그만"))
					return;
				}
				System.out.println("없는 과목입니다.");
				break;
			}	
			
		}
	}
}

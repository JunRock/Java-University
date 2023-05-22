package Seven;
import java.util.*;

class Student{
	String Id,major,num,average;
	public Student(String Id,String major,String num,String average) {
		this.Id=Id;
		this.major=major;
		this.num=num;
		this.average=average;
	}
	public void setId(String Id) {
		this.Id=Id;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	public void setNum(String num) {
		this.num=num;
	}
	public void setAverage(String average) {
		this.average=average;
	}
	
	public String getId() {
		return Id;
	}
	public String getNum() {
		return num;
	}
	public String getMajor() {
		return major;
	}
	public String getAverage() {
		return average;
	}
}

public class Five {
	Scanner sc=new Scanner(System.in);
	public void run() {
		String Id;
		String major;
		String num;
		String average;
	
		ArrayList<Student> a=new ArrayList<Student>(2);
		System.out.println("학생이름, 학과, 학번, 학점 평균을 입력하세요.");
		for(int i=0;i<2;i++) {
			String str=sc.nextLine();
			StringTokenizer st=new StringTokenizer(str,",");
			Id=st.nextToken();
			major=st.nextToken();
			num=st.nextToken();
			average=st.nextToken();
			a.add(new Student(Id, major, num, average));
		}
	
		for(int i=0;i<a.size();i++) {
			System.out.print("이름:"+a.get(i).getId());
			System.out.print("학과:"+a.get(i).getMajor());
			System.out.print("학번:"+a.get(i).getNum());
			System.out.print("평균:"+a.get(i).getAverage());
		}
		System.out.println("----------------------------------------------");
		while(true) {
			System.out.print("학생이름>>");
			String name=sc.next();
			if(name.equals("그만"))
				break;
			for(int i=0;i<a.size();i++) {
				if(a.get(i).getId().equals(name))
					System.out.print(a.get(i).getId()+","+a.get(i).getMajor()+","+a.get(i).getNum()+","+a.get(i).getAverage());
			}
			
		}
	}
	
	public static void main(String[] args) {
		Five five=new Five();
		five.run();
	}
}

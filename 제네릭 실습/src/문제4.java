import java.util.*;
class Student{
	private String name,major,num,grade;
	public Student(String name,String major,String num,String grade) {
		this.name=name;
		this.major=major;
		this.num=num;
		this.grade=grade;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	public void setNum(String num) {
		this.num=num;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public String getNum() {
		return num;
	}
	public String getGrade() {
		return grade;
	}
}

public class 문제4 {
	private Scanner sc=new Scanner(System.in);
	private ArrayList<Student> list=new ArrayList<Student>();
	String name,major,num,grade;
	public void run() {
		read();
		System.out.println("--------------------------------------");
		printAll();
		processQuery();
	}
	
	private void read() {
		System.out.println("학생 이름, 학과, 학점, 학점평균을 입력하세요");
		
		for(int i=0;i<4;i++) {
			System.out.print(">>");
			String text=sc.nextLine();
			StringTokenizer st=new StringTokenizer(text,",");
				name=st.nextToken();
				major=st.nextToken();
			    num=st.nextToken();
				grade=st.nextToken();
		
			Student student=new Student(name,major,num,grade);
			list.add(student);
		}
	}
	
	private void printAll() {//저장되어있는 것을 출력
		for(int i=0;i<list.size();i++) {
		System.out.println("이름>>"+list.get(i).getName());
		System.out.println("학과>>"+list.get(i).getMajor());
		System.out.println("학번>>"+list.get(i).getNum());
		System.out.println("학점평균>>"+list.get(i).getGrade());
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		}
	}
	
	private void processQuery() {
		
		while(true) {
			System.out.print("학생 이름>>");
			String name=sc.next();
			if(name.equals("그만")) {
				sc.close();
				return ;
			}
			if(name!=null) {
				int count=0;
			for(int i=0;i<list.size();i++) {
				
				if(name.equals(list.get(i).getName()))
					{
					System.out.println(list.get(i).getName()+","+list.get(i).getMajor()+","+list.get(i).getNum()+","+list.get(i).getGrade());
					count++;
					}				
			}
			if(count==0)
				System.out.println("찾는사람은 없습니다.");
			}			
		}
	}
	
	public static void main(String[] args) {
		문제4 answer=new 문제4();
		answer.run();
	}
}

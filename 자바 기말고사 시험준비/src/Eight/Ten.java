package Eight;
import java.util.*;
import java.io.*;
public class Ten {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		File f=new File("c:\\temp\\pra.txt");
		BufferedReader br=null;
		HashMap<String, String> h=new HashMap<String, String>();
		int count=0;
		try {
			br=new BufferedReader(new FileReader(f));
			while(true) {
				String str=br.readLine();
				if(str==null) break;
				StringTokenizer st=new StringTokenizer(str," ");
				
				String name=st.nextToken();
				String num=st.nextToken();
				
				h.put(name, num);
				count++;
			}
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("총 "+count+"개의 전화번호를 읽었습니다");
		while(true) {
			System.out.print("이름>>");
			String search_name=sc.next();
			
			if(search_name.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			Set<String> key=h.keySet();
			Iterator<String> it=key.iterator();
			int c=0;
			while(it.hasNext()) {
				String str1=it.next();
				if(search_name.equals(str1))
					{
					 String ko=h.get(search_name);
						System.out.println(ko);
						c++;
					}
			}
			if(c==0)
				System.out.println("없습니다");
			
		}
		sc.close();
	}
}

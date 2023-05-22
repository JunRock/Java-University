package Seven;
import java.util.*;

class Location{
	String country;
	int width,height;
	public Location(String country,int width,int height) {
		this.country=country;
		this.width=width;
		this.height=height;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}

public class Six {
	Scanner sc=new Scanner(System.in);
	public void run() {
		HashMap<String ,Location> h=new HashMap<String, Location>();
		String country;
		int width;
		int height;
		System.out.println("도시, 경도, 위도를 입력하세요");
		for(int i=0;i<4;i++) {
			System.out.print(">>");
			String str=sc.nextLine();
			StringTokenizer st=new StringTokenizer(str,",");
			
			country=st.nextToken();
			width=Integer.parseInt(st.nextToken()); 
			height=Integer.parseInt(st.nextToken()); 
			
			h.put(country, new Location(country, width, height));
		}
		
		Set<String> key= h.keySet();
		Iterator<String> it=key.iterator();
		
		while(it.hasNext()) {
			String city=it.next();
			Location a=h.get(city);
			System.out.println(a.getCountry()+" "+a.getWidth()+" "+a.getHeight());
		}
		
		System.out.println("-------------------------------");
		while(true) {
			System.out.print("도시 이름>>");
			String city=sc.next();
			if(city.equals("그만"))
			{
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			it=key.iterator();
			while(it.hasNext()) {
				Location as=h.get(city);
				if(it.next().equals(city))
					System.out.println(as.getCountry()+" "+as.getWidth()+" "+as.getHeight());
			}
		}
	}
	
	public static void main(String[] args) {
		Six six=new Six();
		six.run();
	}
}

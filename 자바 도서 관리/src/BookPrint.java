import java.io.*;
import java.util.*;
public class BookPrint {
	ArrayList<String> str=new ArrayList<String>();
	private String str1;
	public String getStr1() {
		return str1;
	}
	
	public void setStr1(String str1) {
		this.str1=str1;
	}
	public BookPrint() {//파일에 있는 내용을 arraylist에 저장
		
		
		try {
			FileReader fin=new FileReader("c:\\Temp\\Book.txt");
			BufferedReader br=new BufferedReader(fin);
			while(true) {
				String rear=br.readLine();
				
				if(rear==null)
					break;
				str.add(rear);		
			}
			fin.close();
			br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String Print(int i){
		return str.get(i); 
	}
}


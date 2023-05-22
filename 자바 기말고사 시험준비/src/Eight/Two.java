package Eight;
import java.io.*;
import java.util.ArrayList;
public class Two {
	public static void main(String[] args) {
		File f=new File("c:\\temp\\pra.txt");
		FileReader fin=null;
		BufferedReader br=null;
		ArrayList<String> a=new ArrayList<String>();
		try {
			br=new BufferedReader(new FileReader(f));
			int c;
			while(true) {
				String str=br.readLine();
				if(str==null) break;
				a.add(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
	}
}

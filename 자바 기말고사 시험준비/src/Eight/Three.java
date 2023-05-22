package Eight;
import java.io.*;
public class Three {
	public static void main(String[] args) {
		File f=new File("c:\\temp\\pra.txt");
		FileReader fin=null;
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader(f));
			while(true) {
				String str=br.readLine();
				if(str==null)break;
				
				str=str.toUpperCase();
				System.out.println(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

package Eight;
import java.io.*;
import java.util.Vector;
public class Four {
	public static void main(String[] args) {
		File f=new File("c:\\temp\\pra.txt");
		FileReader fin=null;
		BufferedReader br=null;
		int count=1;
		Vector<String> v= new Vector<String>();
		try {
			br=new BufferedReader(new FileReader(f));
			while(true) {
				String str=br.readLine();
				if(str==null) break;
				System.out.println(count+":"+str);
				count++;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

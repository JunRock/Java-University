import java.io.*;
import java.util.StringTokenizer;

import javax.swing.*;
public class Edit_BookInfo {
    public Edit_BookInfo(int index,String str[]) {
        try{
            File f = new File("c:\\temp\\Book.txt");

            FileReader fr = new FileReader(f);

            BufferedReader buf = new BufferedReader(fr);
            String line = "";

            while((line = buf.readLine()) != null) {
                String dummy = "";

                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
                    
                    String line2;

                    for(int j=0; j<index; j++) {
                        line2 = br.readLine();
                        dummy += (line2 + "\r\n" );

                    }
                    
                    String deldat = br.readLine();
                    for(int i=0;i<5;i++)
                    {
                        dummy += (str[i] +"/");
                    }
                    dummy += ("\r\n");
                    
                    while((line2 = br.readLine())!=null) {

                        dummy += (line2 + "\r\n" );

                    }
                    
                    FileWriter fw = new FileWriter(f);

                    fw.write(dummy);

                    fw.close();

                    br.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch(IOException e) {
            System.exit(0);
        }
    }


}


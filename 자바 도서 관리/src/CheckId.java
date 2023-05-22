import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CheckId{
   private Scanner scanner = new Scanner(System.in);
   private ArrayList<Admin> am = new ArrayList<Admin>();
   private String[] admin = new String[10];
   public void check(){
      FileReader fin = null;
      BufferedReader br = null;
      File f = new File("C:\\도서 관리 프로그램 txt\\admin.txt");
      try {
         fin = new FileReader(f);
         br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
         int n = 0;
         String readLine = null;
         while((readLine = br.readLine())!=null) {
            admin[n] = readLine;
            n++;
         }
         
         for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(admin[i],"/");
            String id = st.nextToken();
            String pw = st.nextToken();
            Admin ad = new Admin(id, pw);
            am.add(ad);
         }
         
         while(true) {
            System.out.print("아이디>>");
            String inputId = scanner.nextLine();
            System.out.print("패스워드>>");
            String inputPw = scanner.nextLine();
            int end = 0;
            int count = 0;
            for(int i = 0; i < am.size(); i++) {
               if(am.get(i).getId().equals(inputId)) {
                  if(am.get(i).getPw().equals(inputPw)) {
                     System.out.println("로그인 성공!!");
                     end = 1; //로그인 성고이 종료하기 위한 변수
                     break;
                  }
                  else if(!am.get(i).getPw().equals(inputPw)) {
                     System.out.println("패스워드 불일치!!");
                     break;
                  }
               }
               else {
                  count++;
                  continue;
               }
            }
            if(count == am.size())
               System.out.println("존재하지 않는 아이디!!");
            if(end == 1)
               break;
            
            fin.close();
            br.close();
         }
      }
      catch(IOException e) {
         System.out.println("입출력 오류");
      }
   }
}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SearchBook{
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> al = new ArrayList<String>();
    private ArrayList<BookInfo> bi = new ArrayList<BookInfo>();
    public void search() {
      File f = new File("C:\\Temp\\Book.txt");
      BufferedReader br = null;
      FileReader fr = null;
      
      try {
         fr = new FileReader(f);
         br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
         String readLine = null;
         int n = 0;
         while((readLine=br.readLine())!=null) {         
            al.add(readLine);
            n++;
         }         
         
         for(int i = 0; i < n; i++) {
            BookInfo b2 = new BookInfo();
            String text = al.get(i);
            StringTokenizer st2 = new StringTokenizer(text,"/");
            
            String bCat = st2.nextToken();
            String bId = st2.nextToken();
            String bTitle = st2.nextToken();
            String bAut = st2.nextToken();
            String bPub = st2.nextToken();
            
            b2.setCategory(bCat);
            b2.setBookId(bId);
            b2.setTitle(bTitle);
            b2.setAuthor(bAut);
            b2.setPublisher(bPub);
            
            bi.add(b2);
         }
         
         br.close();
         fr.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
    
    public boolean Bookre_cat(String str) {
              for(int i = 0; i < bi.size(); i++) {
                  if(bi.get(i).getCategory().equals(str)) {
                    return true;
          
                  }
              }
              return false;
    	  }
             
    public void Bookre_id(String str) {
    	 for(int i = 0; i < bi.size(); i++) {
             if(bi.get(i).getBookId().equals(str)) {
                System.out.println(al.get(i));
                break;
             }
             else{
                if(i == (bi.size()-1))
                System.out.println("검색한 도서번호를 찾을 수 없습니다.");
           }
         }
    }
    
    public void Bookre_title(String str) {
    		for(int i = 0; i < bi.size(); i++) {
             if(bi.get(i).getTitle().equals(str)) {
                System.out.println(al.get(i));
                break;
             }
             else {
                if(i == (bi.size()-1))
                System.out.println("검색한 도서명을 찾을 수 없습니다.");
             }
         }
    }
    
    public void Bookre_author(String str) {
         for(int i = 0; i < bi.size(); i++) {
             if(bi.get(i).getAuthor().equals(str)) {
                System.out.println(al.get(i));
                break;
             }
             else {
                if(i == (bi.size()-1))
                System.out.println("검색한 작가명을 찾을 수 없습니다.");
             }
         }
    }
    
    public void Bookre_pub(String str) {
    	System.out.print("검색할 출판사를 입력하시오>>");
        String inputPublisher = scanner.nextLine();
        for(int i = 0; i < bi.size(); i++) {
            if(bi.get(i).getPublisher().equals(inputPublisher)) {
               System.out.println(al.get(i));
               break;
            }
            else {
               if(i == (bi.size()-1))
               System.out.println("찾을 수 없습니다.");
            }
        }
    }
}
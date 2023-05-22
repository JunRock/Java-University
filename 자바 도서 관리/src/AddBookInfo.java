import java.io.*;
import java.util.*;

public class AddBookInfo {
   Scanner s = new Scanner(System.in);
  public BookInfo b = new BookInfo();
   public AddBookInfo() {}
   
   public void Add_File() {
     String s5 = b.getBookId();
     String s6 = "\r\n";
   try {
	   FileWriter fout = new FileWriter("c:\\Temp\\Book.txt",true);
   String s1 = b.getCategory();
   String s2 = b.getTitle();
   String s3 = b.getAuthor();
   String s4 = b.getPublisher();
   fout.write(s1,0,s1.length());
   fout.write("/");
   fout.write(s5);
   fout.write("/");
   fout.write(s2);
   fout.write("/");
   fout.write(s3);
   fout.write("/");
   fout.write(s4);
   fout.write(s6);
   fout.close();
   }
   catch(IOException e) {
      System.out.println("C:\\Users\\khlee\\OneDrive\\바탕 화면\\자바시험공부\\BookInformation.txt에 저장할 수 없었습니다. 경로명을 확인해주세요!");
      System.exit(0);
      }
   return;
   }
}

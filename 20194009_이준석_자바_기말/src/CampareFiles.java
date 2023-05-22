import java.util.*;
import java.io.*;

public class CampareFiles {
	
   public static void main(String[] args) {
      FileInputStream dst = null;
      FileInputStream src = null;
      Scanner sc = new Scanner(System.in);
      while(true)
      {
         try {
        	 System.out.println("전체 경로면이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
            System.out.print("첫번째 파일을 입력하시오>>");
            String str = sc.nextLine();
            if(str.equals("그만"))
            {
               System.out.println("프로그램을 종료합니다.");
               break;
            }
            dst = new FileInputStream(str);            
            System.out.print("두번째 파일을 입력하시오>>");
            String str1 = sc.nextLine();         
            System.out.println(str+"와"+str1+"를 비교합니다.");
            src = new FileInputStream(str1);
            int dst1;
            int src1;
            int count = 0;
            while (true) {
            	dst1 = dst.read();
            	src1 = src.read();
               if(dst1==-1||src1==-1)
               {   
                  if(dst1!=src1)
                  {
                     count++;
                     System.out.println("파일이 다릅니다");
                     break;
                  }
                  break;
               }
               if ((char) dst1 == (char) src1 && (dst1 == src1)) {
                  continue;
               } 
               else {
                  count++;
                  System.out.println("파일이 다릅니다");
                  break;
               }
            }
            
            if (count == 0)
               System.out.println("파일이 같습니다.");

            dst.close();
            src.close();
         } 
         
         catch (IOException e) {
            System.out.println("not exist File");
         }
      }
      
      sc.close();
   }
}
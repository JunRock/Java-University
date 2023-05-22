import java.util.HashMap;
import java.util.Scanner;

public class CountryManager{
   public static void main(String[] args) {
      HashMap<String, Country> h=new HashMap<>();
      Scanner sc = new Scanner(System.in);
      int num;
      String country;
      String capital;
      while(true) {
         System.out.print("1. 입력, 2. 검색, 3. 종료 >> ");
         num=sc.nextInt();
         if(num==1) {
            System.out.print("국가와 수도를 입력하시오.>> ");
            country=sc.next();
            capital=sc.next();
            Country c=new Country(country,capital);
            
            if(h.get(country)!=null) {
               System.out.println("[중복국가]");
               System.out.println();
            }
            
            else {
               h.put(country,c);
               System.out.println("[등록완료]");
               System.out.println();
            }
         }
         
         else if(num==2) {
            System.out.print("국가명을 입력하시오.>>");
            country=sc.next();
            if(h.get(country)==null) {
               System.out.println("[자료 없음]");
               System.out.println();
            }
            else {
               System.out.println(country+"의 수도는 "+h.get(country).getCapital()+"입니다.");
               System.out.println();
            }
         }
         
         else if(num==3) {
            System.out.println("[종료]");
            break;
         }
         
         else {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println();
         }
         
      }
      sc.close();
   }
}

class Country{
   private String country;
   private String capital;
   
   public Country(String country,String capital) {
      this.country=country;
      this.capital=capital;
   }
   
   public String getCountry() {
      return country;
   }
   
   public String getCapital() {
      return capital;
   }
}
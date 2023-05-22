import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;
class Signup extends JFrame{
   private String id;
   private String password;
   public Signup() {};
   public Signup(String id,String password) {
      this.id=id;
      this.password=password;
   }
   
  /* public void setId(String id) {
      this.id=id;
   }
   
   public void setPassword(String password) {
      this.password=password;
   }
   
   public String getId() {
      return id;
   }
   public String getPassword() {
      return password;
   }*/
   
   public void Signuprun() {
      try {
      FileWriter fout=new FileWriter("c:\\Temp\\admin.txt");
      while(true) {
      Scanner sc=new Scanner(System.in);
      System.out.print("이름을 입력하세요:");
      id=sc.nextLine();
      System.out.print("비밀번호을 입력하세요:");
      password=sc.nextLine();
      if(id.length()==0)
         break;
      if(password.length()==0)
         break;
      fout.write(id,0,id.length());
      fout.write("/");
      fout.write(password,0,password.length());
      fout.write("\r\n");   
   }
      fout.close();
   }
   
   catch(IOException e) {
      System.out.println("error");
   }
   }
}
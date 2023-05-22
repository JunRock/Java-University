import javax.management.ValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Login extends JFrame {
	 private ArrayList<Admin> am = new ArrayList<Admin>();
	 private String[] admin = new String[10];
	// Tabbed1 tabbed=new Tabbed1();
	 TabbedLogin t1=new TabbedLogin();
	public Login() {
		CheckId checkid=new CheckId();
		JPanel LoginPage=new JPanel();
		LoginPage.setLayout(null);
		
		JButton login=new JButton("LOGIN");			
		login.setBounds(250, 100, 150, 50);
		login.setFont(new Font("굴림", Font.PLAIN, 23));
		
		LoginPage.add(login);
		add(LoginPage);
		
		JLabel id=new JLabel("ID");
		JLabel pw=new JLabel("PW");
		id.setFont(new Font("굴림", Font.PLAIN, 23));
		id.setHorizontalAlignment(SwingConstants.CENTER);
		id.setBounds(120, 170, 80, 34);
		pw.setFont(new Font("굴림", Font.PLAIN, 23));
		pw.setHorizontalAlignment(SwingConstants.CENTER);
		pw.setBounds(120, 220, 80, 34);
	
		LoginPage.add(id);
		LoginPage.add(pw);
		
		JTextPane Id = new JTextPane();
		Id.setBounds(200,170, 100, 34);
		LoginPage.add(Id);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(200, 220, 100, 34);
		LoginPage.add(passwordField);
		
		setSize(700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("로그인 화면 ");
		setLocationRelativeTo(null);
		setVisible(true);
		
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id=Id.getText();
				String pw=passwordField.getText();
				FileReader fin = null;
			      BufferedReader br = null;
			      File f = new File("C:\\temp\\admin.txt");
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
			             String id1 = st.nextToken();
			             String pw1 = st.nextToken();
			             Admin ad = new Admin(id1, pw1);
			             am.add(ad);
			          }
			         int count = 0;
			         for(int i=0;i<am.size();i++) {
			        	 if(id.equals(am.get(i).getId()))
			        			 {
			        		 		if(pw.equals(am.get(i).getPw())) {
			        		 		JOptionPane.showMessageDialog(null, "로그인 성공!");
			        		 		LoginPage.setVisible(false);
			        		 		dispose();
			        		 		t1.TabbedLogin1();
			        		 		dispose();
			        		 		break;
			        			 }
			        		 		else {
			        		 			JOptionPane.showMessageDialog(null, "로그인 실패!");
			        	                     break;
			        	                  }
			        		 		}
			        	
			        	 else {
			        		 count++;
			        		 continue;
			        	 }
			         }
			         if(count == am.size())
			        	 JOptionPane.showMessageDialog(null, "존재하지 않는 아이디!");
			        	
			      }
			
			catch(IOException e1) {
		    	  e1.printStackTrace();
		      }
		}});
	}
}


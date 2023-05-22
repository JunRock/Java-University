import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Signup extends JFrame {

	private JFrame frame;
	private JTextField IdField;
	private JPasswordField passwordField;

	
	public Signup() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JPanel SignupPage = new JPanel();
		SignupPage.setBounds(0, 0, 616, 363);
		frame.getContentPane().add(SignupPage);
		SignupPage.setLayout(null);
		
		SignupPage.setVisible(true);
		add(SignupPage);
		JLabel IDLabel = new JLabel("ID : ");
		IDLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		IDLabel.setBounds(131, 124, 72, 34);
		SignupPage.add(IDLabel);
		
		JLabel PwLabel = new JLabel("Pw : ");
		PwLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		PwLabel.setBounds(131, 168, 72, 34);
		SignupPage.add(PwLabel);
		
		IdField = new JTextField();
		IdField.setBounds(180, 124, 166, 31);
		SignupPage.add(IdField);
		IdField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(180, 168, 166, 31);
		SignupPage.add(passwordField);
		
		JButton EnterButton = new JButton("입력완료");
		EnterButton.setBounds(384, 143, 180, 54);
		SignupPage.add(EnterButton);
		EnterButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				FileWriter fout=new FileWriter("C:\\Temp\\admin.txt");
				String id;
				char[] pw;
				id=IdField.getText();
				pw=passwordField.getPassword();
				fout.write(id,0,id.length());
				fout.write(pw,0,pw.length);
				SignupPage.setVisible(false);
				
				}
				catch(IOException e1) {
					System.out.println("error");
				}
			}
		});
	}


	
}

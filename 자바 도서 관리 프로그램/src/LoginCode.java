import java.util.Scanner;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

class LoginCode extends JFrame{
	private JFrame frame;
	public LoginCode() {
		JPanel p = new JPanel();
		frame=new JFrame();
		frame.setBounds(100, 100, 679, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
				try {
					LoginCode window = new LoginCode();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
		JPanel LoginPage = new JPanel();
		LoginPage.setBounds(0, 0, 665, 442);
		frame.getContentPane().add(LoginPage);
		LoginPage.setLayout(null);
		
		JButton Login = new JButton("Login");
		Login.setBounds(177, 139, 269, 93);
		Login.setFont(new Font("굴림", Font.PLAIN, 23));
		LoginPage.add(Login);
		
		JButton Signup = new JButton("Signup");
		Signup.setFont(new Font("굴림", Font.PLAIN, 26));
		Signup.setBounds(177, 259, 269, 93);
		LoginPage.add(Signup);
		LoginPage.setVisible(true);
		
		Signup.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginPage.setVisible(false);
				//IdPage.setVisible(false);
				//SignupPage.setVisible(true);
				Signup s=new Signup();
			}
			
		});
	}
	
}
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoginPage {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Login = new JPanel();
		Login.setBounds(0, 0, 616, 363);
		frame.getContentPane().add(Login);
		Login.setLayout(null);
		
		JButton LoginButton = new JButton("Login");
		LoginButton.setFont(new Font("굴림", Font.PLAIN, 29));
		LoginButton.setBounds(221, 93, 174, 87);
		Login.add(LoginButton);
		
		JButton SignupButton = new JButton("Signup");
		SignupButton.setFont(new Font("굴림", Font.PLAIN, 26));
		SignupButton.setBounds(221, 191, 174, 87);
		Login.add(SignupButton);
		
		SignupButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Login.setVisible(false);
					Signup s=new Signup();
				}
		});
	}
}

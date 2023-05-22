import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Gui extends Main {

	private static final ActionListener ActionListener = null;
	private JFrame frame;
	private JPasswordField Pw;
	private JTextPane Id;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
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
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 679, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 665, 432);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("도서");
		lblNewLabel_2.setBounds(80, 114, 50, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("분야");
		lblNewLabel_2_1.setBounds(80, 158, 50, 15);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("도서번호");
		lblNewLabel_2_2.setBounds(80, 198, 50, 15);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("New label");
		lblNewLabel_2_2_1.setBounds(80, 238, 50, 15);
		panel.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("New label");
		lblNewLabel_2_2_2.setBounds(80, 279, 50, 15);
		panel.add(lblNewLabel_2_2_2);
		
		textField = new JTextField();
		textField.setBounds(117, 111, 96, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(117, 155, 96, 21);
		panel.add(textField_1);
		
		JPanel SignupPage = new JPanel();
		SignupPage.setBounds(0, 0, 665, 432);
		frame.getContentPane().add(SignupPage);
		SignupPage.setLayout(null);
		
		JTextPane 알림문구 = new JTextPane();
		알림문구.setFont(new Font("굴림", Font.ITALIC, 29));
		알림문구.setText("이름과 비밀번호를 입력하세요");
		알림문구.setBounds(128, 94, 410, 54);
		SignupPage.add(알림문구);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(195, 188, 189, 34);
		SignupPage.add(textPane_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(194, 250, 189, 34);
		SignupPage.add(passwordField);
		
		JButton BackButton1 = new JButton("뒤로가기");
		BackButton1.setBounds(409, 331, 180, 48);
		SignupPage.add(BackButton1);
		
		JButton Enter = new JButton("입력완료");
		Enter.setFont(new Font("굴림", Font.PLAIN, 24));
		Enter.setBounds(416, 209, 173, 41);
		SignupPage.add(Enter);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(111, 188, 80, 34);
		SignupPage.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PW :  ");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(109, 250, 69, 34);
		SignupPage.add(lblNewLabel_1);
		SignupPage.setVisible(false);
		
		JPanel IdPage = new JPanel();
		IdPage.setBounds(0, 0, 665, 432);
		frame.getContentPane().add(IdPage);
		IdPage.setLayout(null);
		
		Pw = new JPasswordField(100);
		Pw.setBounds(150, 182, 195, 44);
		IdPage.add(Pw);
		
		Id = new JTextPane();
		Id.setBounds(146, 128, 199, 44);
		IdPage.add(Id);
		
		JTextPane txtpnId = new JTextPane();
		txtpnId.setFont(new Font("Candara Light", Font.BOLD | Font.ITALIC, 38));
		txtpnId.setText("ID");
		txtpnId.setBounds(79, 127, 55, 45);
		IdPage.add(txtpnId);
		
		JTextPane txtpnPw = new JTextPane();
		txtpnPw.setText("PW");
		txtpnPw.setBounds(78, 179, 60, 47);
		IdPage.add(txtpnPw);
		
		JButton BackButton = new JButton("뒤로가기");
		BackButton.setBounds(393, 333, 195, 38);
		IdPage.add(BackButton);
		IdPage.setVisible(false);
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
		Login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginPage.setVisible(false);
				IdPage.setVisible(true);
			}
			
		});
		LoginPage.setVisible(true);
		Signup.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginPage.setVisible(false);
				IdPage.setVisible(false);
				SignupPage.setVisible(true);
			}
			
		});
		
		BackButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginPage.setVisible(true);
				IdPage.setVisible(false);
			}
		});
		
		BackButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginPage.setVisible(true);
				SignupPage.setVisible(false);
				
			}
		});
		
		
		Enter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginPage.setVisible(true);
				SignupPage.setVisible(false);
			}
		});
		
	}
}

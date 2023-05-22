import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
class Deletepanel extends JPanel {
	DeleteBookInfo deleteBookInfo=new DeleteBookInfo();
	public Deletepanel() {
		//JPanel DeletePage=new JPanel();
		setLayout(null);
		
		JButton enter=new JButton("입력완료");
		enter.setBounds(207, 351, 137, 38);
		enter.setFont(new Font("굴림", Font.PLAIN, 23));
		add(enter);
		
		JButton back=new JButton("뒤로가기");
		back.setBounds(622, 351, 131, 38);
		back.setFont(new Font("굴림", Font.PLAIN, 23));
		add(back);
		
		JLabel 도서번호=new JLabel("도서번호");
		도서번호.setFont(new Font("굴림", Font.PLAIN, 20));
		도서번호.setHorizontalAlignment(SwingConstants.CENTER);
		도서번호.setBounds(52, 146, 95, 30);
		add(도서번호);
		//add(DeletePage);
		
		JTextPane Num = new JTextPane();
		Num.setBounds(153, 140, 248, 38);
		add(Num);
		
		/*setSize(800, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("도서 삭제");
		setLocationRelativeTo(null);*/
		setVisible(true);
		
		enter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(deleteBookInfo.road_BookInfo(Num.getText())==true)
					JOptionPane.showMessageDialog(null, "도서가 삭제되었습니다");
					else
						JOptionPane.showMessageDialog(null, "해당 도서가 존재하지 않습니다.");
						setVisible(false);
				new PrintMenu();
				
				
			}
		});
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new PrintMenu();
				
			}
		});
	}
}

public class Delete extends JFrame{
	public Deletepanel d1=null;
}

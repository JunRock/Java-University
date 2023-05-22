import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
class Addpanel extends JPanel {
	//Tabbed tabbed=new Tabbed();
	public Addpanel() {
		AddBookInfo addBookInfo=new AddBookInfo();
		BookPrint bookPrint=new BookPrint();
		//JPanel AddPage=new JPanel();
		/*AddPage.*/setLayout(null);
		JLabel 분야=new JLabel("분야");
		JLabel 도서번호=new JLabel("도서번호");
		JLabel 책제목=new JLabel("책 제목");
		JLabel 작가=new JLabel("작가");
		JLabel 출판사=new JLabel("출판사");
		add(분야);
		add(도서번호);
		add(책제목);
		add(작가);
		add(출판사);
		//add(AddPage);
		
		
		분야.setFont(new Font("굴림", Font.PLAIN, 20));
		분야.setHorizontalAlignment(SwingConstants.CENTER);
		분야.setBounds(87, 93, 66, 30);
		
		도서번호.setFont(new Font("굴림", Font.PLAIN, 20));
		도서번호.setHorizontalAlignment(SwingConstants.CENTER);
		도서번호.setBounds(52, 146, 95, 30);
		
		책제목.setFont(new Font("굴림", Font.PLAIN, 20));
		책제목.setHorizontalAlignment(SwingConstants.CENTER);
		책제목.setBounds(64, 201, 95, 30);
		
		작가.setFont(new Font("굴림", Font.PLAIN, 20));
		작가.setHorizontalAlignment(SwingConstants.CENTER);
		작가.setBounds(75, 257, 95, 30);
		
		출판사.setFont(new Font("굴림", Font.PLAIN, 20));
		출판사.setHorizontalAlignment(SwingConstants.CENTER);
		출판사.setBounds(64, 311, 95, 30);
		
		JTextPane cat = new JTextPane();
		cat.setBounds(153, 85, 248, 38);
		add(cat);
		
		JTextPane Num = new JTextPane();
		Num.setBounds(153, 140, 248, 38);
		add(Num);
		
		JTextPane Title = new JTextPane();
		Title.setBounds(153, 193, 248, 38);
		add(Title);
		
		JTextPane Author = new JTextPane();
		Author.setBounds(153, 249, 248, 38);
		add(Author);
		
		JTextPane Publisher = new JTextPane();
		Publisher.setBounds(153, 303, 248, 38);
		add(Publisher);
		
		JButton enter=new JButton("입력완료");
		enter.setBounds(207, 351, 137, 38);
		enter.setFont(new Font("굴림", Font.PLAIN, 23));
		
		JButton back=new JButton("뒤로가기");
		back.setBounds(622, 351, 131, 38);
		back.setFont(new Font("굴림", Font.PLAIN, 23));
		
		add(enter);
		add(back);
		
		JTextArea Memo = new JTextArea();
		Memo.setBounds(449, 10, 304, 331);
		add(Memo);
		
		/*setSize(800, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("도서 추가 ");
		setLocationRelativeTo(null);*/
		setVisible(true);
		
		
		
		enter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i=0;
				addBookInfo.b.setCategory(cat.getText());
				addBookInfo.b.setBookId(Num.getText());
				addBookInfo.b.setTitle(Title.getText());
				addBookInfo.b.setAuthor(Author.getText());
				addBookInfo.b.setPublisher(Publisher.getText());
				addBookInfo.Add_File();				
				
				JOptionPane.showMessageDialog(null, "도서가 추가되었습니다.");
				//Addpanel.repaint();
				//new Tabbed();
			}
		});
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new PrintMenu();
				
				
			}
		});
	}
}

public class Add extends JFrame{
	public Addpanel ad=null;
}

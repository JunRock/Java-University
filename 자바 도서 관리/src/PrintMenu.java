import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PrintMenu extends JFrame{
	
	public PrintMenu() {
		JPanel PrintMenu_page=new JPanel();
		PrintMenu_page.setLayout(null);
		JButton search=new JButton("검색");
		JButton add=new JButton("추가");
		JButton delete=new JButton("삭제");
		JButton logout=new JButton("로그아웃");
		JButton editor=new JButton("수정");
		
		logout.setBounds(500, 200, 131, 38);
		logout.setFont(new Font("굴림", Font.PLAIN, 23));
		PrintMenu_page.add(logout);
		
		search.setBounds(30, 80, 80, 50);
		search.setFont(new Font("굴림", Font.PLAIN, 23));
		PrintMenu_page.add(search);
		add(PrintMenu_page);
		
		add.setBounds(30, 140, 80, 50);
		add.setFont(new Font("굴림", Font.PLAIN, 23));
		PrintMenu_page.add(add);
		
		delete.setBounds(30,200, 80, 50);
		delete.setFont(new Font("굴림", Font.PLAIN, 23));
		PrintMenu_page.add(delete);		
		
		editor.setBounds(500, 80, 131, 38);
		editor.setFont(new Font("굴림", Font.PLAIN, 23));
		PrintMenu_page.add(editor);
		
		setSize(700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("메뉴 창 ");
		setLocationRelativeTo(null);
		setVisible(true);
		
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PrintMenu_page.setVisible(false);
				new Add();
				dispose();
			}
		});
		
		delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PrintMenu_page.setVisible(false);
				new Delete();
				dispose();
			}
		});
		
		logout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Login();
				dispose();
			}
		});
		
		search.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Search();
				dispose();
			}
		});
		
		editor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Editor();
				dispose();
			}
		});
	}
}

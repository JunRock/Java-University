import javax.swing.*;
public class Tabbed1 extends JFrame{
	//private JFrame frame=new JFrame();
	
	public Addpanel a1=new Addpanel();
	public Searchpanel s1=new Searchpanel();
	public Deletepanel d1=new Deletepanel();
	public Editorpanel e1=new Editorpanel();
	JTabbedPane tabbedPane=new JTabbedPane();
	
	public Tabbed1(int count) {	
		tabbedPane.addTab("도서 추가", a1);
		tabbedPane.addTab("도서 검색", s1);
		tabbedPane.addTab("도서 삭제", d1);
		tabbedPane.addTab("도서 수정", e1);
		tabbedPane.removeTabAt(count);
		if(count==0)
			tabbedPane.addTab("도서 추가", a1);
		else if(count==1)
			tabbedPane.addTab("도서 검색", s1);
		else if(count==2)
			tabbedPane.addTab("도서 삭제", d1);
		else if(count==3)
			tabbedPane.addTab("도서 수정", e1);
		
		tabbedPane.setSelectedIndex(count);
		
		add(tabbedPane);
		setSize(800, 450);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("도서 관리 프로그램12");
		setLocationRelativeTo(null);
		
	}	
}

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class TabbedLogin extends JFrame{
	public JFrame frame=new JFrame();
	
	public Addpanel a1=new Addpanel();
	public Searchpanel s1=new Searchpanel();
	public Deletepanel d1=new Deletepanel();
	public Editorpanel e1=new Editorpanel();
	JTabbedPane tabbedPane=new JTabbedPane();
	public void TabbedLogin1() {

			tabbedPane.addTab("도서 추가", a1);
			tabbedPane.addTab("도서 검색", s1);
			tabbedPane.addTab("도서 삭제", d1);
			tabbedPane.addTab("도서 수정", e1);
			frame.add(tabbedPane);
			frame.setSize(800, 450);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("도서 관리 프로그램");
			frame.setLocationRelativeTo(null);
	}
	
	public JFrame tt() {
		return frame;
	}
	
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ClickPracticeFrame extends JFrame{
	public ClickPracticeFrame() {
		setTitle("클릭 연습 용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(null);
		JLabel label=new JLabel("C");
		c.add(label);
		
		label.setLocation(100, 100);
		label.setSize(20,20);
		 
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JLabel la=(JLabel) e.getSource();
				Container c=la.getParent();
				int panelwidth=c.getWidth()-la.getWidth();
				int panelheight=c.getHeight()-la.getHeight();
				int x=(int)(Math.random()*panelwidth);
				int y=(int)(Math.random()*panelheight);
				la.setLocation(x, y);
			}			
		});
		
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ClickPracticeFrame();
	}
}

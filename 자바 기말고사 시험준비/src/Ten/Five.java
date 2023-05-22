package Ten;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class Five extends JFrame{
	public Five() {
		setTitle("크기 조절");
		setSize(300,300);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JLabel j=new JLabel("Love Java");
		j.setFont(new Font("Arial",Font.PLAIN,10));
		c.add(j);
		
		
		
		c.addKeyListener(new KeyAdapter() {			
			@Override
			public void keyPressed(KeyEvent e) {
				Font font=j.getFont();
				int size=font.getSize();
				if(e.getKeyChar()=='+') {
					j.setFont(new Font("Arial",Font.PLAIN,size+5));
				}
				else if(e.getKeyChar()=='-') {
					j.setFont(new Font("Arial",Font.PLAIN,size-5));
				}
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Five();
	}
}

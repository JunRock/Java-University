package Ten;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
public class Seven extends JFrame{
	public Seven() {
		setTitle("롤링 연습");
		setSize(300,300);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j=new JLabel("Love Java");
		j.setSize(20,20);
		j.setFont(new Font("Arial",Font.PLAIN,15));
		c.add(j);
		j.addMouseWheelListener(new MouseWheelListener() {
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n=e.getWheelRotation();
				Font f=j.getFont();
				int size=f.getSize();
				
				if(n>0) {
					j.setFont(new Font("Arial",Font.PLAIN,size+5));
				}
				else
					j.setFont(new Font("Arial",Font.PLAIN,size-5));
			}
		});
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Seven();
	}
}
	
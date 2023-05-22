package Ten;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Six extends JFrame{
	public Six() {
		setTitle("클릭연습");
		setSize(300,300);
		Container c=getContentPane();
		c.setLayout(null);
		
		JLabel j=new JLabel("c");
		j.setBounds(100, 100, 20, 20);
		j.setFont(new Font("Arial",Font.PLAIN,20));
		c.add(j);
		j.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				//JLabel a=(JLabel)e.getSource();
				int x=(int)(Math.random()*getWidth()-20);
				int y=(int)(Math.random()*getHeight()-20);
				j.setLocation(x, y);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Six();
	}
}

package Nine;
import javax.swing.*;
import java.awt.*;
public class Six extends JFrame{
	JLabel []j=new JLabel[20];
	public Six() {
		setTitle("random");
		setSize(300,300);
		Container c=getContentPane();
		c.setLayout(null);
		for(int i=0;i<j.length;i++) {
		
			int x=(int)(Math.random()*200)+50;
			int y=(int)(Math.random()*200)+50;
			j[i]=new JLabel("a");
			j[i].setLocation(x, y);
			j[i].setSize(10,10);
			j[i].setBackground(Color.YELLOW);
			j[i].setOpaque(true);
			c.add(j[i]);
		}
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Six();
	}
}

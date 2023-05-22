package Nine;
import javax.swing.*;
import java.awt.*;
public class Five extends JFrame{
	JLabel []j=new JLabel[16];
	Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
			Color.CYAN, Color.BLUE, Color.MAGENTA, 
			Color.GRAY, Color.PINK, Color.LIGHT_GRAY,
			Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
			Color.CYAN, Color.BLUE};
	public Five() {
		setTitle("color practice");
		setSize(500,500);
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,4));
		for(int i=0;i<j.length;i++) {
			j[i]=new JLabel(Integer.toString(i));
			j[i].setBackground(col[i]);
			j[i].setOpaque(true);
			c.add(j[i]);
		}
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Five();
	}
}

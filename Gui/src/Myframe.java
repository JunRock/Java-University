import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;
public class Myframe extends JFrame{
	public Myframe() {
		setTitle("Let's study Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		c.add(new JButton("add"));
		c.add(new JButton("add"));
		c.add(new JButton("add"));
		c.add(new JButton("add"));
		setSize(400, 200);
		setVisible(true);
	}	
	
	public static void main(String[] args) {
		new Myframe();
	}
}

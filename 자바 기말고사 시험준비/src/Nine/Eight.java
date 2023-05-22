package Nine;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Eight extends JFrame{
	public Eight() {
		setTitle("pra");
		setSize(300,300);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new panel_north1(),BorderLayout.NORTH);
		c.add(new panel_center1(),BorderLayout.CENTER);
		c.add(new panel_south1(),BorderLayout.SOUTH);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Eight();
	}
}

class panel_north1 extends JPanel{
	public panel_north1() {
		setLayout(new FlowLayout());
		setBackground(Color.GRAY);
		add(new JLabel("수식입력"));
		add(new JTextField(10));
		setVisible(true);
	}
}

class panel_center1 extends JPanel{
	JLabel []j=new JLabel[10];
	public panel_center1() {
		setLayout(null);
		for(int i=0;i<j.length;i++) {
			j[i]=new JLabel("*");
			int x=(int)(Math.random()*150);
			int y=(int)(Math.random()*150);
			
			j[i].setLocation(x, y);
			j[i].setSize(10,10);
			add(j[i]);
		}
		setVisible(true);
	}
}

class panel_south1 extends JPanel{
	public panel_south1() {
		setLayout(new FlowLayout());
		setBackground(Color.YELLOW);
		add(new JLabel("계산 결과"));
		add(new JTextField(10));
		setVisible(true);
	}
}
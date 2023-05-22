import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;
public class GridLayOutEx extends JFrame{
	public GridLayOutEx() {
		Container c=getContentPane();
		c.setLayout(new GridLayout(1,10,5,5));
		JButton[] btn=new JButton[10];
		Color[] color= {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.CYAN,Color.BLUE,Color.MAGENTA,Color.GRAY,Color.PINK,
				Color.LIGHT_GRAY};
		for(int i=0;i<btn.length;i++) {
			btn[i]=new JButton(Integer.toString(i));
			btn[i].setOpaque(true);
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}
		setSize(500,200);
		setTitle("GridLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayOutEx();
	}
}

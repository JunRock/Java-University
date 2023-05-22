import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
public class Calculator extends JFrame{
	public Calculator() {
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new SouthPanel(),BorderLayout.SOUTH);
		c.add(new CenterPanel(),BorderLayout.CENTER);
		c.add(new NorthPanel(),BorderLayout.NORTH);
		
		setSize(300,300);
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}

class SouthPanel extends JPanel{
	public SouthPanel() {
		setBackground(Color.YELLOW);
		setOpaque(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel("계산결과"));
		add(new JTextField(15));
	}
}

class CenterPanel extends JPanel{
	public CenterPanel() {
		setBackground(Color.WHITE);
		setLayout(new GridLayout(4,4,5,5));
		JButton[] btn=new JButton[10];
		for(int i=0;i<btn.length;i++) {
			btn[i]=new JButton(Integer.toString(i));
			add(btn[i]);
		}
		
		add(new JButton("CE"));
		add(new JButton("계산"));
	
		add(new JButton("+")).setBackground(Color.CYAN);
		add(new JButton("-")).setBackground(Color.CYAN);
		add(new JButton("*")).setBackground(Color.CYAN);
		add(new JButton("/")).setBackground(Color.CYAN);
	}
}

class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setOpaque(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel("수식 입력"));
		add(new JTextField(15));
	}
}

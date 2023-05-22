package Eleven;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Nine extends JFrame {
	public Nine() {
		setTitle("가위 바위 보");
		setSize(500,500);
		
	}	
	
	public static void main(String[] args) {
		new Nine();
	}
}

class north_panel extends JPanel{
	int i;
	public north_panel() {
		setLayout(new FlowLayout());
		JButton []b=new JButton[3];
		for(i=0;i<b.length;i++) {
			b[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int index=i;
					
				}
			});
			
			add(b[i]);
		}
		
		
		setBackground(Color.GRAY);
		setVisible(true);
	}
}

class south_panel extends JPanel{
	public south_panel() {
		setLayout(new FlowLayout());
		JLabel mei=new JLabel();
		JLabel comi=new JLabel();
		JLabel me=new JLabel("me");
		JLabel com=new JLabel("com");
		
		add(mei);
		add(me);
		add(comi);		
		add(com);
		setBackground(Color.YELLOW);
		setVisible(true);
	}
}
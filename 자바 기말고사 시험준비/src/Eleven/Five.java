package Eleven;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
public class Five extends JFrame{
	public Five() {
		setTitle("슬라이더");
		setSize(500,500);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider js=new JSlider(JSlider.HORIZONTAL,100,200,150);
		js.setPaintLabels(true);
		js.setPaintTrack(true);
		js.setPaintTicks(true);
		js.setMajorTickSpacing(20);
		js.setMinorTickSpacing(5);
		c.add(js);
		JLabel check=new JLabel();
		check.setText(Integer.toString(js.getValue()));
		check.setBackground(Color.GREEN);
		check.setOpaque(true);
		c.add(check);
		
		js.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				int n=js.getValue();
				check.setText(Integer.toString(n));
			}
		});
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Five();
	}
}

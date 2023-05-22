package Eleven;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
public class Seven extends JFrame{
	  //항상 전역변수로 선언할수록 좋음
	public Seven() {
		 setTitle("JSlider");
		 setSize(500,500);
		 Container c=getContentPane();
		 c.setLayout(new BorderLayout());
		
		 JSlider js=new JSlider(JSlider.HORIZONTAL,1,100,50);
		 js.setPaintLabels(true);
		 js.setPaintTicks(true);
		 js.setPaintTrack(true);
		 js.setMajorTickSpacing(20);
		 js.setMinorTickSpacing(5);
		 c.add(js,BorderLayout.NORTH);
		 
		 JLabel j1=new JLabel(" I Love Java ");
		 j1.setFont(new Font("Arial",Font.PLAIN,js.getValue()));
		 j1.setHorizontalAlignment(JLabel.CENTER);
		 c.add(j1,BorderLayout.CENTER);
		 js.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				Font f=j1.getFont();
				int size=f.getSize();
				j1.setFont(new Font("Arial",Font.PLAIN,js.getValue()));
				
			}
		});
		 
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Seven();
	}
}

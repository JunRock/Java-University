package Eleven;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Six extends JFrame{
	public Six() {
		setTitle("슬라이더");
		setSize(300,300);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextArea ja=new JTextArea(10,20);
		c.add(ja);
		
		JSlider js=new JSlider(JSlider.HORIZONTAL,0,100,0);
		js.setPaintLabels(true);
		js.setPaintTicks(true);
		js.setPaintTrack(true);
		js.setMajorTickSpacing(20);
		js.setMinorTickSpacing(5);
		c.add(js);
		
		ja.addKeyListener(new KeyAdapter() {			
			@Override
			public void keyPressed(KeyEvent e) {
				String text=ja.getText();
				if(text.length()<=100)
					js.setValue(text.length());
				else
					{
						text=text.substring(0,99);
						ja.setText(text);
					}
				
			}
		});
		js.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				String text=ja.getText();
				if(text.length()<=js.getValue()) {
					js.setValue(text.length());
				}
				else {
					ja.setText(text.substring(0,js.getValue()));
				}
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Six();
	}
}

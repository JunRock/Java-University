package Eleven;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class Ten extends JFrame{
	JLabel []j=new JLabel[10];
	int nowindex=0;
	int i;
	public Ten() {
		setTitle("순서대로 클릭");
		setSize(300,300);
		
		Container c=getContentPane();
		c.setLayout(null);
		
		for(i=0;i<j.length;i++) {
			j[i]=new JLabel(Integer.toString(i));
			j[i].setSize(10,10);
			int x=(int)(Math.random()*200);
			int y=(int)(Math.random()*200);
			j[i].setLocation(x, y);
			j[i].setVisible(true);
			c.add(j[i]);
			
			j[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					JLabel a=(JLabel)e.getSource();
					int num=Integer.parseInt(a.getText());
					if(num==nowindex) {
						a.setVisible(false);
						nowindex++;
					}
					
					if(nowindex==10) {
						nowindex=0;
						for(int i=0;i<j.length;i++) {
							int x=(int)(Math.random()*200);
							int y=(int)(Math.random()*200);
							j[i].setLocation(x, y);
							j[i].setVisible(true);
						}
					}
				}
			});
		}
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ten();
	}
}


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class MouseEvent1 extends JFrame{
	public MouseEvent1() {
		setTitle("마우스 올리기 내리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label=new JLabel("사랑해");
		
		label.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				JLabel la =(JLabel) e.getSource();
				la.setText("Love Java");
			}
			
			public void mouseExited(MouseEvent e) {
				JLabel la =(JLabel)e.getSource();
				la.setText("사랑해");
			}
		});
		c.add(label);
		setSize(250,250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseEvent1();
	}
}

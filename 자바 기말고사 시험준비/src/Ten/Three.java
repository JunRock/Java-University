package Ten;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Three extends JFrame{
	public Three() {
		setTitle("문자열교체");
		setSize(300,300);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j=new JLabel("Love Java");
		c.add(j);
		StringBuffer st=new StringBuffer("Love Java");
		
		c.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					if(j.getText().equals("Love Java")) {
						j.setText(st.reverse().toString());
					}
					
					else
						j.setText(st.reverse().toString());
				}
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Three();
	}
}

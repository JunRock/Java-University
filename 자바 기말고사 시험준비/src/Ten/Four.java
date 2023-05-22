package Ten;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Four extends JFrame{
	public Four() {
		setTitle("문자열 이동");
		setSize(500,500);
		
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j=new JLabel("Love Java");
		c.add(j);
		c.addKeyListener(new KeyAdapter() {			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					String text=j.getText();
					j.setText(text.substring(1)+text.charAt(0));
				}
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Four();
	}
}

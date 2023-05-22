package Ten;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class One extends JFrame{
	public One() {
		setTitle("마우스 올리기 내리기");
		setSize(300,300);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JLabel j=new JLabel("Love Java");
		c.add(j);
		
		j.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				JLabel a=(JLabel)e.getSource();
				if(a.getText().equals("사랑해"))
					a.setText("Love Java");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel a=(JLabel)e.getSource();
				if(a.getText().equals("Love Java"))
					a.setText("사랑해");
			}
		});
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new One();
	}
}

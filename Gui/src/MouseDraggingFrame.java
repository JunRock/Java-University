import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MouseDraggingFrame extends JFrame{

	public MouseDraggingFrame() {
		super("드래깅하는 동안 Yellow로 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		MyMouseListener ml=new MyMouseListener();
		c.addMouseMotionListener(ml);
		c.addMouseListener(ml);
		
		
		c.setBackground(Color.GREEN);
		setSize(300,300);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter{
		public void mouseDragged(MouseEvent e)
		{
			JComponent c=(JComponent)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			JComponent c=(JComponent)e.getSource();
			c.setBackground(Color.GREEN);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MouseDraggingFrame();
	}

}

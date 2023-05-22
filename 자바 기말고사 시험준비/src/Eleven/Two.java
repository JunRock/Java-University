package Eleven;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Two extends JFrame{
	public Two() {
		setTitle("콤보박스");
		setSize(300,300);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField jf=new JTextField(15);
		c.add(jf);
		
		JComboBox<String> cb=new JComboBox<String>();
		c.add(cb);
		jf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str=jf.getText();
				cb.addItem(str);
				jf.setText("");
			}
		});
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Two();
	}
}

package Eleven;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class One extends JFrame{
	public One() {
		setTitle("checkbox");
		setSize(300,300);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JCheckBox jc1=new JCheckBox("버튼 비활성화");
		JCheckBox jc2=new JCheckBox("버튼 감추기");
		c.add(jc1);
		c.add(jc2);
		JButton but=new JButton("test button");
		c.add(but);
		
		jc1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
					but.setEnabled(false);
				else
					but.setEnabled(true);
			}
		});
		jc2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
					but.setVisible(false);
				else
					but.setVisible(true);
			}
		});
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new One();
	}
}

package Eleven;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Three extends JFrame{
	public Three() {
		setTitle("money");
		setSize(300,300);
		setContentPane(new Mypanel());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class Mypanel extends JPanel{
		private JTextField source;
		private JTextField [] tf=new JTextField[8];
		
		private int	[] unit= {50000,10000,1000,500,100,50,10,1};
		private String [] text= {"오만원","만원","천원","500원","100원","50원","10원","1원"};	
		public Mypanel() {
			setBackground(Color.PINK);
			setLayout(null);
			
			JLabel la=new JLabel("금액");
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50,20);
			la.setLocation(20,20);
			add(la);
			
			source=new JTextField(30);
			source.setSize(100, 20);
			source.setLocation(100, 20);
			add(source);
			
			JButton enter=new JButton("계산");
			enter.setSize(70, 20);
			enter.setLocation(210, 20);
			add(enter);
			
			for(int i=0;i<text.length;i++)
			{
				la=new JLabel(text[i]);
				la.setHorizontalAlignment(JLabel.LEFT);
				la.setSize(50, 20);
				la.setLocation(50, 50+i*20);
				add(la);
				
				tf[i]= new JTextField(30);
				tf[i].setHorizontalAlignment(JTextField.CENTER);
				tf[i].setSize(70, 20);
				tf[i].setLocation(120, 50+i*20);
				add(tf[i]);
			}
			
			enter.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String str=source.getText();
					if(str.length()==0)
						return;
					int money=Integer.parseInt(str);
					int result=0;
					for(int i=0;i<unit.length;i++)
					{
						result=money/unit[i];
						tf[i].setText(Integer.toString(result));
						if(result>0)
						money%=unit[i];
						
					}
				}
			});
			}
	}

	public static void main(String[] args) {
		new Three();
	}
}



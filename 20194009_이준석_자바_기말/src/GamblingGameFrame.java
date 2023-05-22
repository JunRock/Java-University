import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class GamblingGameFrame extends JFrame{
   JLabel first_la, second_la, third_la, resultText;
   public GamblingGameFrame() {
	  setTitle("Open Chanllenge");
      Container c=getContentPane();
      c.setLayout(null);
  
      c.addKeyListener(new KeyAdapter() {
    		@Override
    		public void keyPressed(KeyEvent e) {
    			  if(e.getKeyChar() == '\n') {
    				  first_la.setText((int)(Math.random()*5)+"");
    				  second_la.setText((int)(Math.random()*5)+"");
    				  third_la.setText((int)(Math.random()*5)+"");
    		            if(first_la.getText().equals(second_la.getText())) {
    		               if(second_la.getText().equals(third_la.getText())) {
    		            	   resultText.setText("축하합니다!");
    		               }
    		               else
    		            	   resultText.setText("아쉽네요");
    		            }
    		            else
    		            	resultText.setText("아쉽네요");         
    		         }
    		      }
    		}
    	);
      first_la = new JLabel((int)(Math.random()*5)+"",SwingConstants.CENTER);
      second_la = new JLabel((int)(Math.random()*5)+"",SwingConstants.CENTER);
      third_la = new JLabel((int)(Math.random()*5)+"",SwingConstants.CENTER);
      resultText = new JLabel("시작합니다.",SwingConstants.CENTER);
      
      first_la.setBackground(Color.MAGENTA);
      first_la.setForeground(Color.yellow);
      first_la.setSize(100,50);
      first_la.setLocation(40,80);
      first_la.setFont(new Font("Tahoma",Font.ITALIC,30));
      first_la.setOpaque(true);
      
      second_la.setBackground(Color.MAGENTA);
      second_la.setForeground(Color.yellow);
      second_la.setSize(100,50);
      second_la.setLocation(180,80);
      second_la.setFont(new Font("Tahoma",Font.ITALIC,30));
      second_la.setOpaque(true);
      
      third_la.setBackground(Color.MAGENTA);
      third_la.setForeground(Color.yellow);
      third_la.setSize(100,50);
      third_la.setLocation(320,80);
      third_la.setFont(new Font("Tahoma",Font.ITALIC,30));
      third_la.setOpaque(true);
      
      resultText.setSize(300,50);
      resultText.setLocation(80,150);
     
      c.add(first_la);
      c.add(second_la);
      c.add(third_la);
      c.add(resultText);
      setSize(500,300);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      c.setFocusable(true);
      c.requestFocus();
      
   }
   public static void main(String[] args) {
	   new GamblingGameFrame();
   }
}
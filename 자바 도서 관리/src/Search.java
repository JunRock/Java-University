import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
class Searchpanel extends JPanel{
	  SearchBook searchBook=new SearchBook();
	  File f = new File("C:\\Temp\\Book.txt");
      BufferedReader br = null;
      BufferedReader br2 = null;
      FileReader fr = null;
      JTextField insert=new JTextField();
      int n = 0;
      
	public Searchpanel() {
		//JPanel SearchPage = new JPanel();
		setLayout(null);
		
		String[] str= {"분야","도서번호","책 제목","작가","출판사"};
		JComboBox<String> select=new JComboBox<String>(str);
		select.setBounds(50, 20, 137, 38);
		add(select);
		
		JButton enter=new JButton("입력완료");
		enter.setBounds(600, 20, 137, 38);
		enter.setFont(new Font("굴림", Font.PLAIN, 23));
		add(enter);
		
		JButton back=new JButton("뒤로가기");
		back.setBounds(400, 20, 137, 38);
		back.setFont(new Font("굴림", Font.PLAIN, 23));
		add(back);
		
		insert.setBounds(200,20,150,38);
		add(insert);
		 try {
	         fr = new FileReader(f);
	         br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
	         String readLine = null;
	         
	         while((readLine=br.readLine())!=null) {   
	            n++;
	         }  
		 }
	         catch(IOException e) {
	        	 e.printStackTrace();
	         }
		
		String []header=new String[]{"분야","도서번호","책 제목","저자","출판사"};
		String [][]contents=new String[n][5];
		
		 int i=0;
		 try {
	         fr = new FileReader(f);
	         br2 = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
	         String readLine = null;
	         
	         while((readLine=br2.readLine())!=null) {   
	        	 StringTokenizer st=new StringTokenizer(readLine,"/");
	        	 for(int a=0;a<5;a++)
	        	   contents[i][a]=st.nextToken();
	           i++;
	         }  
		 }
	         catch(IOException e) {
	        	 e.printStackTrace();
	         }
		 DefaultTableModel model=new DefaultTableModel(contents,header);
		 JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 80, 750, 300);
		add(scrollPane);
		
		scrollPane.setViewportView(table);
		//add(SearchPage);
		
		table.getTableHeader().setReorderingAllowed(false);
		/*setSize(800, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("도서 검색");
		setLocationRelativeTo(null);*/
		
		setVisible(true);
		
		enter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index=select.getSelectedIndex();
				String tmp=insert.getText();
		    	
				
				table.getModel();
				int row=table.getRowCount();
				for(int i=row-1;i>=0;i--)//기존에 있는 목록 삭제
					model.removeRow(i);
				for(int i=0;i<n;i++)
		    	{
		    		if(contents[i][index].equals(tmp))
		    			model.addRow(contents[i]);
		    			
		    	}
				
				}
		});		
	
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new PrintMenu();
				//dispose();
			}
		});
		
	}
}

public class Search{
	public Searchpanel sp=null;
}

package 입출력스트림;
import java.util.*;
import java.io.*;
public class WordSearchFile {
	private File targetFile=null;
	Vector<String> lineVector=new Vector<String>();
	
	public WordSearchFile() {}
	
	private void readFile(String filename) {
		targetFile=new File(filename);
		try {
			Scanner sc=new Scanner(new FileReader(targetFile));
			while(sc.hasNext()) {
				String line=sc.nextLine();
				lineVector.add(line);
			}			
			sc.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private Vector<Integer> SearchWord(String word) {
		Vector<Integer> noVector=new Vector<Integer>();
		for(int i=0;i<lineVector.size();i++) {
			String line=lineVector.get(i);
			if(line.indexOf(word)!=-1)
				noVector.add(i);
		}
		return noVector;
	}
	
	private void printLine(Vector<Integer> noVector) {
		for(int i=0;i<noVector.size();i++) {
			int lineNo=noVector.get(i);
			String line=lineVector.get(lineNo);
			System.out.println(lineNo+" "+line);
		}
	}
	
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.print("대상 파일명 입력>>");
		String name=sc.nextLine();
		readFile(name);
		
		while(true) {
			System.out.print("검색할 단어나 문장>> ");
			String line=sc.nextLine();
			
			if(line.equals("그만"))
				break;
			
			Vector<Integer> noVector = SearchWord(line);
			printLine(noVector);
		}
		sc.close();
		System.out.println("검색 프로그램 종료");
	}
	
	public static void main(String[] args) {
		WordSearchFile five=new WordSearchFile();
		five.run();
	}
}

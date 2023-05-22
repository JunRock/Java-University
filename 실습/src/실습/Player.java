import java.util.Scanner;
import java.lang.Math;

public class Player{
	private String name;
	private Scanner sc=new Scanner(System.in);
	
	public Player(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean turn() {
		System.out.println("["+name+"] : <enter>");
		sc.nextLine();
		int num[]=new int [3];
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*3+1);
		}
		
		System.out.println("\t\t");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+"\t");
		}
		
		boolean result=true;
		for(int i=0;i<num.length;i++) {
			if(num[i]!=num[0]) {
				result=false;
				break;
			}
		}
		return result;
	}	
}
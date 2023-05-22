package 시험연습;
import java.util.Scanner;

class Player{
	private String name;
	Scanner sc=new Scanner(System.in);
	public Player(String name) {
		this.name=name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public int turn() {
		System.out.println(name+"가위 바위 보");
		return sc.nextInt();
	}
}

class Computer extends Player{
	public Computer(String name) {
		super(name);
	}
	
	public int turn() {
		return (int)(Math.random()*3+1);
	}	
}

public class NIght6장 {
	String[] str= {"가위","바위","보"};
	private Player[] p=new Player[2];
	public NIght6장() {
		p[0]=new Player("철수");
		p[1]=new Player("컴퓨터");
	}
	public void run() {
	}
	
	public static void main(String[] args) {
		
		}
	}

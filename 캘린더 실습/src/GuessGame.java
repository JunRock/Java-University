import java.util.Calendar;
import java.util.Scanner;
class Player{
	private String name;
	private Scanner sc=new Scanner(System.in);
	public Player(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public int turn() {		
		System.out.println((name+"시작<enter>키>> "));
		String key=sc.nextLine();
		Calendar c=Calendar.getInstance();
		int start=c.get(Calendar.SECOND);
		System.out.println("현재 초 시간 = "+start);
		
		System.out.println("10초 예상 후 <enter>키>>");
		key =sc.nextLine();
		c=Calendar.getInstance();
		int end=c.get(Calendar.SECOND);
		System.out.println("현재 초 시간 = "+end);
		if(end<start)
			end+=60;
		return Math.abs(start-end);
	}
}

public class GuessGame {
	
	public GuessGame() {
		
	}
	
	public void run() {
		
		Player player[]=new Player[2];
		player[0]=new Player("철이");
		player[1]=new Player("순이");
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		int dur1 = player[0].turn();
		int dur2 = player[1].turn();
		System.out.println(player[0].getName()+"의 결과"+dur1+".");
		System.out.println(player[1].getName()+"의 결과"+dur2+".");
		System.out.print("승자는 ");
		if(Math.abs(10-dur1)<Math.abs(10-dur2))
			System.out.println(player[0].getName());
		else
			System.out.println(player[1].getName());
	}
	
	public static void main(String[] args) {
		GuessGame game=new GuessGame();
		game.run();
		
	}
}

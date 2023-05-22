import java.util.Scanner;

public class Gambling {
	private Player[] p;
	private Scanner sc=new Scanner(System.in);
	
	public Gambling() {
		System.out.println("겜블링 게임에 참여할 선수 숫자");
		int nPlayers=sc.nextInt();
		sc.nextLine();
		p=new Player[nPlayers];
		
		for(int i=0;i<p.length;i++) {
			System.out.println((i+1)+"번째 선수 이름>> ");
			p[i]=new Player(sc.nextLine());
		}
	}
	
	public void run() {
		int i=0;
		while(true) {
			if(p[i].turn()) {
				System.out.println(p[i].getName()+"님이 이겼습니다.");
				break;
			}
			else {
				System.out.println("아쉽습니다");
				i++;
				i=i%p.length;
			}
		}
	}
	
	public static void main(String[] args) {
		Gambling game=new Gambling();
		game.run();
	}
}

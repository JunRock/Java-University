class Weapon{
	protected int fire() {
		return 1;
	}
}

class Canon extends Weapon{
	@Override
	protected int fire() {
		return 10;
	}
}
public class Ppra {
	public static void main(String[] args) {
		Weapon w=new Weapon();
		System.out.println("살상능력은 "+w.fire());
		
		Weapon c=new Canon();
		System.out.println("살상능력은 "+c.fire());
	}
}

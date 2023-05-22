class Point{
	private int x,y;
	public void set(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	
	public void colorshow() {
		System.out.print(color);
		show();
	}
}
public class Practice {
	public static void main(String[] args) {
		Point point=new Point();
		point.set(1,2);
		point.show();
		ColorPoint cp=new ColorPoint();
		cp.set(2,4);
		cp.setColor("res");
		cp.colorshow();
		
	}
}

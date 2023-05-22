import java.util.Calendar;
public class Good {
	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		int year=now.get(Calendar.YEAR);
		int month=now.get(Calendar.MONTH);
		int hour=now.get(Calendar.HOUR_OF_DAY);
		int minute=now.get(Calendar.MINUTE);
		System.out.println(year+"년"+month+"월");
		System.out.println("현재시각은 "+hour+"시"+minute+"분입니다.");
		if(hour>4&&hour<12)
			System.out.println("Good morning");
		else if(hour>=12&&hour<18)
			System.out.println("Good Afternoon");
		else if(hour>=18&&hour<22)
			System.out.println("Good evening");
		else
			System.out.println("Good night");
	}
}

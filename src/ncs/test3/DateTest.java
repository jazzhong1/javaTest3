package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class DateTest {
	
	public static void main(String[] args) {
		GregorianCalendar gi=new GregorianCalendar();
		Date date=gi.getTime();
		
		
		GregorianCalendar birth=new GregorianCalendar(1987,04,27);
		Date date2=birth.getTime();
		
		int age= new GregorianCalendar().get(Calendar.YEAR)-birth.get(Calendar.YEAR);
		//타임밀리 세컨으로 해도됨.(다소연산필요)
		
		SimpleDateFormat dateFormat1=new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String str=dateFormat1.format(date);
		
		SimpleDateFormat dateFormat2=new SimpleDateFormat("yyyy년 MM월 dd일");
		String str2=dateFormat2.format(date2);
		
		System.out.println("생일:"+str2);
		System.out.println("현재:"+str);
		System.out.println("나이:"+age);
		
		
	}
}

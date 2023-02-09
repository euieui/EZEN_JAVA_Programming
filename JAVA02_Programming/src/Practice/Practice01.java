package Practice;

import java.util.Calendar;
import java.util.Date;

public class Practice01 {

	public static void main(String[] args) {
		int sum=0;
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.set(2021, 7,16,15, 52,00);
		cal2.set(2021, 7,16,21,11,30);
		Date start = cal1.getTime();
		
		
		Date end = cal2.getTime();
		
		System.out.println("cal1 : " + cal1.getTimeInMillis());
		System.out.println("start : " +start.getTime());
		System.out.println("end : " + end.getTime());
		
		int hour = (int) ((end.getTime()-start.getTime())/3600000);
		int min =    (int) (((end.getTime()-start.getTime())/60000) -  ( hour *60))/10;
		int prmin =    (int) ((end.getTime()-start.getTime())/60000);
		
		
		sum = hour * 2000 + (min+1)*400;
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sum);
	}

}


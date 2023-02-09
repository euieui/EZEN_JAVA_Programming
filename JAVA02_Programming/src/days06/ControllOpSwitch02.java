package days06;

import java.util.Scanner;

public class ControllOpSwitch02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("월 : ");
		int month = sc.nextInt();
		System.out.printf("일 : ");
		int day = sc.nextInt();
		int tot=0;
		if (month==1) tot =day;
		if (month==2) tot =31+day;
		if (month==3) tot =31+28+day;
		if (month==4) tot =31+28+31+day;
		if (month==5) tot =31+28+31+30+day;
		if (month==6) tot =31+28+31+30+31+day;
		if (month==7) tot =31+28+31+30+31+30+day;
		if (month==8) tot =31+28+31+30+31+30+31+day;
		if (month==9) tot =31+28+31+30+31+30+31+31+day;
		if (month==10) tot =31+28+31+30+31+30+31+31+30+day;
		if (month==11) tot =31+28+31+30+31+30+31+31+30+31+day;
		if (month==12) tot =31+28+31+30+31+30+31+31+30+31+30+day;
		
		if ( tot % 7 ==1) System.out.println("금요일입니다.");
		else if ( tot % 7 ==2) System.out.println("토요일입니다.");
		else if ( tot % 7 ==3) System.out.println("일요일입니다.");
		else if ( tot % 7 ==4) System.out.println("월요일입니다.");
		else if ( tot % 7 ==5) System.out.println("화요일입니다.");
		else if ( tot % 7 ==6) System.out.println("수요일입니다.");
		else System.out.println("목요일입니다.");
		System.out.println("");
		
		// 이걸 스위치로
		tot = 0;
		switch(month) {
			case 1: tot =day; break;
			case 2: tot =31+day; break;
			case 3: tot =31+28+day; break;
			case 4: tot =31+28+31+day; break;
			case 5: tot =31+28+31+30+day;break; 
			case 6: tot =31+28+31+30+31+day; break;
			case 7: tot =31+28+31+30+31+30+day; break;
			case 8: tot =31+28+31+30+31+30+31+day; break;
			case 9: tot =31+28+31+30+31+30+31+31+day; break;
			case 10: tot =31+28+31+30+31+30+31+31+30+day; break;
			case 11: tot =31+28+31+30+31+30+31+31+30+31+day; break;
			case 12: tot =31+28+31+30+31+30+31+31+30+31+30+day; break;
		}
		int t = tot %7;
		switch(t) {
			case 0: System.out.println("목요일입니다."); break;
			case 1: System.out.println("금요일입니다."); break;
			case 2: System.out.println("토요일입니다."); break;
			case 3: System.out.println("일요일입니다."); break;
			case 4: System.out.println("월요일입니다."); break;
			case 5: System.out.println("화요일입니다."); break;
			case 6: System.out.println("수요일입니다."); break;
		}
	}

}

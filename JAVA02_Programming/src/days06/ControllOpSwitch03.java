package days06;

import java.util.Scanner;

public class ControllOpSwitch03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("월 : ");
		int month = sc.nextInt();
		System.out.printf("일 : ");
		int day = sc.nextInt();
		int tot=0;
		
		// tot = 31+28 + ... + ;
		// tot = 거꾸로 계산하자!
		// tot = tot + 31; 누적계산 이걸로 어케 편하게 할까?
		
		switch(month) {
			case 12: tot = tot + 30;
			case 11: tot = tot + 31;
			case 10: tot = tot + 30;
			case 9: tot = tot + 31;
			case 8: tot = tot + 31;
			case 7: tot = tot + 30;
			case 6: tot = tot + 31;
			case 5: tot = tot + 30;
			case 4: tot = tot + 31;
			case 3: tot = tot + 28;
			case 2: tot = tot + 31;
			case 1: tot = tot + 0;
		}
	
		int t = (tot+day) %7;
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

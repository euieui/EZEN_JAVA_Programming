package days05;

import java.util.Scanner;

public class ControllOpIf09 {

	public static void main(String[] args) {
		// 2021년 1월 1일은 금요일입니다.
		// 2021년 한해서 월과 일을 입력 받고,
		// 요일을 출력하세요
		// 1월 10일 입력했다면 1월 1일 부터 10일까지 10일의 날짜가 계산됩니다.
		// 그를 7로 나눈 나머지를 구하면 3이고, 1:금요일 2: 토요일
		
		// 1. 요일을 계산할 월과 일을 입력 받ㅅ습니다.
		
		// 2. 1월 일부터 입력한 날짜까지 몇일이 지났는지 계산합니다
		//     (입력한 월의 바로 전달까지 날짜 합산
		//     (위에서 합산된 날짜에 입력한 일을 더합니다)
		
		// 3. 최종 합산된 날짜들을 7로 나눈 나머지를 구합니다
		
		// 4. 나머지 값을 참고하여 상대적 값으로 요일을 출력합니다.
		
		
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
		
		
		
	}

}

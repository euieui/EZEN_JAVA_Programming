package days08;

import java.util.Scanner;

public class ControllOpWhile06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y,m, days = 0,t,i;  //t:7로 나눈나머지저장용, i 반복실행문
		System.out.printf("년 입력 : ");
		y = sc.nextInt();
		System.out.printf("월 입력 : ");
		m = sc.nextInt();
		
		// 아니 그래서 출력을 뭘 원하는거?
		// 달력 하나를 출력 하라고 ? 
		// 이걸 단시간내에 하나?
		
		days = 365* (y-1);
		for ( i=1 ; i<=y-1 ; i++ )
			if ( i%4 ==0 && i%100!=0 || i%400==0 )
				days++;
		
		switch(m) {
		case 12 : days = days + 30;
		case 11 : days = days + 31;
		case 10 : days = days + 30;
		case 9 :  days = days + 31;
		case 8 :  days = days + 31;
		case 7 :  days = days + 30;
		case 6 :  days = days + 31;
		case 5 :  days = days + 30;
		case 4:  days = days + 31;
		case 3:
			if ( y%4==0 && y%100!=0 || y%400==0)
				 days = days + 29;
			else  days = days + 28;
		case 2 :  days = days + 31;
		case 1 :  days = days + 0;
		}
		days = days + 1; // 입력한 년, 월의 1일자 요일을 찾기위해 최종 1을 가산
		
		t= days %7;
		
		System.out.println();
		System.out.println(y + "년 " + m + "월");
		System.out.println("----------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("----------------------------------------");
		
		int space;
		for ( space = 0 ; space <t; space ++) {
			System.out.printf("\t");
		}
		
		int lastday=0;
		
		switch(m) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12:  /// 요기법 좋
				lastday = 31; break;
			case 4: case 6: case 9: case 11:  /// 요기법 좋다
				lastday = 30; break;
			case 2 :
				if(y%4==0 && y%100!=0 || y%400 ==0) lastday = 29;
				else lastday = 28;
				break;
		}
		
		
		for (int day=1; day <=lastday; day++) {
			System.out.printf("%d\t",day);
			if(++space %7==0) // 빈칸 포함 7칸이 쓰였으면 다음 라인으로
				System.out.printf("%n");
		}
		

	}

}

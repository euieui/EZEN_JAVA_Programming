package days08;

import java.util.Scanner;

public class ControllOpWhile07 {

	public static void main(String[] args) {
		// 프로그램이 종료되지 않고 이전달 다음달로 이어갈 수 있게 while 문을 구성해주세요
		// 이전달 다음달에 해당하는 년도와 월을 계산해주세요
		// next 변수의 값이 3이면 while 문을 종료해주세요
		/*
		Scanner sc = new Scanner(System.in);
		int y,m, days = 0,t,i, next=0; 
		System.out.printf("년 입력 : ");
		y = sc.nextInt();
		System.out.printf("월 입력 : ");
		m = sc.nextInt();
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
			if ( y%4==0 && y%100!=0 || i%400==0)
				 days = days + 29;
			else  days = days + 28;
		case 2 :  days = days + 31;
		case 1 :  days = days + 0;
		}
		days = days + 1; 
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
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 :   
				lastday = 31; break;
			case 4: case 6: case 9: case 11:  
				lastday = 30; break;
			case 2 :
				if(y%4==0 && y%100!=0 || y%400 ==0) lastday = 29;
				else lastday = 28;
				break;
		}
		for (int day=1; day <=lastday; day++) {
			System.out.printf("%d\t",day);
			if(++space %7==0) 
				System.out.printf("%n");
		}
		
		System.out.printf("\n[이전달:1][다음달:2][종료:3] : ");
		next = sc.nextInt();
		
		
		while(next!=3) {
			if (next ==1) {
				m= m-1;
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
					if ( y%4==0 && y%100!=0 || i%400==0)
						 days = days + 29;
					else  days = days + 28;
				case 2 :  days = days + 31;
				case 1 :  days = days + 0;
				}
				days = days + 1; 
				t= days %7;
				System.out.println();
				System.out.println(y + "년 " + m + "월");
				System.out.println("----------------------------------------");
				System.out.println("일\t월\t화\t수\t목\t금\t토");
				System.out.println("----------------------------------------");
				for ( space = 0 ; space <t; space ++) {
					System.out.printf("\t");
				}
				switch(m) {
					case 1 : case 3 : case 5 : case 7 : case 8 : case 10 :   
						lastday = 31; break;
					case 4: case 6: case 9: case 11:  
						lastday = 30; break;
					case 2 :
						if(y%4==0 && y%100!=0 || y%400 ==0) lastday = 29;
						else lastday = 28;
						break;
				}
				for (int day=1; day <=lastday; day++) {
					System.out.printf("%d\t",day);
					if(++space %7==0) 
						System.out.printf("%n");
				}	
			}
			if (next ==2) {
				m= m+1;
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
					if ( y%4==0 && y%100!=0 || i%400==0)
						 days = days + 29;
					else  days = days + 28;
				case 2 :  days = days + 31;
				case 1 :  days = days + 0;
				}
				days = days + 1; 
				t= days %7;
				System.out.println();
				System.out.println(y + "년 " + m + "월");
				System.out.println("----------------------------------------");
				System.out.println("일\t월\t화\t수\t목\t금\t토");
				System.out.println("----------------------------------------");
				for ( space = 0 ; space <t; space ++) {
					System.out.printf("\t");
				}
				switch(m) {
					case 1 : case 3 : case 5 : case 7 : case 8 : case 10 :   
						lastday = 31; break;
					case 4: case 6: case 9: case 11:  
						lastday = 30; break;
					case 2 :
						if(y%4==0 && y%100!=0 || y%400 ==0) lastday = 29;
						else lastday = 28;
						break;
				}
				for (int day=1; day <=lastday; day++) {
					System.out.printf("%d\t",day);
					if(++space %7==0) 
						System.out.printf("%n");
				}
			}
			System.out.printf("\n[이전달:1][다음달:2][종료:3] : ");
			next = sc.nextInt();
		}
		*/
		//이렇게 길게 안해도 되는구나
		
		
		Scanner sc = new Scanner(System.in);
		int y,m, days = 0,t,i , next=0; //t:7로 나눈나머지저장용, i 반복실행문
		System.out.printf("년 입력 : ");
		y = sc.nextInt();
		System.out.printf("월 입력 : ");
		m = sc.nextInt();
			
			// 아니 그래서 출력을 뭘 원하는거?
			// 달력 하나를 출력 하라고 ? 
			// 이걸 단시간내에 하나?
		while(true) {
			days = 365* (y-1);
			for ( i=1 ; i<=y-1 ; i++ )
				if ( i%4 ==0 && i%100!=0 || i%400==0 )
					days++;
			System.out.printf("%d\n",days);
			
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
			System.out.printf("%d\n",t);
			
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
				case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12:  /// 요기법 좋네
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
			System.out.printf("\n[이전달:1][다음달:2][종료:3] : ");
			next = sc.nextInt();
			
			if (next == 3) break;
			
			if (next ==1) {
				if(m==1) {
					m=12;
					y--;
				} else {
					m--;
				}
			} else if (next == 2 ) {
				if(m==12) {
					m = 1; y++;
				}else
					m++;
			}
		} // while의 끝
		System.out.println("\n프로그램 종료");
			

	}

}

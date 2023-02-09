package days17;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar05 {

	public static void main(String[] args) {
		int year;
		int month;
		int input=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		year = sc.nextInt();
		System.out.print("월 입력 : ");
		month = sc.nextInt();
		
		Calendar sDay = Calendar.getInstance();  // 출력할 달력의 시작날짜 (1일)
		Calendar eDay = Calendar.getInstance();  // 출력할 달력의 끝날자(말일)
		
		/*
		sDay.set(year,month-1,1);
		eDay.set(year,month,1);
		eDay.add(Calendar.DATE,-1);
		*/
		while(true) {
			sDay.set(year,month-1,1);
			eDay.set(year,month,1);
			eDay.add(Calendar.DATE,-1);
			
			int START_WEEK =sDay.get(Calendar.DAY_OF_WEEK);
	
			System.out.println("\n" + year + "년 " +month +"월 ");
			System.out.println("------------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("------------------------------------------");
			// 1일자의 요일까지 빈칸
			for(int i = 1 ; i<START_WEEK ; i++) System.out.printf("\t");
			// 뒤를 이어서 1일자부터 마일까지 날짜 출력
			for(int i = 1; i<=eDay.get(Calendar.DATE);i++) {
				System.out.printf("%2d\t",i);
				if(START_WEEK%7==0) System.out.println();
				START_WEEK++;
			}
			System.out.println("\n------------------------------------------");/// --- 그생고생해서 내가만든게 이리 간결하게 되어버렸도다...
		
			System.out.print("\n[이전달(1)] | [다음달(2)] | [종료(3)] : ");
			input =sc.nextInt();
			if(input==3)break;
			Calendar temp = Calendar.getInstance(); ///--- 다른방법
			temp.set(year,month-1,1);  ///--- 다른방법 현재 년과 월로 날짜 세팅
			if(input ==1) {
				/* 
			 	year month 가 while 문 밖 에 있을때 내생각
				sDay.add(Calendar.MONTH,-1); 
				month=sDay.get(Calendar.MONTH)+1;
				year=sDay.get(Calendar.YEAR);
				eDay.set(year,month,1);
				eDay.add(Calendar.DATE,-1);
				 */
				temp.add(Calendar.MONTH,-1); /// ---- 다른방법
			}
			else if(input ==2) {
				/*
				sDay.add(Calendar.MONTH,1);
				month=sDay.get(Calendar.MONTH)+1;
				year=sDay.get(Calendar.YEAR);
				eDay.set(year,month,1);
				eDay.add(Calendar.DATE,-1);
				*/
				temp.add(Calendar.MONTH,1); /// ---- 다른방법
			}
			year = temp.get(Calendar.YEAR); /// ---- 다른방법
			month = temp.get(Calendar.MONTH)+1; /// ---- 다른방법
			
		}
	}
	
}

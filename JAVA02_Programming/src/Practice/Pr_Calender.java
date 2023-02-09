package Practice;

import java.util.Scanner;

public class Pr_Calender {

	public static void main(String[] args) {
		
		//  배운지 8일째 만들어봄
		
		
		
		///달력만들기
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("년을 입력하세요 : ");
		int y = sc.nextInt();
		System.out.printf("월을 입력하세요 : ");
		int m = sc.nextInt();	
		int next;
		
		do {
			int tot;
			tot = (y-1)*365;
			for (int k=1 ; k<=y-1 ; k++){
				if (k%4==0 && k%100!=0 || k%400==0)
					tot++;
			}
			System.out.printf("%d\n",tot);
			
			switch(m) {
				case 12 : tot = tot + 30;
				case 11 : tot = tot + 31;
				case 10 : tot = tot + 30;
				case 9 :  tot = tot + 31;
				case 8 :  tot = tot + 31;
				case 7 :  tot = tot + 30;
				case 6 :  tot = tot + 31;
				case 5 :  tot = tot + 30;
				case 4:  tot = tot + 31;
				case 3:
					if ( y%4==0 && y%100!=0 || y%400==0)
						 tot = tot + 29;
					else  tot = tot + 28;
				case 2 :  tot = tot + 31;
				case 1 :  tot = tot + 0;
			}
			
			// 설마설마 설마 설마 서람 서람 설마 설마 서람 서람  와이게 case 맞아 병신아 그러네
			tot += 1;
			int t = tot % 7 ;
			System.out.printf("%d\n",t);
						
			System.out.printf("\t\t%d년 %d월\n",y,m);
			System.out.printf("------------------------------------------\n");
			System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
			System.out.printf("------------------------------------------\n");
			
			int lastday=0;
			switch (m) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					lastday=31; break;
				case 4: case 6: case 9: case 11:
					lastday=30; break;
				case 2: 
					if(y%4 ==0 && y%100!=0 || y%400==0) lastday = 29;
					else lastday = 28; break;
			}
	
			int i;
			for (i = 0 ; i<t ; i++)
				System.out.printf(".\t");
			for (int j = 1 ; j<=lastday ; j++) {
				System.out.printf("%d\t",j);
				if (++i %7==0) System.out.println();
			}
			System.out.printf("\n[다음년도:1], [이전년도:2], [다음달:3], [이전달:4], [종료:5]");
			next = sc.nextInt();
			if (next ==1 ) y= y+1;
			else if (next ==2) y= y-1;
			else if (next ==3) {
				if (m==12) { y = y+1; m = 1;}
			else m=m+1;
			}
			else if (next ==4) {
				if (m==1) {y = y-1; m =12;}
				else m = m-1;
			}
		} while (next != 5);
		System.out.printf("프로그램 종료");
			
		
			
				
			
		
		
		
		
		
		
		
		
		
		
		/// 성적표 그 .... 과목도 받으면서 만들어볼까
		
		
		/// 달력 하나 내가 만들어보자 이쁘게 
	}
	//

}

package days05;

import java.util.Scanner;

public class ControllOpIf10 {

	public static void main(String[] args) {
		// 실습 예제
		// 년도를 입력받아서 입력한 년도가 윤년인지 평년인지를 출력하는
		// 코드를 작성하세요
		// 윤년의 조건 : 4의 배수 이면서 100의 배수가 아니거나 400의 배수인 해
		Scanner sc = new Scanner(System.in);
		System.out.printf("년도를 입력하세요 : ");
		int year = sc.nextInt();
		// 2020년
		// 내방법 너무 어렵게했다 
		if(year % 4 ==0) {
			if(year % 100 ==0) {
				if(year % 400 ==0) {
					System.out.printf("right\n");
				} else System.out.printf("miss\n");
			} else System.out.printf("right\n");
		} else System.out.printf("miss\n");
		
		// 강사님 방법 (year%100!=0) 여기 부분 이해좀 해보자 !()==() 쓸빠엔  ()!=() 하면되겠네
		if (year %4 ==0 && (year%100!=0) || year %400==0) {
			System.out.printf("윤년입니다.\n");
		}else System.out.printf("윤년이 아닙니다.\n");
		
		

	}

}

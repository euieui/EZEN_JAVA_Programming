package days08;

import java.util.Scanner;

public class ControlOpDoWhile01 {

	public static void main(String[] args) {
		int i;
		for(i=11; i<=10; i++ ) {
			System.out.printf("%d ",i);
		}
		System.out.println("For 반복 종료후 값 : " + i);
		i=11;
		while (i<=10) {
			System.out.printf("%d ",i);
			i++;
		}
		System.out.println("While 반복 종료후 값 : " + i );
		// -------------------------------------------------------

		i=11;
		
		do {
			// System.out.printf("%d ",i);
			i++;
		} while (i<=10);
		System.out.println("While 반복 종료후 값 : " + i );
		
		
		// do while 의 특이점 while(조건)을 후미에 기술합니다.
		// while(조건)뒤에 ';' 세미콜론을 찍습니다.
		
		
		// if (조건) ;  --- 조건이 끝나버림
		//		System.out.printf("");  ---> 그냥 무조건 실행 조건이 없어서
		
		// for( i =1 ; i <100 ; i++);
		//  	System.out.printf("ㅇㅇㅇ");  --> 그냥 한번 실행	

		// while(i<100); 
		//  	System.out.printf("ㅇㅇㅇ");  -->  실행도 안함 while이 무한 실행중이니까
		
		// do { }while ( 조건) ;  얘만 세미콜론가능
		// do 에 속한 { } 안의 명령을 한번 먼저 실행후 조건을 테스트  (아 조건없이 무조건 처음에 실행이구나)
		
		// do ~ while 반복문을 활용하여
		// 사용자가 100을 입력할 때까지 반복해서 입력 받으세요.
		Scanner sc = new Scanner (System.in);
		int input;
		do {
			System.out.print("정수를 입력 : ");
			input = sc.nextInt();
		} while(input !=100);
		System.out.println("프로그램 종료");
		
	}

}

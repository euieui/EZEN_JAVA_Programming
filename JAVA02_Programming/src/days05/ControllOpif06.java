package days05;

import java.util.Scanner;

public class ControllOpif06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		double b;
		System.out.printf("기본급을 입력하세요 : ");
		a = sc.nextInt();
		
		// 기본급이 백만원 이상이라면 기본급의 50% 를 보너스로 합산
		// 기본급이 백만원 미만이라면 기본급의 60% 를 보너스로 합산
		// 총지급액을 출력하세요
		
		/*
		if (a>=1000000) {
			b = a+a*0.5;
			System.out.printf("50% 보너스 총 지급액 : %f\n", b);
		}
		else {
			b = a+a*0.6;
			System.out.printf("60% 보너스  총 지급액 : %f\n" , b);
		}     왜 틀렸는지 알았따 printf 는 % 가 .... %가.... 탈출문자... ..
		*/ 
		if (a>=1000000) {
			b = a+a*0.5; // b = a * 1.5;
			System.out.println("50% 보너스 총 지급액 : " + (int)b  );
		}
		else {
			b = a+a*0.6;
			System.out.println("60% 보너스  총 지급액 : " + (int)b );  // .이 보기싫다 면 인트를
		}
		
		if (a>=1000000) {
			b = a+a*0.5; 
		}
		else {
			b = a+a*0.6;  
		}
		System.out.println("총 지급액 : " + (int)b );
		

	}

}

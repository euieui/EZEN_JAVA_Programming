package days03;

import java.util.Scanner;

public class study {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변의 길이를 입력하시오. : ");
		int num1 = sc.nextInt();
		System.out.println("높이의 길이를 입력하시오. : ");
		int num2 = sc.nextInt();
		System.out.printf("입력하신 삼각형의 넓이는 : %.1f 입니다",num1*num2/2.0);
		
		System.out.println();
		sc = new Scanner(System.in);
		System.out.println("2 밑변 : ");
		num1 = sc.nextInt();
		System.out.println("2 높이 : ");
		num2 = sc.nextInt();
		System.out.printf("넓이 %.1f", num1 * num2 / 2.0);
	}

}

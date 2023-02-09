package days03;

import java.util.Scanner;

public class Variable03 {

	public static void main(String[] args) {
		int num1, num2;
		double result1;
		// 밑변의 길이를 입력하세요 : xx
		// 높이를 입력하세요 : xx
		// 입력한 삼각혀으이 넓이는 xx.x 입니다.
		Scanner sc = new Scanner(System.in); 
		// import 단축기 : Ctrl + Shift +'o'
		System.out.printf("밑변의 길이를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.printf("높이를 입력하세요 : ");
		num2 = sc.nextInt();
		result1 = num1 * num2 / 2.0;
		System.out.printf("입력한 삼각형의 넓이는 %.1f 입니다.",result1);
	}

}

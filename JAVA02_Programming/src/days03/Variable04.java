package days03;

import java.util.Scanner;

public class Variable04 {

	public static void main(String[] args) {
		// (입력)
		// 반지름을 입력하세요 : xx
		// (출력)
		// 입력한 원의 넓이는 : xx.xx
		// 입력한 원의 둘레 : xx.xx
		int num1;
		double area1, perimeter1;
		Scanner sc = new Scanner(System.in);
		System.out.printf("반지름을 입력하세요. : ");
		num1 = sc.nextInt();
		area1 = num1 * num1 * 3.14;
		perimeter1 = 2*num1 *3.14;
		System.out.println("원의 넓이는 " + area1 + "입니다.");
		System.out.println("원의 둘레는 " + perimeter1 + "입니다.");
		
	}

}

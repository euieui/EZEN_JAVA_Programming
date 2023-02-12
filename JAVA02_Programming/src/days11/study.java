package days11;

import java.util.Scanner;

public class study {

	public static void main(String[] args) {
		// 밑변과 높이를 입력받아서 삼각형의 넓이를 계산하여 출력(메서드사용)
					int a, b;
					double c;
					a = myInput(1);  //밑변을 입력 받음
					b = myInput(2); // 높이를 입력받음
					c = calculate(a,b); // 넓이를 계산
					prn(c); // 넓이 출력
	}
	
	public static int myInput(int k) {
		if(k==1) System.out.printf("밑변 : ");
		else System.out.printf("높이 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return a;
	}
	public static double calculate(int a, int b) {
		double k = a * b * 0.5;
		return k;
	}
	public static void prn(double c) {
		System.out.printf("넓이 : %.2f", c);
	}
}

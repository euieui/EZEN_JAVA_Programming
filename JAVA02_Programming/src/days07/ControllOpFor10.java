package days07;

import java.util.Scanner;

public class ControllOpFor10 {

	public static void main(String[] args) {
		// 정수 10개를 입력 받아서 그 합계를 출력하세요
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i<=10 ; i++) {
			System.out.printf("%d번째 정수를 입력하세요 : ",i);
			int num = sc.nextInt();
			sum = sum + num;
		}
		System.out.printf("정수들의 합은 %d 입니다.\n",sum);

	}

}

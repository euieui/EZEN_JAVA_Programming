package days08;

import java.util.Scanner;

public class study {

	public static void main(String[] args) {
		// 사용자에게서 단을 입력 받아 구구단을 출력
		//사용자가 0을 입력할때까지 출력할 단을 입력받고 구구단을 연이어 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하시오. 정지(: 0)");
		int a = sc.nextInt();
		
		
		while(a!=0) {
			int i = 1;
			while(i<=9) {
				System.out.printf("%d x %d = %d\n", a, i, a*i);
				i++;
			}
			System.out.printf("정수를 입력하시오. 정지(: 0)");
			a = sc.nextInt();
		}
		
	}

}

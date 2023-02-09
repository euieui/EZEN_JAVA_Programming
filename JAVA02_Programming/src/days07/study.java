package days07;

import java.util.Scanner;

public class study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 하나를 입력 받아서
		// 2부터 입력받은 정수까지 짝수의 합을 출력하세요
		Scanner sc = new Scanner(System.in);
		int a;
		int i;
		int sum = 0;
		System.out.printf("정수 : ");
		a = sc.nextInt();
		
		if(a%2 == 0) {
			for(i =0 ; i<=a ; i+=2) {sum += i;
			}
			
		}else if (a%2 == 1) {
			for(i =0 ; i<a ; i+=2) { sum+=i;
			}
		}
		System.out.printf("합 : %d", sum);
	}
}

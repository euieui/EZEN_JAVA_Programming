package days05;

import java.util.Scanner;

public class study {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수 하나를 입력 : ");
		int a = sc.nextInt();
		int result = a % 2;
		
		if(result == 1) {System.out.printf("홀수입니다.");} 
		else { System.out.printf("짝수입니다.");
		}
	}

}

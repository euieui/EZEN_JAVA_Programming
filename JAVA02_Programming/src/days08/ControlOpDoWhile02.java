package days08;

import java.util.Scanner;

public class ControlOpDoWhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int isExit;
		
		/*
		while(true) {
			// ...
			System.out.print("계속하시겠습니까(y:1/n:2)?");
			if(sc.nextInt()==2) break;
		}
		*/
		
		
		do {
			int n1, n2, result =0, operator;
			
			System.out.print("1번째 정수를 입력하세요 : ");
			n1 = sc.nextInt();
			System.out.print("2번째 정수를 입력하세요 : ");
			n2 = sc.nextInt();
			System.out.print("계산에 사용할 부호를 입력하세요(+:1, -:2, *:3, /:4 :");
			operator = sc.nextInt();
			switch(operator) {
				case 1 : result = n1 + n2; break;
				case 2 : result = n1 - n2; break;
				case 3 : result = n1 * n2; break;
				case 4 : result = n1 / n2; break;
			}
			System.out.printf("result = %d\n\n",result);
			System.out.print("계속하시겠습니까(y:1/n:2)? : ");
			isExit = sc.nextInt();
			
		} while(isExit!=2);
		System.out.printf("프로그램 종료");

	}

}

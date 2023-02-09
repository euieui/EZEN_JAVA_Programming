package days06;

import java.util.Scanner;

public class ControllOpFor05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,a,b;
		System.out.printf("첫번째 정수 입력 : ");
		a = sc.nextInt();
		System.out.printf("두번째 정수 입력 : ");
		b = sc.nextInt();
		// 입력 받은 숫자 중 작은 숫자부터 큰 숫자까지 정수를 출력하세요
		if (a>= b) for (i=b ; i<=a ; i++) System.out.printf("%d ",i);
		else for(i=a ; i<=b ; i++) {
			System.out.printf("%d ",i);		
		}  // 이렇게도 된다 오그럼 나중에 쓸때 올 나누기 ㅍ ㅕㄴ하겠다
		
	}

}

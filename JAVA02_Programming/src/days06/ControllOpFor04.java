package days06;

import java.util.Scanner;

public class ControllOpFor04 {

	public static void main(String[] args) {
		int k, i;
		k = 5;
		i = 2;
		System.out.printf("%d x %d = %d\n",k,i,k*i);
		//입력한 숫자의 구구단을 출력하세요
		
		Scanner sc = new Scanner(System.in);
		int dan;
		System.out.printf("출력할 단을 입력하세요 : ");
		dan = sc.nextInt();
		for (i=1;i<=9;i++) {
			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
		}

	}

}

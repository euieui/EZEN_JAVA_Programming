package days06;

import java.util.Scanner;

public class ControllOpFor07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int i,k;
		System.out.printf("출력할 팩터리얼을 입력하세요 : ");
		k = sc.nextInt();
		// 6을 입력했다면
		// 6! = 6x5x4x3x2x1 = 720
		System.out.printf("%d! = ",k);
		for (i=k;i>=2;i--) {
			fact = fact *i;
			System.out.printf("%dx",i);
		}
		System.out.printf("1 = %d",fact);
	}

}

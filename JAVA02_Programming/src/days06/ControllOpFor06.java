package days06;

import java.util.Scanner;

public class ControllOpFor06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int i,k;
		System.out.printf("출력할 팩터리얼을 입력하세요 : ");
		k = sc.nextInt();
		// 6을 입력했다면
		// 6! = 1x2x3x4x5x6 = 720
		System.out.printf("%d! = 1",k);
		for (i=2;i<=k;i++) {
			fact = fact *i;
			System.out.printf("x%d",i);
		}
		System.out.printf(" = %d",fact);
		System.out.println();
		fact = 1;
		System.out.printf("%d! = ",k);
		for (i=1;i<=k-1;i++) {
			fact = fact *i;
			System.out.printf("%dx",i);
		}
		System.out.printf("%d = %d",k,fact*k);
		
		
		// --- System.out.printf("\b = %d",fact);
		// --- 여기서 \b 를 사용하면 되네 원래는! 이클립스 콘솔창이라서... 대박이다!
		// --- 이생각도 가능하네 \b 를 쓸생각을 전혀 못했어!
		// --- 강사님 방법도 괜찮네  난 좀 더 고민했구나
	}

}

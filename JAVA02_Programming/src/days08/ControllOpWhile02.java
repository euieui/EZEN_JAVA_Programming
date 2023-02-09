package days08;

import java.util.Scanner;

public class ControllOpWhile02 {

	public static void main(String[] args) {
		// 1부터 100 사이의 짝수의 출력 : while 문을 이용해주세요
		int i=1;
		while (i<=100) {
			if(i%2==0) {System.out.printf("%d ",i);}
			i++;
		}
		System.out.println();
		System.out.printf("강사님 방법 : ");
		// 강사님 방법 
		i=2;
		while(i<=100) {
			System.out.printf("%d ",i);
			i +=2;
		}
		
		//6을 입력하면 6! = 6x5x4x3x2x1 = 720 while문을
		Scanner sc = new Scanner(System.in);
		int n , fact = 1;
		System.out.print("\n팩터리얼을 계산할 정수 입력 : ");
		n = sc.nextInt();
		
		System.out.printf("%d! = ", n);
		while(n>=2) {
			System.out.printf("%dx",n);
			fact= fact*n;
			n--;
		}
		System.out.printf("1 = " + fact);
		

	}

}

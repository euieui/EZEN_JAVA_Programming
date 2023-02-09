package days09;

import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		// 어렵네
		double avg = 0;
		int tot = 0, a = 0, i = 0;
		int [] score = new int[100];
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("점수를 입력하세요 : ");
			score[i] = sc.nextInt();
			tot += score[i];
			
			avg = tot / (i + 1.0);
			
			for (int k = 0; k<=i ; k++) System.out.printf("%d ",score[k]);
			System.out.printf("\n총점 : %d , 평균 %.2f\n",tot,avg);
			System.out.printf("\n[계속입력:1],[종료:2]\n");
			a = sc.nextInt();
			if(a==1) i++;
		}while(a!=2); 
		System.out.printf("프로그램 종료");
	}

}

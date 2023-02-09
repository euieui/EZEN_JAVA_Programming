package days09;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		// 정해지지 않은 과목수의 성적을 입력받아, 총점과 평균을 출력
		Scanner sc = new Scanner(System.in);
		
		
		int [] score = new int [100];
		
		int tot=0, i=0,ex=0;
		// 반복 실행문을 이용하여 점수 입력 (do while 이용)
		
		// 총점 평균 계싼
		double avg = 0;
		
		//출력
		do {
			System.out.printf("입력된 점수 : ");
			score[i]=sc.nextInt();
			for (int k =0 ; k<= i ; k++ ) System.out.printf("%d ",score[k]);

			tot = tot + score[i];
			avg = tot/(i+1.0);
			System.out.printf("\n총점 : %d 점, 평균 %.2f 점\n",tot,avg);
			
			System.out.printf("\n[계속입력:1],[종료:2]\n");
			ex = sc.nextInt();
			
			if(ex==1) i++;
		} while(ex!=2);
		System.out.printf("프로그램이 종료되었습니다.");
		
		//이거 다시해보자 도움을 좀 받았잖아 아 나랑 강사님이 다른거 나는 출력을 계속함 그러니 다르다 강사님 처럼 한번해보자 
		
		
		
		
		
		
		
		

	}

}

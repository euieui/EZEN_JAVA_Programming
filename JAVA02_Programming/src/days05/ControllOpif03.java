package days05;

import java.util.Scanner;

public class ControllOpif03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		/*
		if (a>0) {
			System.out.println("입력한 정수 " + a + " 는 양수입니다.");
		}else {
			if(a<0) {
				System.out.println("입력한 정수 " + a + " 는 음수입니다.");
			}else {
				System.out.println("입력한 정수는 0입니다.");
			}
		}
		*/
		if (a>0) {
			System.out.println("입력한 정수 " + a + " 는 양수입니다.");
		}else if(a<0) {
			System.out.println("입력한 정수 " + a + " 는 음수입니다.");
		}else {
			System.out.println("입력한 정수는 0입니다.");
		}
		// 위에서 () 안의 연산식으로 계산한 결과가 true 경우{} 안의 명령이 실행됩니다.
		// 다만, 그 명령이 단 한개만 존재한다면 , {}를 생략할 수 있습니다.
		if (a>0) 
			System.out.println("입력한 정수 " + a + " 는 양수입니다.");
		else if(a<0) 
			System.out.println("입력한 정수 " + a + " 는 음수입니다.");
		else 
			System.out.println("입력한 정수는 0입니다.");
		// 중괄호 생략후 if 구문과 실행 명령을 한줄에 써도 무관합니다.   --- 두줄 안된다... 반드시 중괄호 해야하는구만
		if (a>0) System.out.println("입력한 정수 " + a + " 는 양수입니다.\n");
		else if(a<0) System.out.println("입력한 정수 " + a + " 는 음수입니다.\n");
		else System.out.println("입력한 정수는 0입니다.\n");
		
		int kor = 80, eng = 80, mat = 90;
		double avg = (kor + eng + mat) / 3.0;
		// 평균점수가 80 이상이면 합격, 70이상이면 대기순번 나머지는 불합격
		System.out.printf("평균점수 : %.1f\n",avg);
		if (avg>=80) System.out.println("합격입니다.");
		else if (avg>= 70) System.out.println("대기순번입니다.");
		else System.out.println("불합격입니다.");
		
	}

}

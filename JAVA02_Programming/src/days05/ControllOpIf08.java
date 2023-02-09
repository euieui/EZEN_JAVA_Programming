package days05;

import java.util.Scanner;

public class ControllOpIf08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, tot;
		double avg;
		System.out.printf("국어점수 : ");
		kor = sc.nextInt();
		System.out.printf("영어점수 : ");
		eng = sc.nextInt();
		System.out.printf("수학점수 : ");
		mat = sc.nextInt();
		tot = kor+eng+mat;
		avg = tot / 3.0;
		
		//평균 60점 이상이면서 모든 과목에 40미만이 없다면 합격
		// 그렇지 않다면 불합격을 출력하되,
		// 불합격 사유(평균 미달, 국어 과락, 영어 과락, 수학과락)를 함께 출력하세요.
		System.out.printf("평균 : %.2f\n" ,avg);
		if (avg>=60 && kor >=40 && mat >= 40 && eng >= 40) System.out.println("합격입니다.");
		else {
			if (avg <60) System.out.println("평균 미달"); // avg 는 double  .. 60은 int   double과 int 대소비교 가능하다
			if (kor<40) System.out.println("국어 과락");   // 또한 정수 * 실수 실행되고 = 실수가 나온다
			if (eng <40) System.out.println("영어 과락");
			if (mat < 40) System.out.println("수학 과락");
			System.out.println("불합격 입니다.");
		}
		// --- 강사님꺼는 한번 보기로만 강사님 마지막에 한것이 내꺼랑 똑같음
	}

}

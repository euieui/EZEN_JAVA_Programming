package days05;

import java.util.Scanner;

public class ControllOpif02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf(" 정수 하나를 입력해주세요 : ");
		int num1 = sc.nextInt();
		int num2 = num1 % 2;
		
		if(num2 ==0) {
			System.out.printf("입력한 정수 %d 는 짝수입니다.\n",num1);
		} else {
			System.out.printf("입력한 정수 %d 는 홀수입니다.\n",num1);
		}
		
		int kor =55, eng=55 , mat =55;
		double avg = (kor + eng + mat)/3.0;
		// 평균이 80이상이라면 합격이라고 출력하세요
		System.out.println("단일 if문 실행 : ");
		if (avg>=80.0) { // --- avg가 double 이잖아 비교하는것도 double 형이여야 해 이거 알아야 한다
			System.out.printf("평균점수 : %.1f 이므로 합격입니다.\n" , avg);
		}
		// 평균이 80이상이라면 합격, 아니면 불합격을 출력
		System.out.println("if~ else 문 실행 : ");
		if (avg>=80.0) {
			System.out.printf("평균점수 : %.1f 이므로 합격입니다.\n\n" , avg);
		}else {
			System.out.printf("평균점수 : %.1f 이므로 불합격입니다.\n\n" , avg);
		}
		
		// 평균 60이상 이거나 영어점수가 80이상 이라면 합격, 아니면 불합격
		System.out.println("----- 평균 60이상 영어 점수 80이상 합격 불합격 판단 ---");
		if (avg>=60 || eng>=80) {
			System.out.printf("평균점수 : %.1f  영어점수 : %d 이므로 합격입니다.\n\n",avg,eng);
		} else {
			System.out.printf("평균점수 : %.1f  영어점수 : %d 이므로 불합격입니다.\n\n",avg,eng);
		}
		
		// 평균 60이상 모든과목 40이상 이라면 true 아니면 false
		if (avg>= 60 && kor >=40 && mat >= 40 && eng>=40) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
		
		// 평균 60이상 이거나 모든 과목 50점 이상 이라면 합격
		if (avg>= 60 || ( kor >=50 && mat >= 50 && eng>=50)) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
		
		
	}
}

package days11;

import java.util.Scanner;

public class Method10 {

	public static void main(String[] args) {
		int kor, eng, mat, tot;
		double avg;
		String grade;
		kor = myInput(1); //점수 입력
		eng = myInput(2);
		mat = myInput(3);
		tot = sum(kor,eng,mat); //총점 계산
		avg = avg(kor,eng,mat); // 평균 계싼
		prn(tot, avg); // 총점 , 평균, 학점 출력

	}
	
	public static int myInput(int k) {
		Scanner sc = new Scanner(System.in);
		if (k==1) System.out.print("국어 점수 : ");
		else if (k==2) System.out.print("영어 점수 : ");
		else System.out.print("수학 점수 : ");
		return sc.nextInt();
	}
	public static int sum(int kor, int eng, int mat) {
		return kor+eng+mat;
	}
	public static double avg(int kor, int eng, int mat) {
		return sum(kor,eng,mat)/3.0;
	}
	public static void prn(int tot, double avg) {
		System.out.printf("총점 : %d\n평균 : %.2f",tot,avg);
	}
}

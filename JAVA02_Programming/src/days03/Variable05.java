package days03;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, mat, eng, total;
		double avg;
		String name1;
		// 이름 , 국어, 영어, 수학 점수를 입력 받아서 1명의 성적표를 총점 평균과 함께
		// 출력하세요
		// 문자를 입력 받는 명령 sc.nextLine()
		// 입력 받을때 반드시 이름부터 입력받으세요 --- ?? 왜그럴까 오류가 생긴다는데
		// 엔터 자체가 문자열에 입력해서 88 엔터 누르면 국어 점수 88점 이름 = 엔터 이렇게 받을 때가 있다는데 나중에 고려해보자
		System.out.printf("이름을 입력하시오. : ");
		name1 = sc.nextLine();
		System.out.printf("국어 점수를 입력하시오. : ");
		kor = sc.nextInt();
		System.out.printf("영어 점수를 입력하시오. : ");
		eng = sc.nextInt();
		System.out.printf("수학 점수를 입력하시오. : ");
		mat = sc.nextInt();
		
		total = kor + eng + mat;
		avg = total/3.0;
		System.out.printf("\t\t  ###성적표###\n");
		System.out.printf("---------------------------------------------------\n");
		System.out.printf("%3s\t\t%s\t\t%3s\t%3s\t%3s\t%3s\t%5s\n"	, 
				"번호","성명","국어","영어","수학","총점","평균");
		System.out.printf("---------------------------------------------------\n");
		System.out.printf("1\t\t%s\t\t%d\t%d\t%d\t%d\t%.2f\n", name1, kor,eng,mat, total, avg );
		System.out.println("1\t\t" + name1 + "\t\t" + kor + "\t" + eng + "\t" + mat + "\t" + total + "\t" + avg);
		System.out.printf("---------------------------------------------------\n");

	}

}

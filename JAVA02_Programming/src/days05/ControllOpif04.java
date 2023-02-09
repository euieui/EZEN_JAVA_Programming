package days05;

import java.util.Scanner;

public class ControllOpif04 {

	public static void main(String[] args) {
		int year;
		int na;
		Scanner sc = new Scanner(System.in);
		System.out.printf("출생년도 입력 : ");
		year = sc.nextInt();
		na = 2021 - year + 1;
		
		//12 세 미만 어린이, 12~18세 청소년,19~25세 청년,
		//26세 이상 나머지 성년
		System.out.println("나이 : " + na);
		if (na<12) System.out.println("어린이입니다.");
		else if (na<19) System.out.println("청소년입니다.");
		else if (na<26) System.out.println("청년입니다.");
		else System.out.println("성년입니다.");
		System.out.println("");
		// -- 나대로 고쳐보자
		if (na<1) System.out.println("잘못입력하셨습니다.");
		else if (na<12) System.out.println("어린이입니다.");
		else if (na<19) System.out.println("청소년입니다.");
		else if (na<26) System.out.println("청년입니다.");
		else System.out.println("성년입니다.");
	}

}

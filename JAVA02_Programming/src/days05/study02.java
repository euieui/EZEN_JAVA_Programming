package days05;

import java.util.Scanner;

public class study02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 판매실적금액에 과장 50%, 대리 25%, 사원 15%의 활동비를 합산하여 출력
		Scanner sc = new Scanner(System.in);
		String level;
		double a;
		System.out.printf("직급(과장, 대리, 사원) : ");
		level = sc.nextLine();
		// 반복문 해야 하는데 if( !(level.equals("과장") || level.equals("대리") || level.equals("사원")) );
		System.out.printf("급여 : ");
		a = sc.nextInt();
		if(level.equals("과장")) System.out.printf("합산 급여 : %.0f", a = (a *(1.5)));
		if(level.equals("대리")) System.out.printf("합산 급여 : %.0f", a = (a *(1.25)));
		if(level.equals("사원")) System.out.printf("합산 급여 : %.0f", a = (a *(1.15)));
	}
}

package days05;

import java.util.Scanner;

public class ControllOpif07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String level;
		int pay;
		System.out.printf("직급 입력(과장/대리/사원) : ");
		level = sc.nextLine();
		System.out.printf("판매실적금액 입력 : ");
		pay = sc.nextInt();
		// 판매실적금액에 과장 50%, 대리 25%, 사원 15%의 활동비를 합산하여 출력
		
		// 또 안된다..
		// --- 밥먹으면서 생각해냄 printf %도 알지? 잘알아야한다
		// --- 문자열 비교 하는거 후 .... 알지? python 이랑 다르다 ..
		// --- a.equals(b) a와 b 가 같은지 true , false
		// --- a.compareTo(b) a와 b가 누가 큰지 결과값이 양수 a>b 음수 a<b
		double activity_pay;
		if (level.equals("과장")) {
			activity_pay = pay*1.5;
		}else if (level.equals("대리")) {
			activity_pay = pay*1.25;
		}else {
			activity_pay = pay*1.15;
		}  // --- 이것들 한줄 처리도 가능하다. 출력만 아니라 명령문 1개 인가봐
		System.out.printf("활동비 : %.0f", activity_pay );
		//--- 전역변수 지역변수 (근데 괄호 밖에 변수한번 지정해주면 된다)
	}

}

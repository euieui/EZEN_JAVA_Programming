package days08;

import java.util.Scanner;

public class ControllOpWhile01 {

	public static void main(String[] args) {
		// while 반복문
		// for 반복문은 정해진 횟수의 반복을 괄호안에 미리 정의 해놓고 반복하는 특징이 있습니다
		// while 문은 정해지지 않은 횟수의 반복을 처리하는데 주로 사용합니다.
		// 특정 조건이 만족할때까지 무한 수행합니다.
		// while(true) {  } -> 이 반복문은 종료되지 않습니다 : 무한 반복
		
		// for 명령을 이용한 일반 반복실행 : 10번 반복
		int i =1;
		for(i=1;i<=10 ; i++) {System.out.println("for");}
		
		// 위 for 문은 while 문으로 변경한 예
		i = 1;
		while(i<=10) {i++; System.out.println("while");} // 이렇게도 쓸 수 있구나
		// 괄호의 관계연산식의 참/ 거짓 유무를 먼저 판단한후 반복을 계속할지 결정합니다.
		// while 문의 경우 위에서 코딩한것 처럼 i++ 명령에 의해 반복 유지 유무가
		// 결정되는 것보단 특정 조건에 의해 순서와 상관없이 반복이 결정되는
		// 상황에 더 적절히 사용됩니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("메뉴 선택 : 1(저장), 2(불러오기), 3(종료)");
		int input = sc.nextInt();
		
		while(input !=3) {
			switch (input) {
			case 1 : 
			case 2 :
			case 3 :	
			}
			System.out.printf("메뉴 선택 : 1(저장), 2(불러오기), 3(종료)");
			input = sc.nextInt(); // 종료를 누르기 까지 무한정 반복
			// if (input==3) break; 뭐이게 뭔데? 이건 이해 안됌
		}
		// for 문도 이렇게 쓸 수있다 밖에서 다 제어 가능
		int k =1;
		for(; ;) {
			k++;
			if(k>10) break;
		}
	
	}

}

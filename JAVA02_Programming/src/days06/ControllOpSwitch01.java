package days06;

import java.util.Scanner;

public class ControllOpSwitch01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.printf("정수를 입력해주세요. : ");
		int a = sc.nextInt();
		
		/* if문을 사용했으면 이렇게
		if(a==1)System.out.println("1 을(를) 입력하셨습니다.");
		else if (a== 2) System.out.println("2 을(를) 입력하셨습니다.");
		else if (a== 3) System.out.println("3 을(를) 입력하셨습니다.");
		else if (a== 4) System.out.println("4 을(를) 입력하셨습니다.");
		*/
		
		// Switch 문은 if 문과 비슷한 구조이지만, 변수값의 단순 참조에 의해 실행될
		// 명령이 선택되는 것이 다릅니다
		
		switch(a) { // 괄호안의 a변수값을 참조하여, 아래 해당 값이 있는 case에
			              // 있는 명령을 실행합니다
		// --- switch 가 숫자 말고 case 다른 방법도 되는지 한번 해봐야겠어
		case 1: // a 변수 값이 1일때 실행하는 명령이 쓰여지는 곳
			System.out.println("1 을(를) 입력하셨습니다.");
		case 2: // a 변수 값이 2일때 실행하는 명령이 쓰여지는 곳
			System.out.println("2 을(를) 입력하셨습니다.");
		case 3: // a 변수 값이 3일때 실행하는 명령이 쓰여지는 곳
			System.out.println("3 을(를) 입력하셨습니다.");
		case 4: // a 변수 값이 4일때 실행하는 명령이 쓰여지는 곳
			System.out.println("4 을(를) 입력하셨습니다.");
		case 5: // a 변수 값이 5일때 실행하는 명령이 쓰여지는 곳
			System.out.println("5 을(를) 입력하셨습니다.");	

		System.out.println();	
		switch(a) { 
			case 1: 
				System.out.println("1 을(를) 입력하셨습니다.");
				break;
			case 2:
				System.out.println("2 을(를) 입력하셨습니다.");
				break;
			case 3: 
				System.out.println("3 을(를) 입력하셨습니다.");
				break;
			case 4: 
				System.out.println("4 을(를) 입력하셨습니다.");
				break;
			case 5: 
				System.out.println("5 을(를) 입력하셨습니다.");	
				break;
			}

			
		// --- break를 걸지 않으면 숫자 3을 넣을 시 case5까지 모두 출력된다
			
		// 단점 : 해당 case 만 실행하는게 아니라 아랫쪽 케이스를 모두 실행합니다.
		// 아래 케이스를 모두 실행하는 단점을 보완하기 위해 각 case 에 break를 추가
			
		}
	}

}

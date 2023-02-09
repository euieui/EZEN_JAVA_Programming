package days18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception08 {

	public static void main(String[] args) {
		// 순수하게 숫자만으로 이루어진 정수를 입력 받는 while 과 try- catch를 제정하세요
		// sc.nextInt() 는 입력 내용에 문자가 썩이면 (InputMismatchException 에러가 발생합니다.
		// 에러가 발생하면 , 입력 버퍼를 sc.next();를 실행해서 비우고
		// 잘못입력했습니다 메세지를 출력후 정상 입력까지 입력을 반복하는 코드를 작성합니다.
 
		///--- 내방법
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력해주세요 : ");
		int s = 0;
		while (true) {
			try {
				s = sc.nextInt();
				break;
			} catch( InputMismatchException e) {
				sc.next(); //--- 뭐 버퍼?  안하니까 팅김 짜증나네
				System.out.printf("잘못 입력했습니다. 정수를 입력해주세요 : ");
			
			}
		}
		System.out.printf("입력하신 정수는 %d 입니다.",s);
		
		
	}

}

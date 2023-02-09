package days08;

import java.util.Random;
import java.util.Scanner;

public class ControllOpWhile04 {

	public static void main(String[] args) {
		// 가위바위보
		Scanner sc = new Scanner(System.in);
		int b;
		System.out.print("가위(1), 바위(2), 보(3)  중 선택 (종료-0) : ");
		b = sc.nextInt();
		
		Random rd = new Random();
	
		// 1 2 3 으로 나오게 한다
		// System.out.println(k);
		
		while (b!=0) {
			
			int k =rd.nextInt();  // 밀리 초 기반으로 랜덤이구나 결국 언제 눌렀는지? 아니 그럼 제어가 가능
			if(k<0) k = k * -1;
			k = k % 3 + 1;
			
			// 1 2 3 으로 나오게 한다
			// System.out.println(k);
			
			if (b==1) System.out.printf("나 : 가위\n");
			else if (b==2) System.out.printf("나 : 바위\n");
			else System.out.printf("나 : 보\n");
			
			if(k==1) System.out.printf("컴퓨터 : 가위\n");
			else if(k==2) System.out.printf("컴퓨터 : 바위\n");
			else  System.out.printf("컴퓨터 : 보\n");
			
			if(b==k) System.out.printf("비겼습니다.\n");
			else if (b==1 && k==3) System.out.printf("승리하셨습니다.\n");
			else if (b==2 && k==1) System.out.printf("승리하셨습니다.\n");
			else if (b==3 && k==2) System.out.printf("승리하셨습니다.\n");
			else System.out.printf("패배하셨습니다.\n");
			
			System.out.print("\n가위(1), 바위(2), 보(3)  중 선택 (종료-0) : ");
			b = sc.nextInt();

		} // 반복문 안에다가 랜덤을 넣어야해 아니면 컴퓨터가 같은 것만 내게 된다.
		
		System.out.println("프로그램 종료");
	}

}

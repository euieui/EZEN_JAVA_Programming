package days09;

import java.util.Random;
import java.util.Scanner;

public class Array12 {

	public static void main(String[] args) {
		// 야구 게임 프로그램
		// 상대가 나에게 알려주지 않은 숫자를 질문과 답변을 통해 맞춰가는 게임
		// 나에게 아렬주지 않은 숫자 : 6 5 7 같은 한자리 숫자 세개
		// 질문 : 3 6 7 같은 한자리 숫자 세개
		// 다변 같은 숫자가 자리수가 같으면 S 숫자만 같으면 B
		// 숫자 하나는 0~9까지 ... 세개의 숫자 중 중복 숫자 없음
		
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int i ;
		int j ;
		int s=0, b=0; //스트라이크와 볼
		// 1. 컴퓨터가 기억할 숫자를 저장할 배열, 사용자가 입력한 숫자를 저장할 배열생성
		//     각각 세칸짜리 배열
		int computer [] = new int [3];
		int human [] = new int [3];
		// 2. 컴터가 나에게 알려주지 않은 숫자 3개를 결정 -> 배열에 저장
		for ( i =0 ; i<computer.length ; i++){
			
			computer[i] = rd.nextInt();
			if(computer[i]<0) computer[i] *= -1;
			computer[i] = computer[i] %10;
			for(j=0 ; j<i; j++)
				if(computer[i]==computer[j]) break;
			if(i!=j) i--;
			
		}
		// System.out.println(computer[0] + " " + computer[1] + " " + computer[2]);
		// 3. 컴퓨터에게 사용자가 맞추고자 하는 숫자를 입력
		while(true) {
			System.out.print("입력(세자리숫자-중복되지 않게) : ");
			
			/* 
			// 강사님 1번째 방법 1234 입력시 별로다
			int num = sc.nextInt();
			human[0] = num/100;
			human[1] = (num%100)/10;  // --- 내생각 user[0] - num/10;
			human[2] =  num%10;                          // --- user[0] -
			System.out.println(human[0] + " " + human[1] + " " + human[2]);
			*/
			
			// 강사님 2번째 방법
			// 세개의 아라비아 기호를 한번에 입력 받아 하나씩 분리 -> 숫자로 변환
			String num = sc.nextLine();
			human[0] = num.charAt(0) - '0';  // '4' - '0' -> 4
			human[1] = num.charAt(1) - '0';  // '4' - '0' -> 4  // 여기서 charAt 이게뭐야?
			human[2] = num.charAt(2) - '0';  // '4' - '0' -> 4
			// System.out.println(human[0] + " " + human[1] + " " + human[2]);
			
			/*
			for (i =0 ; i <human.length ; i++) {
				System.out.printf("%d 번째 숫자 입력하세요 (0~9) : ",i+1);
				human[i] =sc.nextInt();
				if (human[i]>9 || human[i]<0)
			}
			*/  // 내가 할려던거
			
			
			// 4. 입력 받은 숫자와 저장한 컴퓨터 숫자를 비교해서 스트라이크와 볼을 카운트
			s=0;
			b=0;
			for(i=0; i<computer.length; i++) {
				for(j=0; j<human.length; j++) {
					if(computer[i]== human[j]) {
						if(i==j)s++;
						else b++;
					}
				}
			}
			
			// 5. 스트라이크와 볼을 출력
			System.out.println(s + " Strike " + b + " Ball");
			// 6. 3~5번 까지를 컴퓨터 숫자와 동일한 숫자를 입력할때까지 반복
			if(s==3) break;
		}
	
		
		
		
		
		
		
		
		
	}

}

package days09;

import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		char [] grade = {'F','F','F','F','F','F','D','C','B','A'};
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를 입력 하세요 : ");
		int score = sc.nextInt();
		
		int tp = score / 10;
		System.out.printf("학점은 : %c 입니다.", grade[tp]);
		
		// 입력 받은 점수에 따라 학점을 출력하되, if 사용하지 않고, 배열을 사용하세요
		// 90 A  80 B 70 C  60 D
		
		// 힌트 98 / 10 -> 9  힌트없이 과연 내가 할 수 있을까?

		
		// --- F를 여러개 썼다는 것에서 파악을 하고 첨자는 숫자이다 
		// --- 이 구조들을 파악하고 생각한다
		// --- 미쳤네 왜이리 재밌냐 ㅋㅋㅋㅋ
		// --- 역시 하고싶은걸 해야한다..
		
		

	}

}

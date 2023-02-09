package days08;

import java.util.Scanner;

public class ControllOpWhile05 {

	public static void main(String[] args) {
		int std, k, i, j; // 학생수 , 과목수, 반복실행 변수 i , j
		int tot, num; // 총점, 방금 입력받은 점수가 저장될 변수
		double avg; // 평균이 저장될 변수
		
		Scanner sc =new Scanner(System.in);
		System.out.print("학생수 입력 : ");
		std = sc.nextInt();
		System.out.print("과목수 입력 : ");
		k =sc.nextInt();
		
		// 입력된 학생수 만큼의 성적표를 총점과 평균만 성적표 양식으로 출력해주세요
		// 2중반복문이 쓰인다 뭘원하는건지 모르니까 짜증나
		// 아니 왜 여기서 while를 쓰는지도 모르겠음 정말 답답하네
	
		/*
		System.out.println("\t\t####성적표####");
		System.out.println("-----------------------------------------------");
		 */
		for (i=0 ; i<std ; i++) {
			System.out.println((i+1) + " 번 학생 ----------------------------");
			tot = 0;
			for (j=0 ; j<k ; j++) {
				System.out.printf("%d번째 과목 점수 : ",j+1);
				num=sc.nextInt();
				tot += num;
			}
			avg = tot/(double)k;
			System.out.printf("총점 : %d, 평균 : %.2f\n",tot,avg);
			System.out.println("---------------------------------------------");
			
		}
		// 아니 이모양을 원한거야?  출력을 뭘 원하는거지?

	}

}

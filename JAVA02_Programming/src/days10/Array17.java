package days10;

import java.util.Scanner;

public class Array17 {

	public static void main(String[] args) {
		// 3명 학생의 3과목 점수 저장 배열. 마지막 열은 총점
		int [][] score = new int [3][4];
		String [] name = new String[3]; // --배열안에 주소가 있지만 2차원 배열은 아니다 뭔소린지 알겠어
		double [] avg = new double[3];
		
		Scanner sc = new Scanner(System.in);
		for ( int i = 0; i<score.length ; i++) {
			System.out.printf("%d번 학생의 이름 : ", i+1);
			name[i] = sc.nextLine();
			for (int j = 0 ; j<score[i].length -1 ; j++) { // 맨끝이 총점이니까 length -1
				if (j==0) System.out.printf("%d번 학생의 국어점수 입력 : ", i+1);
				else if (j==1) System.out.printf("%d번 학생의 영어점수 입력 : ",i+1);
				else System.out.printf("%d번 학생의 수학점수 입력 : ",i+1);
				score[i][j] = sc.nextInt(); 
				score[i][3] = score[i][3] + score[i][j];
			}
			sc.nextLine(); // --- 점수를 입력하고 엔터는 바로 위에 입력되어서 학생이름을 입력할수가 없다 와 소름이네 ... 이게 이리 복잡하구나
			avg[i] = score[i][3] /3.0;
		}
		
		System.out.println("\t\t####성적표####");
		System.out.println("--------------------------------------------------");
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------");
		for (int i=0; i<score.length;i++) {
			System.out.printf("%d\t",i+1);
			System.out.printf("%s\t\t",name[i]);
			for(int j=0 ; j<score[i].length;j++)
				System.out.printf("%d\t",score[i][j]);
			System.out.printf("%.2f\n",avg[i]);
		}
		System.out.println("--------------------------------------------------");
	}

}

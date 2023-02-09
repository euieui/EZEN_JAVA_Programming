package days09;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// 3명의 학생 국어 영어 수학 총점 평균
		Scanner sc = new Scanner(System.in);
		System.out.printf("학생이 몇명 입니까 : ");
		int std = sc.nextInt();

		int [] kor = new int[std];  // 3명의 학생의 국어 점수 저장용
		int [] eng = new int[std];  // 영어 점수용
		int [] mat = new int[std];  // 수학 점수용
		int [] tot = new int[std];  // 총점 용
		double [] avg = new double[std]; //평균용
		
		
		
		for (int i =0 ; i<std ; i++) {
			System.out.printf("%d 번 학생의 국어점수를 입력하세요 : ",i+1);
			kor[i]=sc.nextInt();
			System.out.printf("%d 번 학생의 영어점수를 입력하세요 : ",i+1);
			eng[i]=sc.nextInt();
			System.out.printf("%d 번 학생의 수학점수를 입력하세요 : ",i+1);
			mat[i]=sc.nextInt();
			
			// tot[i] = kor[i] + eng[i] + mat[i];
			// avg[i] = tot[i] /3.0;
		}
		for (int i = 0; i<std; i++) {                 // --- 위에 들어가도 된다. 주석처리
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i] /3.0;
		}
		System.out.println("\t\t###성적표###");
		System.out.println("----------------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		for(int i = 0 ; i<=2 ; i++ ) 
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n",i+1,kor[i],eng[i],mat[i],tot[i],avg[i]);
		System.out.println("----------------------------------------------");	
			
		
		
		
		
	}

}

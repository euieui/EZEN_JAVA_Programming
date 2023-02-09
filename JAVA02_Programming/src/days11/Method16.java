package days11;

import java.util.Scanner;

public class Method16 {

	public static void main(String[] args) {
		int [][] scores;
		//int s = getStudentNumber(); // 학생수를 입력 받아서 리턴하는 메서드
		//int k = getSubjectNumber(); // 과목수를 입력 받아서 리턴하는 메서드
		//scores = new int[s][k];
		//scores = new int[getStudentNumber()][getSubjectNumber()]; //이렇게도 가능
		scores = new int[getStudentNumber()][getSubjectNumber()+1]; // 총점을 한번에 하는거 것도가능
		
		input(scores); // s 명의 학생과 k 개의 과목수 입력
		output(scores); // 총점 평균 계산후 성적표 출력
		// ------------------ 성적표 ----------------
		// -----------------------------------------
		// 번호 과목1 과목2 과목3.... 총점 평균
		// -----------------------------------------
		
		// 확인
		/*
		for (int [] scoresAddr : scores) {
			for ( int j : scoresAddr) {
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
		*/
		
		// Method 15랑 16 잘비교하자!
	}
	public static int getStudentNumber() {
		Scanner sc =new Scanner(System.in);
		System.out.print("학생수 : ");
		return sc.nextInt();
	}
	public static int getSubjectNumber() {
		Scanner sc =new Scanner(System.in);
		System.out.print("과목수 : ");
		return sc.nextInt();
	}
	/*
	public static void input(int [][]  a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i<a.length ; i++) {
			for (int j = 0 ; j <a[i].length ; j++) {
				System.out.printf("%d 번 학생 %d과목 점수 : ",i+1,j+1);
				a[i][j] = sc.nextInt(); //- 이게 왜 안되냐구
			}
		}		
	}
	*/
	
	
	// 총점 포함한 intput
	public static void input(int [][]  a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i<a.length ; i++) {
			for (int j = 0 ; j <a[i].length-1 ; j++) {
				System.out.printf("%d 번 학생 %d과목 점수 : ",i+1,j+1);
				a[i][j] = sc.nextInt(); //- 이게 왜 안되냐구
				a[i][a[i].length-1] += a[i][j];
			}
		}		
	}
	
	// 내가한거
	/* 
	public static void output(int [][]a) {
		System.out.println("-------------------성적표--------------------");
		System.out.println("---------------------------------------------");
		System.out.printf("번호\t");
		for(int j = 0 ; j<a[0].length ; j++) {
			System.out.printf("과목%d\t",j+1);
		}
		
		double avgAddr[] = new double[a.length];
		int sumAddr [] = new int[a.length];
		for (int i = 0 ; i<a.length ; i++) {
			for(int j = 0 ; j<a[i].length ; j++) {
				sumAddr[i] += a[i][j];
				avgAddr[i] = sumAddr[i]/(double)a[i].length;
			}
		}
		System.out.printf("총점\t평균\n");
		for(int i = 0 ; i<a.length ; i++) {
			System.out.printf("%d\t",i+1);
			for (int j = 0 ; j<a[i].length ; j++) {
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.printf("%d\t",sumAddr[i]);
			System.out.printf("%.2f\n",avgAddr[i]);
		}
		
	}
	*/
	
	// 총점 포함한 input
	private static void output(int[][] s) {
		int k =s[0].length;
		System.out.println("\t\t======성적표======");
		System.out.println("--------------------------------");
		System.out.printf("번호\t");
		for(int j = 0 ; j<k-1 ; j++) {
			System.out.printf("과목%d\t",j+1);
		}
		System.out.printf("총점\t평균\n");
		System.out.println("-------------------------------------");
		for(int i = 0 ; i<s.length ; i++) {
			System.out.printf("%d\t",i+1); // 번호
			for (int j = 0 ; j<k ; j++) {
				System.out.printf("%d\t",s[i][j]); //과목점수와 총점까지
			}
			System.out.printf("%.2f\n",s[i][k-1]/(double)(k-1));
		}
		System.out.println("-------------------------------------");
		
	}
	
	

}

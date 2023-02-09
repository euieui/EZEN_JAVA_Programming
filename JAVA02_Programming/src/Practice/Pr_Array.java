package Practice;

import java.util.Random;
import java.util.Scanner;

public class Pr_Array {

	public static void main(String[] args) {
		//배운지 11일? 12일? 다음엔 잘기억해서 쓰자
		
		int arryNum;
		arryNum=arryNum();
		int [][] arry = new int [arryNum][];
		output(arry);
		
		
	}
	
	// 메서드
	public static int arryNum() {
		Scanner sc = new Scanner (System.in);
		System.out.printf(" 배열 숫자 입력 : ");
		return sc.nextInt();
	}
	
	public static void output(int arry [][]) {
		int k = 0;
		int cnt = 1;
			
		for(int i = 0 ; i<arry.length; i++) {
			if (i<arry.length/2 ) {
				arry[i] = new int [i+1];
			}
			else arry[i] = new int [arry.length -i];
		}
		
		for(int i = 0 ; i <arry.length ; i++) {
			for (int j = 0 ; j <arry[i].length ; j++) {
				arry[i][j] = cnt++;
			}
		}
		
		for (int [] arryAddr : arry) {
			for (int y : arryAddr) {
				System.out.printf("%d\t",y);
			}
			System.out.println();
		}
		
	}
	
	
	
}

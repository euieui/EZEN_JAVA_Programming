package days12;

public class Method17 {

	public static void main(String[] args) {
		// 나중에 내가 원하는거 숫자 넣을때 탑형식으로 알아서 똭 되게 만들자
		
		int [][]a = new int [9][];
		
		input(a); // 그림과 같이 배열을 구성하고 값을 대입
		prn(a);	  // 그림과 같이 출력
		
		
	}
	
	/*
	public static void input(int[][]a) {
		a = new int[9][];
		int k =1;
		
		for (int i = 0 ; i <a.length/2 ; i++) {
			for(int j = 0; j<=i ; j++) {
			a[i][j] = k;
			k += 1;
			}
		}
		
	}
	public static void prn(int[][]a) {
		for (int []aAddr : a) {
			for ( int j : aAddr) {
				System.out.printf("%d\t",j);
			}
			System.out.println();
		}
		
	}
	*/
	public static void input(int[][]a) {
		// a= new int[9][];
		for (int i=0; i<9; i++) {
			if (i<=9/2) a[i] = new int[i+1];
			else a[i] = new int[9-i];
		}
		int k = 1;
		for (int i = 0 ; i<a.length ; i++) {
			for(int j = 0 ; j<a[i].length; j++) {
				a[i][j] = k++;
			}
		}
	}
	public static void prn(int [][]a) {
		for (int [] aAddr : a) {
			for(int k : aAddr) {
				System.out.printf("%d\t",k);
			}
			System.out.println();
		}
	}
	
}

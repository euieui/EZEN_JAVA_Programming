package days10;

public class Array14 {

	public static void main(String[] args) {
		int [] a = new int [10];
		int k = 1;
		for (int i = 0 ; i<a.length ; i++)
			a[i] = k++ ;  // --- 잘봐라 a[0] = 1 이 들어감 , ++k; 이면 a[0] = 2 가 들어감
		for (int i = 0 ; i<a.length ; i++) System.out.printf("%d ",a[i]);
		System.out.println();
		
		for( int j : a) { // -- 변수를 따로 내가 선언하고 안에 int를 빼니까 안되네
			System.out.printf("%d ",j);
		}
		// a : 반복실행에 사용될 배열
		// j : 배열의 값을 하나씩 전달 받을 변수
		// 작성 조건
		// 1. j 변수는 a배열의 하나의 요소와 자료형이 반드시 같아야 합니다.
		// 2. 배열은 배열의 이름만 ':' 뒤에 간단히 써줍니다.
		// 동작 원리
		// - a 배열의 값들이 차례로 j 변수에 전달되면서 반복실행합니다
		// - a 배열의 요소갯수만큼 반복 실행합니다.
		
		System.out.println();
		System.out.println();
		k = 1;
		int [][] b = new int [5][5];
		for (int i = 0; i<b.length;i++) {
			for(int j = 0; j<b[i].length ; j++) {
				b[i][j]=k++;
			}
		}
		
		for(int [] bAddr : b) {     //  --- 일단 처음 b의 주소들을 먼저 넣어야해 (행먼저 넣어야지 ) 이해함
			for (int j : bAddr) {     // --- 그담 행들의 데이터들을 j에 넣는거지 이해함
				System.out.print(j + " ");
			}
			System.out.println();
		}
		

	}

}

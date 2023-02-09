package days09;

public class Array11 {

	public static void main(String[] args) {
		// 배열 a, b, c 생성 (각 갯수 10개)
		// a 배열에는 3의 배수들 10개 저장 - 반복 실행문 이용
		// b 배열에는 5의 배수들 10개 저장 - 반복 실행문 이용
		// c 배열에는 a배열과 b배열의 각 같은 인덱스 값들의 합을 저장 - 반복 실행문 이행
		// ex) c[3] = a[3] + b[3];
		// 출력
		// a배열 -> 3, 6, 9, 12, 15 ....
		// b배열 -> 5, 10, 15, 20, 25...
		// c배열 -> 8, 16, 24, 32, 40
		
		int i ; 
		int [] a,b,c;
		a = new int[10];
		b = new int[10];
		c = new int[10];
		
		for (i =0 ; i<a.length ; i++) {
			a[i] = (i+1)*3;
			b[i] = (i+1)*5;
			c[i] = a[i] + b[i];
		}
		System.out.printf("a 배열 -> ");
		for (i =0 ; i<a.length ; i++) System.out.printf("%2d ",a[i]);
		System.out.printf("\nb 배열 -> ");
		for (i =0 ; i<a.length ; i++)	System.out.printf("%2d ",b[i]);
		System.out.printf("\nc 배열 -> ");
		for (i =0 ; i<a.length ; i++) System.out.printf("%2d ",c[i]);
		
		
		
		

	}

}

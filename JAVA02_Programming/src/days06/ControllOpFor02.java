package days06;

public class ControllOpFor02 {

	public static void main(String[] args) {
		int i;
		// 1부터 100사이의 정수 출력
		System.out.println("정수 출력 --------------------------------");
		for(i=1; i<=100;i++) {
			System.out.printf("%d ",i);
		}
		System.out.printf("\n반복 실행후의 i 변수 값 : %d\n",i);
		
		System.out.println("\n 1부터 100사이의 짝수 출력 #1----------");
		for(i=2;i<=100;i+=2) {
			System.out.printf("%d ",i);
			// 난 이렇게 했는데 강사님 다르게 했다!!
		}
		
		System.out.println("\n 강사님 1부터 100사이의 짝수 출력 #1----------");
		for(i=1;i<=100;i++) {
			if(i%2==0) System.out.printf("%d ",i);
		}
		
		
		System.out.println("\n 실습 1부터 100사이의 홀수 출력 #1----------");
		for(i=1;i<=100;i++) {
			if(i%2==1) System.out.printf("%d ",i);
		}
		
		System.out.println("\n 실습 1부터 100사이의 홀수 출력 #1----------");
		for(i=1;i<=100;i+=2) {
			System.out.printf("%d ",i);
		}
	}

}

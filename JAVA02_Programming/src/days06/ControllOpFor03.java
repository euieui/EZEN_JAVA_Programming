package days06;

public class ControllOpFor03 {

	public static void main(String[] args) {
		// 1부터 , 10까지의 합
		int i;
		int sum = 0;
		for (i=1;i<=65536;i++) {
			sum = sum + i;
			System.out.printf("%d 덧셈 결과 : %d\n",i,sum);
		}

	}

}

package days10;

import java.util.Scanner; // .이 많자나 궁금하네 ㅎㅎ 나중에 어케 되는지 아니 내가 어케 만드는지

public class Method05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("출력할 단을 입력하세요 : ");
		int k =sc.nextInt();
		gugudan(k);

	}
	public static void gugudan(int k) {
		for (int i = 1 ; i<10 ; i++) {
			System.out.printf("%d x %d = %d\n",k,i,k*i);
		}
	}

}

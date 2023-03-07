package days18;

public class study {

	public static void main(String[] args) {
		for(int i =0; i<10; i++) {
			int j = (int)(Math.random()*10);
		
			try {	
				int result = 100 / j;
				System.out.println(result);
			} catch(ArithmeticException e) {   /// --- 수학적 에러 catch 는  ArithmeticException
				System.out.println("0으로 나눴습니다.");
			}
			// 에러가 발생하면 catch 구문 안의 명령을 대신 실행하고 프로그램 실행을 계속합니다.
		}

	}

}

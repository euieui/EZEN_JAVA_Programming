package days18;

public class Exception03 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); // 실행되지 않는다.
		} catch(ArithmeticException e) {            ///--- ArithmeticExction 도 클래스다!
			e.printStackTrace();  // java.lang.ArithmeticException: / by zero
			System.out.println("예외메세지 : " + e.getMessage());
		}catch(Exception e) { // 종류별 예외 처리 2  /// --- Excption은 최상위 부모 예외처리 클래스
			System.out.println("Exception"); 
		}
		System.out.println(5);

	}

}

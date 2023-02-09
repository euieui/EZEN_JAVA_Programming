package days10;

public class Method04 {
	// Call By Reference 방식의 메소드 호출
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		int [] a = {111,222,333};
		System.out.println("\nmian 에서 출력 : ");
		for ( int i = 0 ; i<a.length ; i++)
			System.out.printf("a[%d] = %d\t",i,a[i]);
		
		updateValue(a);
		// 메소드의 매개변수로 참조변수의 값을 넘겨주는 방식( 배열 이름 변수,
		// String 참조 변수, Class 참조 변수 등)
		// 호출된 메소드에서 참조값을 사용해 값을 변경하게 되면 호출한 곳이
		// 가리키는 곳의 메모리에 직접 반영됩니다.
		
		System.out.println("\nmian 에서 출력 : ");
		for ( int i = 0 ; i<a.length ; i++)
			System.out.printf("a[%d] = %d\t",i,a[i]);
		// 와 이거는 변경되는구나 --- 
				// --- ex) 그림을 복사해서 보여주면 Call by Value
				//				집 주소를 알려주고 그림을 보라하면 Call by Reference 원보니 회손될 가능성 있다?
	}
		
	// int [] b -> 전달인수로 주소(참조값) 가 전달되므로 매개변수도 주소를 저장할
	// 참조 변수가 위치하고 있어야 정상 실행됩니다.
	
	public static void updateValue (int [] b) {
		b[0] = 100; b[1] = 200; b[2] = 300;
		System.out.println("\nupdateValue 에서 출력 : ");
		for ( int i = 0 ; i< b.length ; i++)
			System.out.printf("b[%d] = %d\t",i,b[i]);
	}
	// updateValue(a[0],a[1],a[3] ...)
	// public static void updateValue(int a, int,b ,inc ,...) 이거는 비효율적이 잖아
	
}

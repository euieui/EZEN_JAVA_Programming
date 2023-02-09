package days13;
// static 메소드
// staitc 멤버 필드와 같이 프로그램의 구동전에 메모리에 로딩되어
// 객체의 생성없이 클래스의 이름을 사용해 호출할 수 있는 메소드. 클래스 이름을 앞에도구
// (.)으로 연결해서 사용. 객체생성없이 사용이 가능합니다.
public class Class20 {

	public static void main(String[] args) {
		// static 메[서드의 실제 사용 예
		// 간단한 공용기능을 제공하기 위한 Math 클래스
		// Math 클래스 안에 public static int abs(int n) {} 와 같은 양식의
		// sqrt, random 메서드가 있음
		// abs : 절대값 계산 메서드, sqrt : 제곱근 계산 메서드. random : 난수 발생 메서드
		// Math 클래스의 random 메서드는 Random 클래스의 nextInt() 메서드와 양식은 다르지만
		// 역할은 같은 메서드 입니다.
		// 다만 Math 클래스의 random 메서드는 static 메서드 이므로
		// Math.random();와 같이 사용하고
		// Random 클래스의 nextInt() 메서드는 동적 멤버 메서드 이므로 객체 생성후
		// 호출객체를 앞에 두고 사용합니다
		// Random rd = new Random(); rd.nextInt();
		
		int num = -10;
		System.out.printf("nume + %d, num 변수의 절대값 = %d\n", num , Math.abs(num));
		
		num = 9;
		System.out.printf("num 변수의 제곱근 + %.2f\n",Math.sqrt(num));
		
		System.out.println("Math 클래스 난수발생 스태틱매서드 값 : "
				+ (int)((Math.random()*100)+1));   // rd.nextInt() % 100 +1 다름 0~100 까지 랜덤 출력
		System.out.println("0~33 난수발생 스태틱 매서드 값 : "
				+ (int)(Math.random()*33));

		// Interger 클래스 (int 타입과 매핑되는 클래스)
		// Interger 클래스의 parseInt 메소드는 문자열로 되어 있는 정수값을 int 타입으로 반환
		String strNum1 = "100";
		String strNum2 = "50";
		// 문자열 결합
		System.out.println(strNum1 + strNum2); // 이상하지~?
		// (strNum1.charAt(0) - '0')*100
		// + (strNum1.charAt(1)-'0')*10
		// + (strNum1.charAt(2) -'0')*1      // 이리해야 바껴 ㅇ 근데이것도 static 메서드 아니냐 ㅎㅎ
		
		// 문자열의 값을 전수로 변환한 후 연산
		System.out.println(Integer.parseInt(strNum1)+Integer.parseInt(strNum2));
				
		
		// Double 클래스 (double 타입과 매핑되는 클래스)
		// Double 클래스의 parseDouble 메소드는 문자열로 되어있는 실수값을
		// double 타입으로 반환
		strNum1 = "10.75";
		strNum2 = "5.2";
		// 문자열 결합
		System.out.println(strNum1 + strNum2);
		// 문자열의 값을 실수로 변환한 후 연산
		System.out.println(Double.parseDouble(strNum1)+Double.parseDouble(strNum2));
		
		// 정수나 실수를 문자로 바꾸는 스태틱 메서드는 Stirng 클래스 내에 있습니다
		strNum1 = String.valueOf(1234);
		strNum2 = String.valueOf(123.454);
		System.out.println(strNum1 + strNum2);
		
		
	}  // main 끝

}  // class 끝

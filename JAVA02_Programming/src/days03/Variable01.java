package days03;

public class Variable01 {

	public static void main(String[] args) {
		System.out.println(35 + "+" + 38 + "=" + (35+38));
		System.out.println(35 + "-" + 38 + "=" + (35-38));
		System.out.println(35 + "x" + 38 + "=" + (35*38));
		System.out.println(35 + "/" + 38 + "=" + (35/38.0));
		System.out.println(35 + "%" + 38 + "=" + (35%38));
		
		// 변수 : 프로그램 실행중 발생 또는 입력되는 데이터를 저장할 목적으로 만들어서
		// 사용하는 임시 저장장소. 생성 명령 실행시 생성되고, 프로그램 종료시 소멸됩니다.
		
		
		// --- 변수 : 주기억장치에 저장이 되는구나 --- 
		// --- 연산과 관련된건 모두 중앙처리장치(CPU) 에서 발생(변수의 사용 프린트 보기) -> 이거 나중에 속도 늦춰지지 않나 ---
		
		// 변수의 이름을 만드는 규칙
		// 1. 인터넷 사이트 회원가입시 만드는 아이디 이름 규칙과 비슷합니다.
		// 2. 영문과 숫자, 그리고 일부 특수문자(_)를 섞어서 사용가능하지만
		// 3. 첫글자는 반드시 영문으로 사용합니다.
		// 4. 중간에 공백이 있을 수 없습니다.
		// 5. 너무 짧지 않게 약간의 의미를 부여해서 이름 생성하는 편입니다.
		// 6. 변수의 이름이 너무 짧으면, 변수의 갯수가 많아졌을때 서로의 용도를 구분하기 어렵습니다.
		// 7. 변수의 이름이 너무 길면, 사용할때 마다 그 긴 이름을 타이핑해야하는 불편함이 있습니다.
		// 8. 두가지 의미의 단어가 조합되어 변수 이름이 만들어 진다면 첫단어는 소문자로,
		//     두번째 단어 첫 글자 대문자로 생성합니다.
		// ex) 덧셈의 결과를 저장할 변수 이름 : plusResult
		
		int a;  // a 라는 이름의 변수를 생성 (정수를 저장하기 위한 변수)
		int b;  // b 라는 이름의 변수를 생성 (정수를 저장하기 위한 변수)
		int plusResult, minusResult, mutiplyResult; // 한번에 여러 변수를 생성
		double divideResult; // divideResult 라는 이름의 변수 생성 (실수를 저장할 변수)

		// a = 10.125; // 에러  (억지로 넣는다면 10만 넣어진다 데이터 손실 발생)
		divideResult = 100; // (.0이 알아서 붙어서 변수에 넣음 데이터 손실이 없음)
		
		// boolean = '참/거짓' 진위형 변수
		boolean b1;
		b1 = true;
		System.out.printf("printf 변수 b1 의 값 : %b\n",b1); // boolean 출력할땐 %b
		System.out.println("println 변수 b1 의 값 : "+b1);
		// int - 정수형 자료형 1          4 Byte형 정수 (21억)
		// long - 정수형 자료형 2       8 Byte형 정수
		// float - 실수형 자료형 1       4 Byte형 실수
		// double - 실수형 자료형 2   8 Byte형 실수
		// char - 문자형 자료형-1 글자형 자료 'a', 'b' 2 Byte
		char c;
		c = 'A'; // --- 큰 따옴표 에러
		System.out.printf("변수 c 의 값 : %c\n",c); // --- %c char
		System.out.println("변수 c 의 값 : " + c);
		// String - 문자열 자료형: 현재는 자료형이라고 부르지만 엄밀히 자료형은 아니며 (객체임 자료형이 아니라 따라서 용량이 정해짐)
		//                                 이후 객체단원에서 자세히 학습 할 예정입니다.
		// 									지금은 그냥 여러문자를 하나의 자료로 저장할 수 있는 자료형으로 이해하시면 됩니다.
		// 문자열 : "a", "Abc", "aBCD", ""
		String s;
		s = "ABCD";
		System.out.printf("변수 s의 값 : %s\n",s); // --- %s String
		System.out.println("변수 s의 값 : " + s);
		
		// 변수에 값을 대입하고 연산한 결과를 다른 변수에 저장합니다.
		a = 15;
		b = 11;
		plusResult = a + b;
		minusResult = a - b;
		mutiplyResult = a * b;
		System.out.printf("%d + %d = %d\n",a,b,plusResult);
		System.out.printf("%d - %d = %d\n",a,b,minusResult);
		System.out.printf("%d x %d = %d\n",a,b,mutiplyResult);
		System.out.println(a + " + " + b + " = " + plusResult);
		System.out.println(a + " - " + b + " = " + minusResult);
		System.out.println(a + " x " + b + " = " + mutiplyResult);
		
		// 캐스트 연산 : 호환성이 있는 자료들 사이에서만 현재 명령에서 잠시 형변환
		divideResult = a / (double)b;  // 정수와 정수 나누면 정수로 나온다
		System.out.printf("%d ÷ %d = %f\n",a,b,divideResult);
		System.out.println(a +" ÷ " + b + " = " + divideResult);
		
		// --- 캐스트 연산 안할시 발생 
		divideResult = a / b;  // 정수와 정수 나누면 정수로 나온다
		System.out.printf("%d ÷ %d = %f\n",a,b,divideResult);
		System.out.println(a +" ÷ " + b + " = " + divideResult);
		
		// --- bit , Byte  설명
		// --- 2진수
		// --- 10 -> 1010   15 -> 1111
		// --- 0 or 1 : 1bit - 1비트로 표현할수 있는 정보의 갯수 : 2개
		// --- 2비트 : 4개 (00 01 10 11)
		// --- 3비트 : 8개 (000 ~ 111)
		// --- ... 8비트 : 256개 = 1byte
		// ---   16비트 : 65536개 = 2byte
		
		
	}

}

package days02;

public class Printf02 {

	
	public static void main(String[] args) {
		// printf 안에서  %와  d , f, s 사이에 숫자옵션을 넣어서 표시할 자리수를 
		// 조절합니다
		
		// 정수의 자리수 조절
		// %와 d 사이에 숫자를 안쓴경우 : 표시될 데이터의 자리수만큼 확보한 후 출력
		System.out.printf("정수%d정수\n", 123);
		// %와 d 사이에 숫자를 쓴경우 : 쓴 숫자만큼 자리 확보후 출력데이터를 출력
		// 만약 자리가 모자르다면 자동 자리추가. 자리가 남는다면 공백을 채워 출력합니다
		System.out.printf("정수%3d정수\n", 12345);
		System.out.printf("정수%10d정수\n", 12345);
		// 출력될 자리 확보후 왼쪽 정렬
		System.out.printf("정수%-10d정수\n\n", 12345);

		 // 문자의 자리수 조절
		// 숫자를 안쓴경우 : 출력데이터 만큼 자리확보
		System.out.printf("문자:%s꽃이 피었습니다\n", "무궁화");
		// 숫자를 썻지만 자리가 모자른 경우 : 필요한 만큼 자동 추가확보
		System.out.printf("문자:%2s꽃이 피었습니다\n", "무궁화");
		// 숫자를 쓰고 자리가 남는경우 : 공백으로 채움
		System.out.printf("문자:%10s꽃이 피었습니다\n", "무궁화");
		// 왼쪽정렬
		System.out.printf("문자:%-10s꽃이 피었습니다\n\n", "무궁화");
		
		// 실수의 자리수 조절
		// 조절 숫자를 안쓴경우 : 소수점 윗자리는 필요한 만큼 확보, 아래자리는 6자리 확보
		System.out.printf("실수%f실수\n", 123.123);
		// 숫자를 쓴경우
		// %10.2f : 총 10자리 확보후 소수점 한자리 소수점 아래 숫자 2자리로 할당
		//               따라서 소수점 윗자리숫자는 7자리 가 할당됩니다
		 //              소수점 윗자리는 정수처럼 모자르면 추가확보, 남으면 공백으로 채웁니다
		// 소수점 아래는 표시될 자리만큼 표시하고 나머지를 자르거나, 남으면 0으로 채웁니다
		System.out.printf("실수%10.2f실수\n", 123.1234);
		System.out.printf("실수%10.4f실수\n", 123.12);
		System.out.printf("실수%3.1f실수\n", 123.12);
		// 왼쪽 정렬
		System.out.printf("실수%-10.2f실수\n", 123.1234);
	}

}

package days04;

public class Operator02 {

	public static void main(String[] args) {
		// 연산에 사용할 변수선언 및 값의 초기화
		// 초기화 : 변수 생성후 처음 값을 넣은 동작
		int n = 50;
		double d= 50.0;
		System.out.printf("n의 최초값 : %d\n",n);
		// 피연산자로 쓰인 변수와 연산의 결과를 저장할 변수가 같은 연산
		// 연산의 순서
		n = n + 10; // 간략하게 다음과 같이도 사용합니다. n+=10;
		// 1. 현재 n값(50) 과 두번째 피연산자인 10이 CPU로 전달되어 덧셈됩니다
		// 2. 연산결과가 돌아와서 다시 n 변수에 저장됩니다.
		//		연산에 참여했던 n값 50은 사라지고, 연산의 결과인 60이 n변수에 남습니다.
		System.out.println("n = n + 10 -> n : " + n);
		n = n -10; // n -= 10;
		System.out.println("n = n - 10 -> n : " + n);
		n = n *10; // n *= 10;
		System.out.println("n = n * 10 -> n : " + n);
		System.out.printf("d의 최초값 : %.1f\n",d);
		d = d /10.0; // d /= 10;     -- 나의 띵킹에 의하면 d/= 10.0; 이라고 해야 할 것 같다. 근데 여기서는 d가 50.0 으로 double 형
		//  --- d 가 double형 인게 맞는 것 같아 d에다가 다시 변수를 넣어야 하는데 실수형이여야 하니까 내 띵킹이 틀렸어
		System.out.println("d = d * 10 -> d : " + d);
		n = n %10; // n%=10;
		System.out.println("n = n % 10 -> n : " + n);
	
		// n = n + 1 ; n = n - 1;
		// 1씩 증가 또는 감소하는 증가/감소 연산자 ++ , --
		// 특정 변수의 값을 1 증가하거나, 감소시킬 수 있는 연산자
		// 대입연산자(=)를 사용하지 않고 값을 변경합니다.
		n= 50;
		n++;   // n+=1;
		System.out.println("n++ -> n : " + n);
		
		++n;
		System.out.println("n++ -> n : " + n);
		// 위와 같은 단항연산일때는 ++나 --를 앞 또는 뒤에 어느곳에 붙여도 똑같이 연산됩니다.
		
		// 앞 또는 뒤가 차이가 나는 곳은 다른연산에 섞여 있을때 입니다.
		System.out.println("현재 n값 : " + n);
		// 다른 연산 참여 후 1 증가
		System.out.println("println(n++) - > n : " + n++);  // --- 오 여기가 좀 이상하네 뒤에 있기 때문에 1증가가 나중에 된다.
		System.out.println("출력연산 후 n값 : " + n);
		
		System.out.println("현재 n값 : " + n);
		// 1증가 후 다른연산에 참여
		System.out.println("println(++n) -> n : " + ++n); // --- 앞에 있으면 먼저계산된다~ 1증가가 먼저
		System.out.println("출력연산후 n값 : " + n );
	}

}

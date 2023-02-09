package days15;
class SuperF{
	int superNum;
}
class SubF extends SuperF{
	int subNum;
}
public class Extends09_TypeCasting02 {

	public static void main(String[] args) {
		// 부모클래스의 객체 생성
		SuperF super1 = new SuperF();
		// 자식클래스의 객체 생성
		SubF sub1 = new SubF();
		
		// 1. 자식 클래스의 레퍼런스 변수의 값은 부모클래스의 레퍼런스 변수에 저장이 가능합니다.
		super1 = sub1;  /// --- subNum 은 접근이 불가능 밑에 3.을 봐보자
		super1 = new SubF();
		// 부모 <- 자식 O
		
		// 2. 부모클래스의 레퍼런스 변수의 값을 자식 클래스의 레퍼런스 변수에 저장할 수 는 없습니다.
		super1 = new SuperF();
		// sub1 = super1; // 에러
		// sub1 = new SuperF(); // 에러
		// 자식 <- 부모 X		  // --- 자식에게 부모를 맡기는건 X
		
		// 3. 1번에서 자식 인스터스를 저장하고 있는  부모 레퍼런스는 
		// 		부모가 상속해준 멤버변수에만 접근이 가능합니다.
		
		SuperF super2 = new SubF();
		super2.superNum = 100; // O
		// super2.subNum = 100; // X    --- 에러발생 이거 조옴 헷갈리수도 있겠네
		// --- 제일 의문인거 저렇게 다향성? 을 하는 이유가 뭘까
		
		SubF sub2 = new SubF();
		super2 = sub2;
		super2.superNum = 200; // O
		// super2.subNum = 300;   // X
		
		// 4. 만약 부모클래스의 인스턴스 준소를 자식 클래스의 레퍼런스 변수에 저장하려면
		// 		강제 캐스팅을 이용하여 저장은 할 수 있습니다.
		SuperF super3 = new SuperF();
		// SubF sub3 = (SubF)super3; /// --- 이건또 어케 되는걸까 그럼...? 변수를 어케 사용되는지 ? 실행하면 에러나옴 ㅅㄱ
		// 현재는 에러가 없는걸로 나타나지만 , 실행시에 런타임 에러가 발생합니다.
		
		// 실제 Heap 저장된 인스턴스의 타입이 자식 클래스가 아니면 프로그램 실행중
		// 런타임 에러가 발생되어 프로그래밍 종료 됩니다.'
		
		// 따라서 부모레퍼런스 값을 자식 레퍼런스에 넣을 수 있는 경우를 선별해야 하는데
		// 현재의 부모 레퍼런스 변수가 저장한 주소에 자식 인스턴스가 저장된 경우로 제한합니다.
		SuperF super4 = new SubF(); // --- d위와 다른점이 이것임
		SubF sub4 = (SubF)super4;   // --- 왜이러는 짓을 하는건지 궁금하구만
		// 자식 레퍼런스 <- (타입캐스팅)부모레퍼런스 <- 자식 인스턴스 주소
			
		// 강제 캐스팅을 사용한 형변환 시 에러를 방지하는 방법
		// insataceof 연산자
		SuperF super5 = new SuperF();  // 실행결과 : 형변환 실패
		// SuperF super5 = new SubF(); // 형변환 성공
		if (super5 instanceof SubF) {
			SubF sub5 = (SubF)super5;
			System.out.println("형변환 성공~!");
		} else {
			System.out.println("형변환을 실행할 수 없습니다.");
		}
		// 아래것들 모두 형변환이 가능
		SuperF super6 = new SubF();
		SubF sub6 = new SubF();
		SuperF super7 = sub6;
		SubF sub7 = (SubF)super6;  // (SubF)super7; 도가능
		
		
		
		// --- 현재 뭔소린지는 다 알겠지 알겠어 근데 왜왜?? 왜 이러냐구~~! 어디다가 써야하냐구!~!~! 그게 궁금하다구~!
	}

}

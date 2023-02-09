package days16;
interface InterC_Super1{
	void interC_Super1Test();
}
interface InterC_Super2{
	public abstract void interC_Super2Test();
}
// 인터페이스들간의 상속(extends) : 인터페이스 끼리 상속해서 부모의 추상메서드를
// 물려받을수 있습니다.


interface InterC_Sub extends InterC_Super1, InterC_Super2{   ///--- extends 를 쓰네? 
	public abstract void interC_SubTest();
	// public abstract void interC_Super1Test(); 상속받은 추상 메서드
	// public abstract void interC_Super2Test(); 상속받은 추상 메서드  ///---- 숨어있다고 생각하면된다
}
// 인터페이스끼리의 extends 는 추상매서의 override 의무는 면제 됩니다.
// 다만 상속받은 추상메서드를 보유하게 되어 이를 implements한 클래스가
// 오버라이드 하게 합니다.

// 클래스에서 다수개의 인터페이스를 구현(implements) 할 수 있습니다.
class SubC1 implements InterC_Super1, InterC_Super2{
	@Override
	public void interC_Super2Test() {}
	@Override
	public void interC_Super1Test() {}
}
// 일반 클래스가 인터페이스를 다수개 implements 했다면 그 인터페이스 들이
// 보유한 추상메서들을 모두 구현(override)해야합니다.

// 인터페이스 간 상속을 구현하고 있는 인터페이스를 클래스에서 구현하는 경우
// 부모 인터페이스의 추상메소드를 포함하여 모두 오버라이딩 해야 합니다.
class SubC2 implements InterC_Sub {
	@Override
	public void interC_Super1Test() {	}
	@Override
	public void interC_Super2Test() {	}
	@Override
	public void interC_SubTest() {	}
}

public class Extends12_Interface03 {

	public static void main(String[] args) {
		// 부모인터페이스의 레퍼런스 변수에 자식클래스의 객체를 대입
		InterC_Super1 s1 = new SubC2();
		InterC_Super2 s2 = new SubC2();
		InterC_Sub s3 = new SubC2();
		// 인터페이스를 다중 상속한 경우 부모 인터페이스는 자신의 추상메소드만을
		// 접근할 수 있습니다.
		s1.interC_Super1Test();
		s2.interC_Super2Test();
		// s1.interC_Super2Test(); // 에러 - 상속해주지않은 다른 인터페이스의 추상메서드
		// s2.interC_Super1Test(); // 에러 - 상속해주지않은 다른 인터페이스의 추상메서드
																///--- 잘 이해했지? 이거때문에 지금까지 배웠네 ㅋㅋ 더블 상속!
		/// ---- s1이 Super1에 레퍼런스가 되어있어서 Super1에 속한것만 사용가능한것
		
		s3.interC_SubTest();
		s3.interC_Super1Test();
		s3.interC_Super2Test();
		
	}
	// 일반 클래스는 extends 상속할때 다중 상속이 안될뿐
	// 클래스의 extends 와 interface 의 implements 도 동시 구현 이 가능 합니다.
	// class 자식 클래스명 extends 부모클래스명 implements 부모인터페이스명
	// 더불어 인터페이스는 여러개를 동시 implements 할 수 있습니다. /// ---- 이거 완전 나중에 꼬여서 할 수 있겠는데 헣허허허허허허....
	
	

}

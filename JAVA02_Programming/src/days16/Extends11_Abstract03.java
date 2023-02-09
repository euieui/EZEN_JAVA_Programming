package days16;
// 추상 클래스의 단점
// 추상 메소드 구현의 강제성!!
// 추상 메소드의 갯수가 많으면 상속에 부담을 주게 됩니다.
// 자식 클래스에서 사용하지 않을 추상 메소드라도, 객체 생성을 위해 반드시 구현해야 하는
// 문제점이 있습니다.
abstract class AbstractA{
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();
	public abstract void test4();
	public abstract void test5();
	public abstract void test6();
	public abstract void test7();
}
// AbstractA 클래스를 상속 받은 클래스는 필요없는 메서드가 있어도, 추상메서드를 모두
// 오버라이드(구현)해야 합니다.  // --- 그니까 꼭 추상으로 안해도 되는거아냐? 필요할때만 오버라이딩 하면 되잖아 
class AbstractA_Sub1 extends AbstractA{
	@Override
	public void test1() {	}
	@Override
	public void test2() {	}
	@Override
	public void test3() {	}
	@Override
	public void test4() {	}
	@Override
	public void test5() {	}
	@Override
	public void test6() {	}
	@Override
	public void test7() {	}
}
class AbstractA_Adapter extends AbstractA{
	public void test1() {}
	public void test2() {}
	public void test3() {}
	public void test4() {}
	public void test5() {}
	public void test6() {}
	public void test7() {}
}
// 모든 추상클래스가 구현(오버라이드)된 AbstractA_Adapter 클래스를 상속받아
// 사용하면 필요없는 메서드를 강제로 구현(오버라이드)하지 않고 필요한 것만 구현하여
// 사용할 수 있습니다.
class AbstractA_Sub2 extends AbstractA_Adapter{ ///--- 오 에러가 안뜨네 ㄹㅇ 어댑터 역할같은 느낌이구나
	public void test1() {
		System.out.println("test1 오버라이딩~!");
	}
}


public class Extends11_Abstract03 {

	public static void main(String[] args) {
		// 어댑터 클래스를 상속받은 클래스도 추상클래스으 ㅣ자식(손자)클래스가 됩니다.
		AbstractA obj = new AbstractA_Sub2();
		obj.test1();
		obj.test2();  /// --- 봐봐봐봐봐보바봐봐 이것봐 그냥 내가 원할때만 오버라이딩 하면되는거 아니냐고 추상 자체를 안만들면
		// 할아버지 손자간 다형성을 구현하여   ///--- 설마 다형성이 안만들어지나 ?? 절대 아닐것같은데 해보기
		// 물려주고 오버라이딩된 메서드를 할아버지 레퍼런스가 사용할 수 있습니다.
		
		/// ---- 요즘은 추상 클래스 잘 안쓴다네 봐봐봐 이상하게 왜 별로야 일단 이런게 있다는느낌
	}

}

package days16;
// 추상 클래스(abstract Class)
// 상속을 통한 다형성의 구현(메서드 오버라이드)에 강제성을 부여하기 위한 클래스 -- 이래야 무슨말인지 이해
// 추상메소드를 포함한 클래스 : 추상 메서드를 하나이상 포함하면 추상클래스라고 부릅니다
// 추상메서드 : 메소드의 원형만 존재하고 실제 내용이 없는 메소드

abstract class AbstractAnimal{
	public abstract void sound();
	// 메소드의 정의만 있고, 메소드의 body(몸체)구현은 없습니다 .   ///--- 그니까 {} 이게 없음
																					   /// --- 얘는 100퍼 오버라이딩을 해야 가능하다!!
}
// 추상메소드의 작성방법
// 접근지정자 abstract 리턴값의 타입 메소드명 (매개변수);
// 추상 클래스는 일반 클래스와 동일하게 일반 멤버변수 일반 메소드, 생성자 등을
// 포함할 수 있습니다.
// 단, 추상 메소드를 포함할 수 있는 특징이 추가된 클래스입니다.
// 추상클래스는 상속을 통한 다형성 구현을 위해서 생성됩니다.

class DogA extends AbstractAnimal{  //--- 오버라이딩 퍼블릭 붙여야 하나봄 
	/// --- class DogA extends AbstractAnimal{} 만하면 오류가 뜬다  sound() 오브라이딩이 필요하기 때문에
	public void sound() {    
		System.out.println("멍~멍~");
	}
}
// 추상클래스를 상속한 자식 클래스가 추상메서드를 오버라이딩 하지 앟는다면 에러
class CatA extends AbstractAnimal{
	public void sound() {
		System.out.println("야옹~");
	}
}
// 추상메서도를 오벌아디이한 자식클래스는 일반클래스로 사용될 수 있습니다.
// 추상클래스로 추상클래스만의 객체를 만들수는 없지만  //--- 그럼 활용도가 조오금 그렇네?
// 추상클래스(부모)의 레퍼런스 변수로, 자식클래스의 인스턴스 주소는 저장할 수 있습니다.
// AbstractAnimal a = new AbstractAnimal(); X
// 추상클래스는 내부에 완전치 못한 추상 메서드가 있으므로 객체생성이 안되지만
// AbstractAnimal a = new DogA(); O
// AbstractAnimal a = new CatA(); O
// 자식들의 인스턴스를 저장할 레퍼런스 변수로는 사용이 가능합니다. (다형성의 구현)
public class Extends11_Abstract02 {

	public static void main(String[] args) {
		AbstractAnimal dog = new DogA();
		AbstractAnimal cat = new CatA();
		System.out.println("강아지소리");
		dog.sound();
		System.out.println("고양이소리");
		cat.sound();
		

	}

}

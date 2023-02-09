package days16;
// 추상클래스
// 상속을 통한 다형성의 구현에 강제성을 부여하기 위한 클래스
// 상속의 문제점 : 강제성의 부재
// 상속을 통해 다형성(부모클래스를 상속받아 여러 형태의 자식 클래스를 생성하고 활용함)을
// 구현하고자 하여도, 하위클래스에서 메소드 오버라이딩을 구현하지 않으면 다형성을 완벽히 
// 구현할 수 없습니다.
// 이때, 오버라이딩을 구현하지 않는것이 문법상 문제가 없다는 점을 강제성의 부재라고 합니다.

/// --- 추상클래스를 쓰는 이유 ( 상속문제점때문에~~ 쓰는 이유인데)
class Animal{
	public void sound() {}
}
class Dog extends Animal {
	public void sound() { System.out.println("멍~멍~");}
} // 부모클래스의 sound 메소드를 오버라이딩한 강아지 클래스
class Cat extends Animal {
	
} // 부모클래스의 sound 메소드를 오버라이딩 하지 않은 고양이 클래스
// 부모클래스의 메소드를 오버라이딩 하지 않아도, 컴파일상 문제가 없습니다
// 이러한 문제는 프로그램의 구동 후에야 비로소 확인할 수 있습니다.
public class Extends11_Abstract01 {

	public static void main(String[] args) {
		Animal dog = new Dog();  //--- 부모클래스의 레퍼런스로 자식클래스 인스턴스를 넣어서 객체를 만듬
		Animal cat = new Cat();    //--- 그러면 자식 메서드가 나온다~ 오버라이딩된
		
		System.out.println("강아지 소리");
		dog.sound();
		System.out.println("고양이 소리");
		cat.sound();
	}

}

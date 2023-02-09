package days15;
// Object 클래스
// 사용자 정의 클래스를 생성하면서, extends(상속)을 구견하지 않으면 자동으로
// java.lang.Object 클래스를 상속
// Object 클래스는 Java 에서 사용되는 모든 클래스들의 최상위 부모 클래스 입니다.
// Subclass extends Super 라는 건 Subclass 는 Object 클래스를 상송하지 않지만
// Super 클래스가 Object 클래스를 상속하므로, Subclass 는 Object 클래스를
// 상위의 상위로 상속한것과 같은 의미 입니다.
class UserClass /* extends Object */{
	
}

public class Extends10_Object01 {

	public static void main(String[] args) {
		// --- Object 메서드들이 뭐가 있을까?
		UserClass obj = new UserClass();
		// getClass 메소드는 해당 객체의 클래스 이름을 리턴해주는 메서드
		System.out.println(obj.getClass()); // --- pakage.classname 이나온다
		// hashCode 메소드는 해당 객체의 해시코드값(다른객체와 구분하기위한 고유값)을 
		// 리턴해주는 메서드(JVM에 의해서 관리되고 있는 번호)
		System.out.println(obj.hashCode());
		// toStirng 메소드는 해당 객체의 정보를 문자열로 리턴해주는 메서드
		System.out.println(obj.toString()); 
		// 객체의 클래스명 + '@' + 해시코드값(16진수)
		System.out.println(obj); // System.out.println(obj.toString()); 와 같음
		// --- 와 toString 그래서 우리가 조금 바꾼거군 자식 메서드! 라는거야 대박이다 그니까 오버라이딩한거네
		// --- 우리 Card 만든거 toString 은 Object 메서드를 오버라이딩 한거다  후 ... 답답했는데 다알려주긴 하는구나
		// --- toString은 객체 이름만 써도 돼~ 내가 분명 어딘가 숨겨진 toString 이구나 생각했는데!! 진짜 내생각 딱맞아 대박이다 정말
		
	}

}

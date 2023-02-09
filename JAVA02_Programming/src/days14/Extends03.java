package days14;
// 접근지정자와 상속
// 부모클래스의 private 멤버는 아무리 자식 클래스라고 하더라도 접근할 수 없는 멤버입니다.
class SuperA {
	// private : 현재 클래스 내에있는 멤버 메서드를 통해서만 접근 가능한 완전 은닉 멤버 변수
	// --- public 안써도 같은 class 에서는 사용가능하지 않나 같은 class 라고 해야하나
	private int n1; 
	public int n2;
	// 디폴트 접근 지정자 : 동일한 패키지 내부에서는 public 으로 동작,
	// 다른 패키지에서는 private으로 동작
	int n3;
	public int getN1() {return n1;}  // public 안써도 getN1 할수 있을 듯
}

class SubA extends SuperA{
	public void printInfo() {
		// 부모클래스의 private 멤버에 접근할 수 없음
		// System.out.println(this.n1); 
		// 에러 : the field SuperA.n1. is not visible
		// 부모클래스의 public 멤버에 접근할 수 있음
		System.out.println(this.n2);
		// 동일한 패키지이므로 디폴트 접근기저장로 선언된 부모의 멤버에 접근할 수 있음
		System.out.println(this.n3);
		// public으로 선언된 멤버메서드를 이용하면, 부모 클래스의 private 멤버에도 접근이 가능합니다.
		System.out.println(this.getN1());
	}
}

public class Extends03 {

	public static void main(String[] args) {
		

	}

}

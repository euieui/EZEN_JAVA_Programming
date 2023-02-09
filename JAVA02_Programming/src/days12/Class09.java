package days12;

class Bclass{
	
	// ----- 같은 package 안에서 동일한 이름으로 못만든다 
	// ----- Aclass 는 days12.Class08 에 있다

	private int age;
	// 앞선 예제 Class08과 같이 클래스 내부에 생성자를 꺼내어 따로 정의하지 않으면,
	// 컴파일러는 자동으로 클래스 내부에 숨어 있는 디폴트 생성자를 호출합니다.
	// 디폴트 생성자 : Bclass(){}와 같이 생겨서 기본형태만 설정된 생성자
	// 아래와 같이 내용없이 생성자를 따로 정의하는 것은, 따로 생성자를 기술하지 않는 것과 같습니다.
	
	Bclass(){
	}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
}

public class Class09 {

	public static void main(String[] args) {
		Bclass b = new Bclass();
		// 따로 정의된 생성자가 없으면, 컴파일러 가 클래스 내부에 숨어있는 디폴트
		// 생성자를 호출

	}

}

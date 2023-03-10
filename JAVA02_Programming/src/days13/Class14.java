package days13;
// this 변수 : 레퍼런스(참조) 변수
// 클래스의 멤버필드들은 new 라는 키워드에 의해서 각각의 객체별로 생성됩니다.
// (서로 다른 (겹치지 않는) 메모리 공간)   /// ---- 밑에서 a1 a2 의 공간이 다르다~
// 반면, 멤버 메서드는 생성된(오버로딩 포함) 메서드별로 하나만 존재하며 모든 객들이 공유하게 됩니다.
//  ---- 멤버 메서드는 공유를 하지 저 아래처럼 a1.setNumt(); a2.setNumt();
// 이때 현재 메서드를 호출한 객체가 어떤 객체인지 구분하여 실행될 수 있게 this 라는
// 숨겨진 참조변수를 제공합니다.
class ThisA{
	private int num;
	public void setNum(int num /*, ThisA this*/) {   /// --- 위에 말이 왼쪽 저렇게 숨겨있다는 말 
		this.num = num;
		// this 에는 현재 메서드를 호출한 객체의 참조변수값이 전달되어 저장됩니다.
		// 매개변수로 선언된 num 변수는 현재 메서드안세어만 사용되는 지역 변수로만
		// 사용되고 소멸합니다.
		// 멤버 메서드에서는 멤버변수에 접근 권한이 있으므로, 참조변수 this와
		// 멤버변수가(.) 으로 연결되어 사용됩니다.
	}
	public void display(/* thisA this */) {
		System.out.printf("num = %d\n",num);
		// 매개변수와 멤버변수가 겹치는 상황 등 여러 이유로 this 꼭 사용해야하는 상황이
		// 있지만. 그런상황이 아니라면 위처럼 생략 가능합니다.
		
		// 보통 멤벼변수를 this 없이 사용해도 매개변수가 아니라면 아래의 실행 코드는
		// 내부적으로 this가 붙어서 다음과같이 변환되어 실행됩니다.
		// System.out.printf("num = %d\n",this.num);
	}
	// this 의 용도 1 : 멤버메서드를 호출한 호출객체의 참조변수값(주소값)을 전달받아
	// 전달된 호출객체를 식별하는 용도로 사용됩니다.       --- 다 잘 읽어보자
	
	void copy1(ThisA tmp) { // tmp <- a2가 전달   this<-a4 가전달
		this.num = tmp.num;    // 결국 this를 이용해야 하는구나
	}
	ThisA copy2() {
		ThisA a = new ThisA();
		a.num = this.num;
		return a;   // a5 <- a
	}
}

public class Class14 {	
	public static void main(String[] args) {
		ThisA a1 = new ThisA();   
		ThisA a2 = new ThisA();
		a1.setNum(10);
		a2.setNum(20);
		a1.display();
		a2.display();
		
		ThisA a3 = a1; // a1 참조변수 값을 a3에 복사하는 동작
		a3.setNum(100); // a3의 멤버변수만 수정.
		a1.display(); // 출력은 a1과 a3가 모두 수정되어 출력
		a3.display(); 
		// 위 연산은 new ㅡㄹ 이요하여 a3에 새로운 공간을 만든게 아니라,,
		// a1위 레퍼런스 값만 복사 저장한 결과로, a1 과 a3는 같은 공간의 주소를
		// 저장하고 있기 때문입니다.
		
		ThisA a4=new ThisA();
		a4.copy1(a2);   // 객체를 전달    // 객체 복사 방법 #1
		a2.setNum(200);
		a2.display();
		a4.display();
		
		// 객체 복사 방법 #2
		ThisA a5 = a1.copy2(); // 여기에 this가 뭐가는건지 보자
		a5.display();
		a1.display();

	}

}

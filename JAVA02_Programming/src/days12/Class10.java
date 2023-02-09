package days12;
class Cclass{
	private int age;
	//생성자는 메소드이므로 매개변수를 사용할 수 있습니다.
	// 1. 생성자의 매개변수를 활요하는 경우 각각의 객체마다 서로 다른 값을 가질 수 있습니다.
	Cclass(int age){
		this.age = age;
	}
	public int getAge() { return age;}
	public void setAge(int age) { this.age = age ;}
	
	// 5. 생성자 메서드 오버로딩을 통해 없어진 디폴트 생성자 문제를 해결할 수 있습니다   
	/// --- 오버로딩 같은 생성자이지만 전달인수가 다르면 다름!!!
	Cclass(){		
	}
	// ---- 아니 나 왜이렇게 이해 잘하지
	// ---- 진짜 미쳤다 그냥 선행하네 ㅋㅋㅋㅋㅋㅋㅋㅋㅋ
	// ---- ㄹㅇ 조온나 천재같음
}

public class Class10 {

	public static void main(String[] args) {
		// 2. 생성자에 전달인수를 만들고 다른 값을 전달하여, 객체마다 멤버변수의 초기값을
		// 달리 하여 시작할 수 있습니다.
		Cclass c1 =new Cclass(20);
		Cclass c2 = new Cclass(30);
		
		// 3. 클래스 내부에 매개변수를 갖든 안갖든 ,생성자가 꺼내어지고 정의가 되면 
		// 숨어 있떤 디폴트 생성자는 꺼내어져서 정의된 생성자로 대체되고 없어 집니다.
		
		// 4. 디폴트 생성자가 없어졌으므로 아래는 에러입니다.
		Cclass c3 = new Cclass();
		
		// 6. 디폴트 생성자가 생성 되었으므로 위에는 정상 실행됩니다.
		
	
		

	} /// main 끝

} // Class 10 끝

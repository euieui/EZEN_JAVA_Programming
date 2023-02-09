package days12;
class Animal {
	// 멤버 변수
	String name;
	int age;
	// 멤버 메서드   --- 아주특별한 경우 빼고는 static 을 안쓴다 나중에 배움
	public void output() {
		System.out.printf("나의 이름은 %s, 나이는 %d\n",name , age);
	}
	// 멤버메서드는 클래스형으로 생성된 객체 "전용" 메서드입니다.
	// 메서드의 실행이 객체 전용으로만 사용이 된다는 뜻입니다.
	// 멤버메서드의 내용을 객체와 상관없는 명령이 들어갈수도 있지만
	// 보통은 멤버변수들의 조작, 출력, 입력을 위한 명령들로 주로 구성됩니다.
	public void input(String n, int a) {
		name = n;
		age = a;
	}
	// 멤버메서드는 같은 클래스안에 있는 메서드 이므로, 변수앞에 객체이름을 쓰지 않습니다.
	// 다만 호출 객체정보는 자동으로 전달되서 어느 객체의 변수가 사용되는지 자동구분됩니다.
	
	// 멤버메서드는 특별한 경우를 빼고 static 키워드를 쓰지 않습니다.
	// 현재 프로그램에(패키지내의 같은 파일)서만 사용한다는 가정하에
	// public 도 생략 가능합니다.  --- public은 패키지 이동가능 근데? private나 안쓰는거랑 다른건가? 나의 의문
	
	String getName() {    //  n = a1.name;    --- 이것도 되는데 나중에는 메서드를 이용해야한다 why? 나중에 배운다
		return name;
	}
	
}


public class Class03 {

	public static void main(String[] args) {
		Animal cat1 = new Animal();
		Animal cat2 = new Animal();
		// 멤버변수가 어떤 객체의 변수인지 구분하기 위해, 변수이름 앞에 (객체이름.)을
		// 붙여서 사용하듯이 멤버 메서드도, 호출의 주체가 되는 객체이름을 반드시 써야합니다
		cat1.name = "나비(고양이)"; cat1.age = 2;
		cat1.output();
		cat2.output();
		
		cat1.name = "댕댕이"; cat1.age = 20; 
		// --- 나중에가면 안써진다고?? 뭔소리지?
		// --- 변수 설정이 안되나봐
		// --- 그럴땐 멤버메서드 사용 
		cat1.output();
		cat2.input("바둑이",25);   // --- 내가원한게 이거였는데 좋네
		cat2.output();
		
		String n = cat1.getName();
		System.out.println("cat1의 이름은 " + n);

	}

}

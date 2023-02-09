package days14;
// 초기화 블럭
class StaticF {
	private static int num = 1;
	private int number;
	// 초기화 블럭 : 객체 생성시 실행 (생성자와 성격이 비슷)
	// 단순 값으로 초기화하는 경우 대입연산자를 통해서 처리할 수 있지만,
	// 실행문이 포함된 초기화를 진행하는 경우 아래와 같이 초기화 과정을 정의할 수 있음
	{
		number = 100;
		System.out.println("인스턴스 변수 초기화 용 초기화 블럭");   ///  -- 보기만해서는 안되었다 이게 뭘까나
	}
	// static 블럭 : static 멤버를 초기화하기 위한 영역
	// 단순 값으로 초기화하는 경우 디앱연산자를 통해서 처리할 수 있지만,
	// 실행문이 포함된 초기화를 진행하는 경우 아래와 같이 초기화 과정을 정의할 수 있음
	static{
		System.out.println("StaticF의 static 블럭 실행");
		num = 55;
	} // static 블럭은 객체 생성 이전에, 프로그램 시작시에 실행됩니다.
	
	static int cnt = 0 ;
	int serialNo;
	{
		++cnt;
		serialNo=cnt;
		System.out.println("인스턴스 변수 초기화 용 초기화 블럭2");
	}
	// static 멤버를 초기화 하기위한 public static 메소드 선언
	// (메소드로 초기화 과정을 진행하기 때문에 반드시 메소드를 호출해야함)
	public static void setNum(int num) {StaticF.num = num;}
	public static int getNum() {return num;}
	
}
public class Class25 {

	public static void main(String[] args) {
		/// --- 우리가 멤버 변수에다가 = 100; 이게되지 않았어 근데 초기화 블럭을 이용하면 변수 초기화가 가능하나? 다양하게 해봐야 할 것 같아
		StaticF f = new StaticF();   //--- static 변수 num = 55   number = 100;
		System.out.println(StaticF.getNum());
		StaticF.setNum(500);
		System.out.println(StaticF.getNum());
		
				
	}
}

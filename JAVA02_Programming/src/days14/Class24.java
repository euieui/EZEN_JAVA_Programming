package days14;

class StaticD{
	// private 으로 지정된 static 멤버는 클래스의 내부에서만 사용이 가능한 멤버입니다.
	private static int count;
	
	// static 멤버는 static 메서드와 인스턴스 메서드 둘에서 모두 접근이 가능하므로
	// private 으로 지정된 static 멤버를 이용하고자 한다면, public 으로 지정된   /// --- public으로 지정 안된거면? public 빼도 뭔가 된다
	// 멤버 메서드(static, 인스턴스)로 이용합니다
	public static void setCount(int count) {StaticD.count = count;}
	public static int getCount() {return count;}
	// 다만 인스턴스 메서드는 객체 생성후 이용이 가능합니다.
	public void setCount1(int count) { StaticD.count = count;}  // --- 여기 this.count로 하면 이상할것 같네? 안이상하네? ㅋㅋ 알아서 위로 잡아줌
	public int getCount1() { return StaticD.count;}
	
}

public class Class24 {

	public static void main(String[] args) {
		// StaticD.count = 100; // 에러  ----- 아 static 호출하는게 저렇게 하는거구나 클래스.static 호출할것
		// private 으로 지정된 static 멤버는 클래스의 외부에서 접근이 차단됩니다.
		System.out.printf("StaticD.count = %d\n",StaticD.getCount());
		StaticD.setCount(15);
		System.out.printf("StaticD.count = %d\n",StaticD.getCount());
		StaticD d1 = new StaticD();
		System.out.printf("StaticD.count = %d\n",d1.getCount1());
		d1.setCount1(15);
		System.out.printf("StaticD.count = %d\n",d1.getCount1());
		
	}

}

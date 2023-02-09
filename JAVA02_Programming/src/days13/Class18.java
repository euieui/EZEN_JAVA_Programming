package days13;
class StaticB {
	static int count = 1;
	int num;
	public StaticB() {
		this.num = count++;
		// 생성자 메서드에서 count 값을 1씩 증가시키며 , 그값을 num 에 저장
	}
}
public class Class18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticB b1 = new StaticB();
		System.out.printf("num = %d, count = %d\n",b1.num,StaticB.count);
		StaticB b2 = new StaticB();
		System.out.printf("num = %d, count = %d\n",b2.num,StaticB.count);
		StaticB b3 = new StaticB();
		System.out.printf("num = %d, count = %d\n",b3.num,StaticB.count);
		
		// --- 내띵킹 위에 static ㅇ벗어도 num은 계쏙 올라가지 않나 main 에 있는 StaticB.count 만 없어도 출력은 문제 없이 될 것 같은데
		// --- 어 안돼? 위 숫자를 다시 리턴이 안되니까?
		// --- 내띵킹이 틀림
		// --- 그렇담 static 뜻을 생각하지말아야하나?? 좀 애매하지만 무슨 느김은 알겟지!
		
		
	}

}

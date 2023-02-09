package days12;
class Account {
	private double balance; // 계좌정보 클래스에 잔액이 저장된 멤버변수
	// 클래스의 멤버필드/메소드는 접근지정자(private,protected,public)에
	// 의해서 외부에서 접근을 제어할 수 있습니다.
	// 접근지정자를 사용하지 않는 경우 기본지정으로 public 이 설정되며, 클래스 외부에서
	// 임의의 사용으로 값을 대입하거나 얻을 수 있습니다.
	// 이는 멤버필드의 값이 강제로 수정될 수 있다는 뜻이기도 합니다.
	// 이를 막고 무분별한 접근을 막기위해 멤버변수에 private를 지정합니다 .
	// private은 자기자신 class 의 멤버메서드만 접근 가능합니다. 
	// 멤버메서드는 대개 public 으로 지정되며. 외부에서 자유로운 접근이 가능합ㄴ디ㅏ.
	
	public void initBalance(int i ) {
		// 검증 절차를 거쳐서 값이 대입될 구조   --> if를 넣어서 검증 절차를 하던지 그런거
		balance = i;
	}
	public void  display() {
		System.out.printf("현재 잔액은 %.2f 원 입니다.\n",balance);
	} // 잔고 확인 가능
	public void withraw(int money) {
		balance -= money;
	}
	public void deposit(int money) {
		balance += money;
	}
	
}

public class Class05 {

	public static void main(String[] args) {
		Account a = new Account();
		// a.balance = 50000; // --- 에러
		// System.out.printf("현재 잔액은 %.2f 원 입니다. \n" , a.balance); // 에러 
		
		// --- 값을 넣어주는 메서드만 가능    -> 아니 그럼 머가 다른지 난 잘모르겠다 
		// --- 아 조건에 따라 실행해버리는거구나 메서드로 
		// --- 누가 막 넣을수 있으니까 나만의 조건? 검증절차를 거친다!\
		a.initBalance(100000);
		a.display();
		a.withraw(5000);      a.display();    // 출금
		a.deposit(20000);     a.display();    // 입금
		
		
	}

}

package days14;

public class Card {
	final static int spade = 4;      
	final static int diamond = 3;
	final static int heart = 2;
	final static int clover = 1;
	// final : 변수의 값을 변경하지 못하도록 하는 키워드.
	
	private int kind;
	private int number;
	
	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	public Card() {
		this(spade,1);
		// this.kind = spade;
		// this.number = 1;
	}
	
	public String toString() {  // --- 주소값 안나오게 하고 카드값이 나오게 하는데 좀 봐야겠다
		// kind 4 , number : 13이라면 만들어진고 리턴될 문자열 "[Spade:K]"
		String[] kinds = {"","Clover","Heart","Diamond","Spade"};
		String [] numbers = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String result = "[" + kinds [ this.kind]+ ":" + numbers[this.number]+"]";
		return result;
	}
	// --- public String toString(){} 이거 중요하네 좋다 알겠어 이제 이해함
	// toStirng() 메서드가 있는 클래스의 객체를 println() 으로 출력하면
	// 클래스이름@해쉬코드가 아닌 toString() 에서 리턴해주는 내용이 출력 됩니다.
	// Card c = new Card(4,13);
	// System.out.println(c); // ----이게 되나?
	// 출력 : [Spade:k] System.out.println(c.toStirng()); 과 같은 출력
}

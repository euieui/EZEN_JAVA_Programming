package days13;
class Std{
	private int bun;
	private String name;
	private int [] scores;
	static int count = 0;
	// main에서 호출된 생성자 4개를 제작해주세요 . count 변수로 번호를 입력하세요
	// 디폴트 생성자에서는 scores 배열의 공간을 할당해주시고,
	// 그외 생성자에 this()를 활용해주세요
	
	// 생성자
	Std(){
		bun = ++count;
		scores = new int[3];
	}
	Std(String name) {
		this();
		this.name = name;
	}
	Std(String name, int a , int b, int c){
		this(name);   /// 이게 누적해서 this(); 이게 아니군
		// ? for 문쓸라하니까 뭔가 이상함 여기
		// 그 아까 하시던데
		// 보자 교수님꺼
		scores[0] = a;
		scores[1] = b;
		scores[2] = c;
		
	}
	Std(Std a){
		this(a.name,a.scores[0],a.scores[1],a.scores[2]);   // 와여기 잘봐라.. 소름이네?
		// --- for ( int i = 0 ; i<3; i++) this.scores[i] = a.scores[i];
	}
	
	public void prn() {
		System.out.println(this.bun + " : " +this.name + " : " 
	+this.scores[0] + " : " + this.scores[1] + " : " + this.scores[2]);
	}
	
}


public class Class19 {

	public static void main(String[] args) {
		Std s1 = new Std();
		Std s2 = new Std("홍길동");
		Std s3 = new Std("홍길남",98,69,87);
		Std s4 = new Std(s3);
		s1.prn();
		s2.prn();
		s3.prn();
		s4.prn();
	}

}

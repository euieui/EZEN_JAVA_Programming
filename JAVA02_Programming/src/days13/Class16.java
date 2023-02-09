package days13;
class Student {
	private int bunho;
	private String name;
	private int [] scores; // 성적을 저장하기 위한 배열 변수
	private String[] subjects;
	private int tot; // 총점을 저장하기 위한 변수
	private double avg; // 평균을 저장하기 위한 변수
	private char grade; // 학점을 저장하기 위한 변수
	
	Student(){
		subjects = new String[3] ;
		subjects[0] = "국어"; subjects[1] = "영어"; subjects[2] = "수학";
		scores = new int[subjects.length];
	}
	Student(String name) {
		this();
		this.name = name;
	}
	Student(String name, int a , int b, int c){
		this();  /// --- 내생각이 맞았어 ! 이거 잘 못됨 this(name)을 해야해 -> getName();이 되질 않아
		scores[0] = a; scores[1]  = b; scores[2] = c;
	}
	// -- 와 지금까지 어려웠따 근데 다이해 될 것 같다 충분하다 하면서 더욱 배우게 된다 원래 하면서 배우는거다
	// -- 원래 틀리면서 배우는거다 난 틀려야 금방배운다
	// -- 기억이 오래간다 계쏙 틀리고 고치고 계쏙 틀리고 고치고
	// -- 즉 계쏙 해야한다 이거는 계속할 수 있을것 같다 왜냐 재미있으니까
	// -- 배움이 질리지가 않는다 내가 배우고 싶다
	
	void copy1(Student tmp) { // std1. copy1(std3);
		// this <- std1 b <- std3
		this.name = tmp.name;
		this.scores[0] = tmp.scores[0];
		this.scores[1] = tmp.scores[1];
		this.scores[2] = tmp.scores[2];
	}
	Student copy2() {  // Student std4 = std3.copy2();
		// this <- std3
		Student a = new Student();
		a.name = this.name;
		a.scores[0] = this.scores[0];
		a.scores[1] = this.scores[1];
		a.scores[2] = this.scores[2];
		return a; // std4 <- a
	}
	
}

public class Class16 {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student("홍길동");
		Student std3 = new Student("홍길동",100,100,100);
		std1.copy1(std3);
		Student std4 = std3.copy2();
		

	}

}

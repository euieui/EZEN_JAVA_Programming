package days15;  // 셤문제래 순서결과를 쓰시오.
class SuperD{  
	public SuperD () { // 전달인수 없는 디폴트 생성자 
		this(1);
		System.out.println("SuperD()");
	}
	public SuperD(int arg){ // 정수 값을 매개 변수로 갖는 생성자 
		this(1.1);
		System.out.println("SuperD(int)");
	}
	public SuperD(double arg){ // 실수값을 매개변수로 갖는 생성자
		this("");
		System.out.println("SuperD(double)");
	}
	public SuperD(String arg){// 문자열 자료를 매개변수로 갖는 생성자 
		System.out.println("SuperD(String)");
	}
}
class SubD extends SuperD{
	public SubD() {
		this(1);
		System.out.println("SubD()");
	}
	public SubD(int arg) {
		this(1.1);
		System.out.println("SubD(int)");
	}
	public SubD(double arg) {
		this("");
		System.out.println("SubD(double)");
	}
	public SubD(String arg) {
		// --- 여기에 super(); 가 숨어 있다 !!! 잘 생각해봐 this랑 super는 동시에 x
		System.out.println("SubD(String)");
	}
}


public class Extends06 {

	public static void main(String[] args) {
		// SuperD d =new SuperD();
		SubD d = new SubD();

	}

}

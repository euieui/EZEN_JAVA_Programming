package days13;

//int 형 데이터하나를 매개변수로 하는 생성자와 디폴트 생성자가 오버로딩 된 생성자를 갖는 클래스 제작
//멤버 필드로는 int dan; 하나 생성
//멤버 메서드 : dan 값이 0 이면 1~9 단의 구구단 모두 출력, 0이 아니면 해당 구구단만 출력하는 메서드 제작
//디폴트 생성자는 dan 변수를 0으로 저장, 전달인수가 잇는 생성자는 dan 변수를 전달인수 값으로 저장
//메서드 이름 : print()
//클래스 이름 Study_Gugudan

class Study_Gugudan{
	int dan;
	
	Study_Gugudan(int a){
		dan = a;
	}
	Study_Gugudan(){
		dan = 0;
	}
	
	void print() {
		if(this.dan == 0) {
			for(int i = 2 ; i<= 9 ; i ++) {
				prn(i);
				System.out.println();
			}
		}else {
			prn(dan);
		}
	}
	
	void prn(int dan) {
		for(int i = 1 ; i<=9 ; i++) {
			System.out.printf("%dx%d=%d\n",dan,i,dan*i);
		}
	}
}


public class study {

	public static void main(String[] args) {
		Study_Gugudan sg = new Study_Gugudan(5);
		Study_Gugudan sg1 = new Study_Gugudan();
		Study_Gugudan sg2 = new Study_Gugudan(0);
		sg.print();
		sg1.print();
		sg2.print();
	}
}

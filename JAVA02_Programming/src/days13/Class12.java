package days13;
// int 형 데이터하나를 매개변수로 하는 생성자와 디폴트 생성자가 오버로딩 된 생성자를 갖는 클래스 제작
// 멤버 필드로는 int dan; 하나 생성
// 멤버 메서드 : dan 값이 0 이면 1~9 단의 구구단 모두 출력, 0이 아니면 해당 구구단만 출력하는 메서드 제작
// 디폴트 생성자는 dan 변수를 0으로 저장, 전달인수가 잇는 생성자는 dan 변수를 전달인수 값으로 저장
// 메서드 이름 : print()
// 클래스 이름 Gugudan
class Gugudan{
	int dan;
	
	Gugudan(int a){
		dan=a;
	}
	Gugudan(){
		dan = 0;
	}
	
	void print() {
		
		if (dan == 0 ) {
			for ( int i = 2 ; i <= 9 ; i++) {
				prngugudan(i);
				System.out.println();
				
				/*
				for ( int j = 1 ; j <= 9 ; j++) {
					System.out.printf("%dx%d = %d\n",i,j,i*j);
				}
				System.out.println();
				*/
			}
			
		} else {
			prngugudan(dan);
			System.out.println();
			
			/*
			for (int i = 1 ; i<= 9 ; i++) {
				System.out.printf("%dx%d = %d\n",dan,i,dan*i);
			}
			System.out.println();
			*/
		}
	}
	
	void prngugudan (int n) {                                      // -- teacher 방법 추가해서 위에 주석처리
		for(int i = 1 ; i<=9; i++) {
			System.out.println(n + "x" + i + "=" + n*i); // -- 위에 반복문을 계속 쓰니까 여기에다가 반복문 하나를 쓰게 만들어서  위를 변경
		}
	}
	
} // Gugudan 클래스 끝

public class Class12 {

	public static void main(String[] args) {
		Gugudan g1 = new Gugudan(8);
		Gugudan g2 = new Gugudan();
		g1.print();
		g2.print();
		

	}

}

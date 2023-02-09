package days15;  // 반드시 시험

import java.util.Vector;

class Product{
	int price;
	int bonusPoint;
	Product(int p ){
		this.price = p;
		this.bonusPoint = p/10;
	}
}
/// -- class Computer extends Product{} 만 있을경우 에러 왜 ?
/// ---class Computer extends Product{super();} super 가 숨어 있는데 괄호안에 아무것도 없이 숨어있자나 저걸 뭐라했더라  생성자요 멍청한 의열씨
class Computer extends Product { 
	Computer() {super(150);} // --- 위 에러를 이렇게 고쳐야한다.
	public String toString() { return "Computer";}
}
class Tv extends Product {
	Tv() {super(100);}
	public String toString() { return "Tv";}
}
class Audio extends Product {
	Audio() {super(60);}
	public String toString() { return "Audio";}
}

class Buyer{
	int money = 1000;  /// ---나중엔 각 바이어 마다 머니를 받아야겠다
	int bonusPoint = 0;
	
	Vector item = new Vector();  ///--- 가져다 놓고 쓰는거 객체를 배열하는거? 리스트?
	// 벡터란 배열의 확장형 리스트 구조.  - 객체들을 저장할 수 있는 배열이라고 이해해도 무방함
	// 사용자가 만든 클래스의 객체(메모리를 할당 받은 레퍼런스 값) 등이 저장되는
	// 다형성 객체 저장 리스트 입니다.     ///----- Vector 안에서도 메소드가 있겠다 !>!>!>!>!.
	
	/* --- public void buy(컴퓨터 따로 티비따로 만들면 복잡하잖아 아무거나 넣어도 상관없는걸 만들어보자) 
	 * --- 그게 바로 밑에 public void buy(Product p){}
	public void buy(Computer c) {}
	public void buy(Tv t1) {}
	public void buy(Audio a) {}
	*/
	public void buy(Product p) {   /// ---b1.buy(t1)  this <- b1  Product p <- Tv t1
		// 제품을 살정도로 잔액이 충분한가 검사
		if (this.money <p.price) {
			System.out.println("잔액이 부족합니다");
			return;  /// --- void 에 return 하면 어케되징?  여기서 끝낸다? 라는 생각인것 같은데
		}
		// 제품 가격 만큼 money 차감
		this.money -= p.price;  ///--- this 지워도 될듯 ㅇㅇ
		// 제품의 bounusPoint 를 Buyer의 bonusPoint에 가산
		this.bonusPoint += p.bonusPoint;
		System.out.println(p + "을 구입하셨습니다");
		// 자식 인스턴스를 저장하고 있는 부모레퍼런스가 상속되고 오버라이딩 된
		// 메서드를 실행하면 자식에서 오버라이딩된 메서드가 우선 실행됩니다.
		
		// 제품 객체를 item 리스트 객체에 추가
		item.add(p);
		// Vector 클래스의 멤버 메서드 public void add(Object obj) {}  /// --  사실 그 인터넷 에서 add를 찾아보면
																								/// --  Object obj 가 아니라 e 인데 고차원 Object? 변형가능한?
	}
	public void summury() {
		int sum = 0; // 지출 총액 변수
		String itemList = ""; // 구매 목록을 저장할 변수
		if(item.isEmpty()) {
			// item.isEmpty() : Vector 객체인 item 이 비어 있으면 true 리턴
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		// Product p = (Product)item.get(0);   /// ---- 근데 계속 p에 넣자나 ? 덮어 씌우는게 아니야? 
		for (int i = 0 ; i<item.size();i++) {
			// item.size() : 저장된 요소의 갯수 리턴
			//// ---  item이 어느객체인지 궁금하긴 한데 Product 보다 위면 진짜 상위 인데 내가 알수가 없지..
			Product p = (Product)item.get(i); /// --- (Product) 없으면 오류인데 좀생각좀해보자  vector 에서 get은 하나씩 얻는거
			sum += p.price; // 구입 금액 합산
			itemList = itemList + " " + p;
		}
		System.out.println("지출총액 : " + sum + ",  구매목록 : " + itemList);   /// --- Computer 중복이자나 오 숫자로 표시를 할 수 있을것 같다
		System.out.println("남은금액 : " + this.money + ",  남은포인트 : " + this.bonusPoint); /// ---- 이건 내가 추가한거야
	}
	public void refund(Product p) {  
		// item.remove(p) : item 에서 p 를 삭제 - remove하려는 p 가 
		// 존재하여 잘 지워졌다면 true 리턴
		if(item.remove(p)) {
			// buyer 잔액에 상품 가격 합산
			this.money +=p.price;
			// 보너스 포인트 차감
			this.bonusPoint -=p.bonusPoint;
			// 환불 상품 안내 "~~를 반품하셨습니다."
			System.out.println(p+"를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 물품중에 해당 제품이 없습니다.");
		}
	}
	
	
}

public class Extends10_Object05 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Computer c =new Computer();
		Audio a =new Audio();
		
		Buyer b1 = new Buyer();
		
		b1.buy(t1);
		b1.buy(new Computer());
		b1.buy(c);
		b1.buy(a);
		b1.summury();
		
		b1.refund(c);
		b1.summury();
		
		
	}

}

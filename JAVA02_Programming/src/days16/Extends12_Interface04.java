package days16;  // 스타크래프트 후후후후후후후후후후후후후후후후ㅜ후후후후후후후후후후후후후ㅜ후후후후후후후후후후후후후후후후후후
///--- class를 만들어야 하나 interface를 만들어야 하나 고민이 된다... 어렵구만
interface Repairable{
	
}


class Unit{
	int hp; // 현재 체력
	int max_hp; // 최대 체력
	Unit(int p){
		max_hp = p ; //super() 로 호출되고 전달된 체력을 max_hp에 저장
		hp = (int)(p*0.8);
	}
	public void prnHP() {
		System.out.println("최대 체력 : " + max_hp + ", 현재 체력 : "+hp);
	}
}
class GroundUnit extends Unit {
	GroundUnit(int p) {
		super(p);
	}
}
class AirUnit extends Unit {
	AirUnit(int p) {
		super(p);
	}
}
class Tank extends GroundUnit implements Repairable{
	Tank(){super(150);}
	public String toString() {return "Tank";}
}
class Dropship extends AirUnit implements Repairable{
	Dropship(){super(150);}
	public String toString() {return "Dropship";}
}
class Marine extends GroundUnit {
	Marine(){super(40);}
	public String toString() {return "Marine";}
}
class SCV extends GroundUnit implements Repairable{
	SCV(){super(60);}
	public String toString() {return "SCV";}
	public void repair(Repairable r) {  /// ---repair 해야하는데 메카닉만 가능해   기계 클래스를 만드는게 좋긴하네 
		if (r instanceof Unit) {////--- 별도의 그룹을 만들었따! 와 ...
			Unit u = (Unit)r; ///--- r을 꺼내야 하는데 아 꼭 꺼내야 사용이 가능한가? 그걸 유닛으로 꺼내라
			if(u.hp != u.max_hp)
				System.out.println(u + "의 수리를 시작합니다.");
			else {
				System.out.println(u + "의 hp는 만땅입니다.");
				return;
			}
			while(u.hp != u.max_hp) {  ///----- 이 반복문속도를 제어가 가능할까?
				u.hp +=2;
				System.out.println("체력 2를 repair 했습니다. 현재 체력 : "+ u.hp);
			}
			System.out.println(u  + "의 수리가 끝났습니다.");
		}
	} 
}



public class Extends12_Interface04 {

	public static void main(String[] args) {
		Tank tank1 = new Tank();
		Dropship dropship1 = new Dropship();
		Marine marine1 = new Marine();
		SCV scv1 = new SCV();
		SCV scv2 = new SCV();
		
		System.out.printf("%s : ",tank1);
		tank1.prnHP();
		System.out.printf("%s : ",marine1);
		marine1.prnHP();
		System.out.printf("%s : ",dropship1);
		dropship1.prnHP();
		System.out.printf("%s : ",scv1);
		scv1.prnHP();
		
		scv1.repair(tank1);
		scv1.repair(dropship1);
		scv1.repair(scv2);
		// scv1.repair(Marine); ///-- 에러
		
		System.out.printf("%s : ",tank1);
		tank1.prnHP();
		System.out.printf("%s : ",marine1);
		marine1.prnHP();
		System.out.printf("%s : ",dropship1);
		dropship1.prnHP();
		System.out.printf("%s : ",scv2);
		scv2.prnHP();
	}

}

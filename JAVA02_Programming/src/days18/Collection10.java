package days18;

import java.util.ArrayList;

class Point{
	private int x;
	private int y;
	public Point(int x, int y) {this.x =x; this.y =y;}
	public String toString() { return "x: " + x +", y: " + y;}
	
	public boolean equals (Object obj) {
		if(!(obj instanceof Point)) return false;
		Point target = (Point) obj;
		boolean flag = (this.x == target.x) && (this.y == target.y);
		return flag;
	}
}


public class Collection10 {

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<>();
		Point p1 = new Point(10,10);
		list.add(p1);
		list.add(new Point(20,20));
		list.add(new Point(30,30));    ///--- 30,30을 list에 넣었는데
		for (Point p : list) System.out.println(p.toString());
		
		// for (Point p : list) System.out.println(p.toString());  ///--- 왜 두번한겨
		
		int index = list.indexOf(new Point(30,30));
		System.out.printf("(30,30)의 위치 : %d\n", index);
		boolean con = list.contains(new Point(30,30));      ///--- 레퍼런스값끼리 비교해서 그런것 같다 
		System.out.printf("(30,30)의 저장 유뮤 : %b\n", con);
		
		// 사용자 정의 클래스에 equals 메소드가 오버라이딩되지 않은 경우
		// 컬렉션 내부에서 동일한 형태의 객체를 검색 및 비교할 수 있습니다.
	}

}

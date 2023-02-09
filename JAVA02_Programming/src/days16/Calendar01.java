package days16;

import java.util.Calendar;

public class Calendar01 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();  ///--- 싱글턴!!
		// 싱글톤 방식의 클래스.
		// 생성자가 private 으로 접근 차단됨(외부에서 접근 금지. ->
		// 외부에서 new Calendar() 사용 안됨)
		// 유일하게 실행된 new Calendar() 는 클래스 내부에서 실행되어
		// 클래스내부에 단하나만 존재하게끔 생성된 레퍼런스 변수에 주소를 저장합니다
		// 그리고 그 레퍼런스 변수가 갖고 있는 주소를 리턴하는 public static 형태의
		// getInstance 메서드로 인스턴스의 주소를 리턴 받아 씁니다
		// 이후 다시 get Instance() 메서드가 실행되도 현재HEAP 에 이미 있는
		// 인스턴스의 주소가 리턴됩니다.
		Calendar tomorrow = Calendar.getInstance();
		
		// get 메서드는 스태틱 파이널 변수의 값을 얻어주는 메서드
		System.out.println("년도 : " + today.get(Calendar.YEAR));
		System.out.println("년도 : " + today.get(1));
		int i = today.get(Calendar.MONTH);  ///---- 왜? int i 인데 밑에 i+1 하는데 계속 71 나옴 ? 순서때문에 그렇고만
		System.out.println("월 : (0~11) :" + (i +1)+ "월");
		// MONTH 로 얻어낸 월의 값음 1월이 0     2월이 1.... 12월이 11로 얻어집니다.
		
		i = today.get(Calendar.DATE);
		System.out.println("이 달의 몇 일: "+i);
		i = today.get(Calendar.WEEK_OF_YEAR);
		System.out.println("금년의 몇 째 주: "+i);
		i = today.get(Calendar.WEEK_OF_MONTH);
		System.out.println("이 달의 몇 째 주: "+i);
		i = today.get(Calendar.DAY_OF_YEAR);
		System.out.println("이 해의 몇 일: "+i);
		// 1. 일요일, 2. 월요일, 3. 화요일....
		i = today.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일(1~7, 1:일요일): " +i);
		i = today.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("이 달의 몇 째 요일: "+i);
		System.out.println("이 달의 마지막 날: "+ today.getActualMaximum(Calendar.DATE)); 
		
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		System.out.println(Calendar.WEEK_OF_YEAR);
		System.out.println(Calendar.WEEK_OF_MONTH);
		System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);
		
	}

}

package days17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatter02 {

	public static void main(String[] args) throws ParseException {  /// --- throws ParseException 해도 해결 안되는구만~~

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");  /// ---String.valueOf(1000)  숫자를 스트링으로
		
		String s1 = "2020-11-24";
		String s2 = "2020/11/24"; 
		
		Date d = sdf1.parse(s1);  /// --- 첫번째 throws ParseExcpetion 했는데 그것도 해결 안된다~
												///---- 에러처리 예외처리 ~~!! 나주엥배운다 2번재 경고문은 나중에 배움~
		
		// SimpplDateFormat에는 parse메서드를 이용하여 문자열을 날짜로 변환해주는 기능이 있습니다
		// 다만 변환을 위해서는 설정된 서식을 반드시 지켜야하는 제약이 있습니다.
		
		// Date d = sdf1.parse(s2);
		System.out.println(sdf2.format(d));
		
		
		
	}

}

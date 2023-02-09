package days17;

import java.math.BigInteger;

public class WrapperEx02 {

	public static void main(String[] args) {
		for (int i =1 ; i<150 ; i++)
			System.out.printf("%d!=%s\n",i,calFactorial(i));
		///--- 큰숫자를 보기 위해서

	}

	private static String calFactorial(int i) {
		String result=null;
		BigInteger n = BigInteger.valueOf(i);  // 전달된 int 형의 i 값을 BigInteger 으로 변환
		BigInteger fact = BigInteger.ONE; // fact 변수 생성 -> 1초기화    ///--- BigInteger static final 
		
		// for(k=i; k<i; k++)
		for (BigInteger k = BigInteger.ONE ; k.compareTo(n)<0 ; k=k.add(BigInteger.ONE))
			fact = fact.multiply(k);
		
		result = fact.toString(); //결과 문자열로 변환
		return result; //결과 리턴
		////---- 소수만들어볼까나
	}

}

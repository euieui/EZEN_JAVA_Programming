package days17;

import java.math.BigInteger;

public class zWrapperEx02_Study01 {

	public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(30);
		BigInteger b = BigInteger.valueOf(20);
		// 오류 System.out.println(a+b);
		System.out.println(a.add(b));
		// 오류 System.out.println(a*b);
		System.out.println(a.multiply(b)); ///오호

	}

}

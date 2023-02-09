package days11;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		
		int ban;
		double n, d;
		Scanner sc = new Scanner (System.in);
		System.out.print("반지름을 입력하세요 : ");
		ban = sc.nextInt();
		
		n = calculate1(ban);
		d = calculate2(ban);
		
		prn(n,d);
		
	}
	// 메서드 생성
	public static double calculate1(int r){
		double n;
		n = r*r*3.141592;
		return n;
	}
	private static double calculate2(int r) {   ///--- public private 한클래스에서는 상관없는것 같고 무슨느낌 인지 알겠다
		double d;
		d = 2*3.141592*r;
		return d;
	}
	public static void prn(double n , double d) {
		System.out.printf("입력한 원의 넓이 n : %.2f",n);
		System.out.printf("\n입력한 원의 둘레 d : %.2f",d);
	}
}

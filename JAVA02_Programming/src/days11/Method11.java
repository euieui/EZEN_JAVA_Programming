package days11;

public class Method11 {

	public static void main(String[] args) {
		int [] a = {56,87,96,59,25,48,13,33,65,78};
		int tot = 0;
		double avg;
		tot = sum(a); // 배열의 합계를 계싼하여 리턴하는 메서드
		avg = average(a); // 배열의 평균을 계싼하여 리턴하는 메서드
		prn(a,tot, avg); // 배열의 요소와 합계, 평균 출력
	}
	
	public static int sum(int[] a) {
		int sum = 0;
		for (int i=0 ; i<a.length ; i++) sum += a[i];
		return sum;
	}
	public static double average(int [] a) {
		return sum(a) / (double)a.length;   // --- (double) 이걸  놓쳤네
	}
	
	public static void prn(int [] a , int tot , double avg) {
		for ( int k : a) System.out.printf("%d ",k);
		System.out.printf("\n총점 : %d   평균 : %.2f",tot,avg);
	}
	
}

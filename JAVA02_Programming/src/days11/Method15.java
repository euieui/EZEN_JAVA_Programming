package days11;

public class Method15 {

	public static void main(String[] args) {
		// cals 메서드 생성 (전달된 문자열에 따라 입력된 숫자들의 평균 또는 합계를 출력하라
		cals("합계",98,78,45,12,23,87,69,59);
		System.out.println();
		cals("평균",98,78,45,12,23,32,98,63,25,87);

	}
	
	public static void cals(String op , int ... a) {
		
			int sum = 0;
			for (int i=0; i<a.length ; i++) sum += a[i];
			double avg = sum/(double)a.length;
			if (op.equals("합계")) System.out.printf("합계 : %d\n",sum);
			else System.out.printf("평균 : %.2f\n",avg);
			// 내가 더 좋은 방법같음
	}

}

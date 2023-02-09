package days03;

public class Println02 {

	public static void main(String[] args) {
		// Printf03 에서 만들었떤 성적표를 Println 명령을 이용하여 출력해주세요
		// 숫자들의 오른쪽 정렬은 하지 않아도 됩니다.
		// 소수점 조절도 하지 않아도 됩니다.
		
		System.out.println("\t\t  ###성적표###");
		System.out.println("---------------------------------------------------");
		System.out.println("번호\t\t성명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------------");
		System.out.println("1\t\t홍길동\t\t89\t87\t69\t"+(89+87+69)+"\t"+(89+87+69)/3.0 );
		System.out.println("2\t\tHongGil\t100\t100\t100\t"+300+"\t"+300/3.0);
		System.out.println("---------------------------------------------------");
		// 이것도 원래는 조절이 가능한가봐
	}

}

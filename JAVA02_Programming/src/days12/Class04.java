package days12;

class Student{
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot ;
	double ave;
	
	public void init(int bun1, String name1 , int kor1, int eng1, int mat1) {
		bun = bun1;
		name = name1;
		kor = kor1;
		eng = eng1;
		mat = mat1;
		tot = kor1 + eng1+mat1;
		ave = tot / 3.0;
	}
	
	public void prn() {
		System.out.println("\t\t####성적표####");
		System.out.println("------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n",bun,kor,eng,mat,tot,ave);
	}
	
	double getAve() {
		return ave;
	}
}



public class Class04 {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.init(1,"홍길동",89,56,67);  // 번호 , 이름,세점수 입력 총점 평균 계산
		std1.prn();  // 성적표 출력
		System.out.printf("\nstd1학생의 평균 : %.2f\n", std1.getAve());  // 평균 리턴

	}

}

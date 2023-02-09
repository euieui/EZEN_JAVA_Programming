package days11;

public class Method13 {

	public static void main(String[] args) {
		// 전달인수가 갯수가 일정치 않아서 오버로딩으로는 해결할수 없을때
		int c;
		c = max(50, 60, 80,60,54,60);
		System.out.println("입력값중 큰 값은 : " + c + "입니다.");
		c = max(50,60,80,60,54,60,56,87,69);
		System.out.println("입력값중 큰 값은 : " + c + "입니다.");

	}
	public static int max(int...a) {
		// 참조 변수 a  를 이름으로 한 배열이 생성    ---- 무조건 배열로 ~
		int max = a[0];
		for (int i= 0 ; i<a.length ; i++)
			if (max<a[i]) max=a[i];
		return max;
	}

}

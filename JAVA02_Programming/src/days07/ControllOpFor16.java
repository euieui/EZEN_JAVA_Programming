package days07;

public class ControllOpFor16 {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println();
		// ---------------------------------------------------------------------------------------
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=10;i>=1;i--) {
			for(int j=1;j<=i; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// --- 아니 왜 이생각못함?
		// 아니 이거는 생각 했어야지 여라... 아래꺼 이런거 좋다
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=11 -i; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println();
	
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10; j++) {
				if(i>j) System.out.printf(" ");
				else System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println();
	
		for(int i=1;i<=10;i++) {
			for(int j=10;j>=1; j--) {
				if(i<j) System.out.printf(" ");
				else System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=10;i>=1;i--) {
			for(int j=1;j<=20-i; j++) {
				if(i>j ) System.out.printf(" ");
				else System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
	

}

package days09;

public class Array07 {

	public static void main(String[] args) {
		// 배열에 있는 값들 중 최대값과 최소값을 찾아서 출력하세요
		int [] a = {56,87,96,87,45,89,69,36,13,98};
		int max = a[0]; // 지금까지 나왔떤 숫자중 가장 큰 값으로 저장해둘 변수
		
		for (int i=1 ; i<a.length; i++) {
			// if(a[i] > max ) max = a[i];
			max = (a[i]>= max)? a[i] : max; // --- 내가한번 해봤다
		}	
		System.out.println("최대값 : " + max);
		
		// 최소값??
		
		int min = a[0];
		for (int i=1 ; i<a.length; i++) {
			// if(a[i] > max ) max = a[i];
			min = (a[i]<= min)? a[i] : min; // --- 내가한번 해봤다
		}	
		System.out.println("최소값 : " + min);
		
		// 배열의 값들을 오름차순 또는 내림차순으로 재배치 (정렬)
		// int [] a = {56,87,96,87,45,89,69,36,13,98};
		// i 를 첨자로한 값과  그 뒤를 있는 j를 첨자로 한 값들을 모두 한번씩 비교하여
		// i번째 값보다 작은 숫자가 나오면 그 둘의 값을 맞바꿔서 작은 값이 앞으로
		// 오게합니다
		
		// 실행 결과 j 가 마지막 첨자까지 도달했을때 i번째에는 가장 작은 숫자가
		// 저장되게 하는 원리 입니다.
		
		// 변수들의 값을 맞교환 동작이 필요 (내가 궁금했는데 ) 
		int a1 = 30, b1 = 50;
		int t = a1;
		a1 = b1;
		b1 = t;
		
		int i , j;
		for(i=0; i<a.length;i++) {
			for(j=i+1; j<a.length; j++) {
				if (a[i] > a[j]) {
					t= a[i];
					a[i] = a[j];
					a[j] =t;
				}
			}
		}
		for(i=0 ; i<a.length; i++) System.out.printf("%d ",a[i]);
		System.out.println();
		
		for(i=0; i<a.length;i++) {
			for(j=i+1; j<a.length; j++) {
				if (a[i] < a[j]) {
					t= a[i];
					a[i] = a[j];
					a[j] =t;
				}
			}
		}
		for(i=0 ; i<a.length; i++) System.out.printf("%d ",a[i]);
		
		
		
		
		/* 내가 해볼려고한거 실수지 무조건 2개해야해 
		int cp;
		
		for (int i = 0 ; i<a.length ; i++) {
			if (a[i]<=a[i+1]) {
				a[i] = a[i];
				a[i+1] = a[i+1];
			} else {
				cp = a[i+1];
			}
		}
		*/
		
			
			
					

	}

}

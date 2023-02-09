package days09;

import java.util.Random;

public class Array08 {

	public static void main(String[] args) {
		
		// 로또
		
		int [] a = new int[6];
		Random rd = new Random();
		int i ,j;
		
		for (int k =1 ; k<=5 ; k++ ) {
		
			for ( i = 0 ; i<a.length ; i++) {
				a[i] = rd.nextInt();
				if (a[i]<0) a[i]=a[i] *-1;
				a[i] = a[i] % 45 + 1;
				
				for(j = 0 ; j < i ; j++)   {    // 반복처리
					if(a[j] == a[i]) break;
					// System.out.printf("j : a[%d] : %d\n",j,a[j]);  // --- 내가 넣은거 알아보기 위해
					// System.out.printf("i : a[%d] : %d\n",i,a[i]);  // --- 내가 넣은거 알아보기 위해
				}
				if ( i != j ) i--;
				// i =1 일경우를 생각해보자
				
			}
			
			int t;
			for( i=0; i<a.length;i++) {
				for(j=i+1; j<a.length; j++) {
					if (a[i] > a[j]) {
						t= a[i];
						a[i] = a[j];
						a[j] =t;
					}
				}
			}
			for (  i = 0 ; i<a.length ; i++) System.out.printf("%d ",a[i]);
			System.out.println();
		
	
		}
		

	}

}

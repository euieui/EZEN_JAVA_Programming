package days04;

import java.util.Scanner;

public class Variable07 {

	public static void main(String[] args) {
		// (입력)
		// 포장할 사과의 갯수를 입력하세요 : xx
		// 하나의 상자에 포장되는 사과의 갯수를 입력하세요 : x
		
		// (출력)
		// 포장된 사과박스의 갯수 : x
		// 포장하고 남은 사과의 갯수 : x
		
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("포장할 사과의 갯수를 입력하세요 : ");
		int total_apple = sc.nextInt();
		System.out.printf("하나의 상자에 포장되는 사과의 갯수를 입력하세요 : ");
		int box_applenum = sc.nextInt();
		int boxnum = total_apple/box_applenum;
		int remain_apple = total_apple - boxnum * box_applenum;
		System.out.println("포장된 사과박스의 갯수 : "+ boxnum);
		System.out.println("포장하고 남은 사과의 갯수 : "+ remain_apple);
		
		
		
	}

}

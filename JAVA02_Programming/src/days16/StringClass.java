package days16;

import java.util.Date;

public class StringClass {

	public static void main(String[] args) {
		// 0.
		// 가용한 HEAP 공간에 "Hello" 를 저장하고 그 주소를 s 에전달
		String s = "Hello";
		// 이미 저장된 "Hello"가 있다면 그 주소를 전달합니다.
		// System.out.println("0. " + s.toString());
		System.out.println("0. " +s);
		// 단점 : 같은 문자열 Hello 를 다른 변수에 저장하려 한다면, 새로운 공간이할당
		// 되지 않습니다.
		
		// 1.
		// new에 의해 새로운 HEAP 공간에"Hello" 를 저장, 그 주소를 s에 전달
		s = new String("Hello");
		System.out.println("1. " +s);
		// System.out.println("1. " +s.toString());
		// String 클래스는 Object 클래스를 상속받고
		// 이미 toString 과 equals 가 자신에게 적합하게 오버라이딩 되어 있습니다.
		
		// 2. 
		// 한글자만을 하나의 데이터로 갖는 char 형 배열
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		String s2 = new String(c);  // 배열주소를 초기값으로 문자열 구성
		System.out.println("2. " + s2);
		/// -- 그러니까 즉 public class String 은 public String(char c) {} 를 구성하고 있고
		/// -- 그게 위에처럼 나오게 만들었다는거자나 오호 아무리생각해도 이해력 보소 좋네

		// 3.
		String n = "0123456789";
		char c1 = n.charAt(0);
		char c2 = n.charAt(5);    // 괄호안에 정수값 번째의 글자를 얻음. (0부터 시작)
		System.out.println("3. " + c1 + " " + c2);
		/// -- 이것도 역시 public class String 에서 public char charAt(int n){} 이라는 메서드가 있는거고
		/// -- 그메서드는 각 인덱스로 호출하는거군 이해력 ㅅㄱ
		
		// 4.
		String a1 = new String("ABCD");
		String a2 = new String("BCD");
		String a3 = new String("ABCD");
		System.out.println("\n4. a1.compareTo(a2) ?  : " + a1.compareTo(a2));
		System.out.println("4. a2.compareTo(a3) ?  : " + a2.compareTo(a3));
		System.out.println("4. a1.compareTo(a3) ?  : " + a1.compareTo(a3));
		// String 간의 비교
		// 숫자 987보다 숫자 1234 가 크다고 표현하지만 문자열"987"이 문자열"1234"보다 크다고 표현한다
		// 문자들간의 비교는 첫글자 부터 차례차례 비교하여, 서로 첫글자가 다르면
		// a1.charAt() 글자의 아스키코드값으로 크기를 결저짓고, 첫글자가 같으면
		// 두번째 글자뜰끼리 비교하여 결정한다. 두번재도 같으면 세번째 글자로...
		// 크기를 경정하는 방법은 비교되는 두글자들의  뺄셈을 연산하여, 결과가 ㄱ음수이면
		// 두번째글자가 크다고 하고 양수이면 앞쪽글자가 크다고 한다
		// ex) 'A' - 'B' => -1 뒤에서 빼려는 글자가 크다
		
		// 5.  s:Hello
		s2 = s.concat(" World");
		// concat 메서드는 원본 s에 있은 문자열에 World 를 이어붙이기하고 s 에 
		// 업데이트해서 저장하는 것이 아니라
		// 이어붙이기된 새로운 문자열 객체를 만들어서 새로운 레퍼런스 변수에 저장할 수 있게 리던해줍니다.
		// String 클래스의 특성상 s 에 있는 Hello 원본은 보호되고 있습니다.
		System.out.println("\n5. " + s2);
		System.out.println("5. " + s);
		
		// 6. 
		s = new String("abcdefg");
		boolean b = s.contains("bc");
		// 괄호안의 문자열이 메서드 호출 객체가 갖고 있는 문자열의 일부로 포함되어
		// 있다면 true 를 리턴해주는 메서드.
		// boolean b = new String("abcdefg").contanins("bc");
		System.out.println("\n6. 문자열 " +s+"에는 \"bc\"가 포함되어 있다? " +b);
		
		
		// 7. 
		s = new String("Hello.txt");
		b = s.endsWith("txt");    ///---- s.startsWith 도 있단 말씀
		// 메서드 호출 객체가 갖고 있는 문자열이 괄호안의 문자열로 끝나면 true 를 
		// 리턴해주는 메서드
		System.out.println("\n7. 문자열 " +s+ "눈 \"txt\"로 끝난다 ? " +b);
		
		// 8. 
		s= new String("Hello");
		// 대소문자 구분해서 비교
		System.out.println("\n8. " +s+ "는 \"Hello\" 와 같다? " +s.equals("Hello"));
		System.out.println("8. " +s+ "는 \"hello\" 와 같다? " +s.equals("hello"));
		// 대소문자 구분하지 않고 비교
		System.out.println("8. " +s+ "는 \"HELLO\" 와 같다? " +s.equalsIgnoreCase("HELLO"));
		System.out.println("8. " +s+ "는 \"hello\" 와 같다? " +s.equalsIgnoreCase("hello"));
		
		// 9.
		System.out.println("\n9. " + s +"의 문자중 \'o\'의 위치"+s.indexOf('o'));
		System.out.println("9. " + s +"의 문자중 \'k\'의 위치"+s.indexOf('k'));
		// 메서드 호출 객체의 문자열중에 괄호안에 있는 문자가 몇번재로 위치하는 지를 
		// 구해줍니다. 있으면 위치값 (0부터 시작하는 정수), 없으면 -1
		System.out.println("9. " +s+ " s.indexOf(\'e\', 0)->"+s.indexOf('e',0));
		System.out.println("9. " +s+ " s.indexOf(\'e\', 2)->"+s.indexOf('e',2));
		System.out.println("9. " +s+ " s.indexOf(\'l', 0)->"+s.indexOf('l',0));
		System.out.println("9. " +s+ " s.indexOf(\'l', 3)->"+s.indexOf('l',3));
		System.out.println("9. " +s+ " s.indexOf(\'l', 4)->"+s.indexOf('l',4));
		// 찾고자 하는 문자가 지정한 정수(0부터 시작)번째부터 시작해서 몇번째 글자로
		// 위지하는 지를 구해줍니다.
		// 첫번째 사용예 : 알파벳 'e' 가 문자열 s의 0번째부터 찾아서 전체 글자의 몇번재
		// 글자인지 구함 : 1리턴
		// 두번째 사용예 : 알파벳 'e' 가 문자열 s의 2번째(0부터 시작)부터 찾아서 전체
		// 글자의 몇번째 글자인지 구함. 없으므로 -1 리턴
		
		// 10.
		s= new String("ABCDEFG");
		System.out.println("\n10. " +s+ " s.indexOf(\"CD\")->" + s.indexOf("CD"));
		// 문자열의 일부가 위치한 위치값
		s = "java.lang.Object";
		System.out.println("10. " +s+" 문자열중 '.'의 마지막위치->" + s.lastIndexOf('.'));
		
		// 11.
		s = "Hello";
		System.out.println("\n11. " + s+ " s.replcae(\'H\', \'C\')->" +s.replace('H','C'));  // H를 C로 치환
		s2 =s.replace('H','C'); // H를 C로 치환
		System.out.println("11. " +s+ " "+s2);
		System.out.println("11. "+s+ " s.replcae(\"ll\", \"LL\")->" +s.replace("ll","LL"));
		s2 = s.replace("ll","LL"); // ll을 LL로 치환
		System.out.println("11. "+s+ " "+s2);
		// String  클래스는 보관하고 있는 문자열을 이요하여 변화를 주는 메서드들에서
		// 변화된 내용이 없데이트 되듯 저장되는 것이 아니고 대부분 새로운 변화된 문자열
		// 객체로 만들어 리턴 합니다
		// 따라서 다양한 메서들이 있지만 실행결과가 원본 s 문자열을 변경시키지는 못합니다.
		
		// 12.
		String animal = "dog,cat,bear";
		String [] a = animal.split(",");
		// ',' 를 기준으로 문자열을 분리 - 문자열 배열로 만듬
		System.out.print("\n12. ");
		for(int i = 0; i<a.length ; i++) System.out.printf("%s ", a[i]);
		
		// 13.
		s = "java.lang.Object";
		s2 = s.substring(5,9); /// ---뒷숫자는 1부터시작이라생각하면 될려나
		// 원본에서 다섯번째 (0부터시작)부터 8번째(9-1)까지 추출
		System.out.println("\n\n13. "+s2);
		s2 = s.substring(10); // 원본에서 열번째 글자부터(0부터시작) 끝까지추출
		System.out.println("13. "+s2);
		
		// 14.
		System.out.println("\n14. "+String.valueOf(true));  /// boolean이 아니라 String 으로 바뀜
		s = String.valueOf("14. " + 100);
		System.out.println(s);
		s = String.valueOf(100.123);
		System.out.println("14. " +s);
		// java.util.Date dd = new java.util.Date();
		Date dd = new Date();   //java.util.Date
		s = String.valueOf(dd);
		System.out.println("14. " +s);
	}

}

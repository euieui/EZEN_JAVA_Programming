package days16;

public class zStringClass_Study01 {

	public static void main(String[] args) {
		char []  s = {'권','의','열'};
		System.out.println(s[1]);
		System.out.println((int)s[1]);
		String firstName = String.valueOf(s[0]); ///--- char를 String으로 바꾸기 String.valueOf();
		String name = new String(s);               /// ---- char[] 배열을 String으로 바꾸기 new String(char [] );
		System.out.println(firstName);
		System.out.println(name);
		
		String temp = "캐릭터 변환하기";
		char [] array = temp.toCharArray(); /// --- String을 char [] 배열로 바꾸기
														  ///  ---- String.tocharArray(); 좋다
		String change = "";
		
		for (char j : array) change +=Character.toString(array[j]);
		System.out.println(change);

	}

}

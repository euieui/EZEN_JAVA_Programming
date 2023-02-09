package days18;

import javax.swing.JFrame;

///--- C#은 윈도우프로그래밍 언어?
class ButtonTest extends JFrame{ ///--- 윈도우를 만들 수 있는?
	ButtonTest(){
		setTitle("윈도우 테스트");
		setSize(300,300);  ///-- 다들 JFrame에 있는 멤버 메서드들
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class SwingEx {
	
	public static void main(String[] args) {
		ButtonTest bts = new ButtonTest();
		/// 내일부터 계산기 캘린더 만들어보자 오오오오오 윈도우~기능 좋다
	}

}

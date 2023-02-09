package days19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ButtonEvent extends JFrame implements ActionListener{    ///---- 오오 많은 클래스가 숨겨져 있어
	
	JLabel result;
	
	ButtonEvent(){
		JButton male = new JButton("남자");
		JButton female = new JButton("여자");
		JLabel label = new JLabel("당신의 성별은?");
		result = new JLabel(""); // 버튼 클릭에 의해서 실행 결과가 담길 라벨
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(label);
		con.add(male);
		con.add(female);
		con.add(result);
		
		male.addActionListener(this);
		female.addActionListener(this);  ///-- 버튼에다가 뭔가 감지할 수 있는 센서를 달았다!
		
		setTitle("버튼 이벤트 테스트");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override  ///--- implements ActionListener 쓰니까 클래스가 에러가 뜸 왜냐 오버라이드를 해야 하기 때문에
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand(); // 클릭된 버튼의 표시된 값이 문자변수 s에 저장
		result.setText(s);  //--- result can not be resolved 변수가 지정되지 않았다는 말 
								// --- 따라서 괄호밖으로 result를 빼준다
		
	}
}

public class Swing03 {
	
	public static void main(String[] args) {
		new ButtonEvent();

	}

}

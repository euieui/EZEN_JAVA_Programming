package days19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 윈도우에 텍스트 필드1    버튼1       버튼2        텍스트 필드2
// 순서로 배치합니다.
// 버튼1의 표면에는 ">" 글자 표시 , 버튼 2의 표면에는 "<" 글자를 표시합니다
// 버튼 1을 클릭하면 텍스트필드1의 글자가 텍스트필드2로 옮겨지게
// 버튼 2을 클릭하면 텍스트필드2의 글자가 텍스트필드1로 옮겨지게
// 글자가 없는 상태에서 버튼을 클릭하면 아무일도 안일어나게....
// 윈도우클래스 이름은  TextFieldEx
// 윈도우의 가로 세로크기는 적절히 조절해주세요

class TextFieldEx extends JFrame implements ActionListener {
	JTextField text1, text2;
	TextFieldEx(){
		text1 = new JTextField(10);
		text2 = new JTextField(10);
		JButton bt1 = new JButton(">");
		JButton bt2 = new JButton("<");
	
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(text1);
		con.add(bt1);
		con.add(bt2);
		con.add(text2);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		setTitle("change");
		setSize(400,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		///--- 보통 e.getActioCommand() 가 반복되니까 String s1.e.getActionCommand(); 로 치환해도 될 듯
		if (e.getActionCommand().equals(">") && !(text1.getText().equals(""))) {
			String tp;
			tp = text1.getText();
			text1.setText(text2.getText());
			text2.setText(tp);
		}
		else if (e.getActionCommand().equals("<")&& !(text2.getText().equals(""))) {
			String tp;
			tp = text1.getText();
			text1.setText(text2.getText());
			text2.setText(tp);
		}
			
		
		
	}
}
public class Swing11 {

	public static void main(String[] args) {
		new TextFieldEx();

	}

}

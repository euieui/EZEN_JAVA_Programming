package days19;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class ButtonTest02 extends JFrame{
	ButtonTest02(){
		JButton a1 = new JButton("7");
		JButton a2 = new JButton("8");
		JButton a3 = new JButton("9");
		JButton a4 = new JButton("+");
		JButton a5 = new JButton("4");
		JButton a6 = new JButton("5");
		JButton a7 = new JButton("6");
		JButton a8 = new JButton("-");
		JButton a9 = new JButton("1");
		JButton a10 = new JButton("2");
		JButton a11 = new JButton("3");
		JButton a12 = new JButton("X");
		JButton a13 = new JButton("=");
		JButton a14 = new JButton("0");
		JButton a15 = new JButton("C");
		JButton a16 = new JButton("÷");
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		con.add(a1);
		con.add(a2);
		con.add(a3);
		con.add(a4);
		con.add(a5);
		con.add(a6);
		con.add(a7);
		con.add(a8);
		con.add(a9);
		con.add(a10);
		con.add(a11);
		con.add(a12);
		con.add(a13);
		con.add(a14);
		con.add(a15);
		con.add(a16);
		
		setTitle("버튼 컴퍼넌트 테스트");  
		setSize(230,200);  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); 
	}
	
}


public class Swing02 {

	public static void main(String[] args) {
		new ButtonTest02();

	}

}

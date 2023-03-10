package days19;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 이미지 apple.jpg persimmon.jpg pear.jpg  banana.jpg cherry.jpg
// 다섯개의 이미지를 아이콘으로 만들고 버튼 다섯개를 이미지와 함께 생성하세요
// 그리드 레이아웃을 이용하여 3행 2열로 배치하고
// 액션 리스너를 붙여서 버튼 클릭시에 이미지에 해당하는 과일 이름이 result 라벨에 나오도록 작성하세요
// 생성할 클래스 이름은 GridFruits 입니다.

// 버튼을 클릭하면 과일 이름이 result 라벨에 표시되도록 해주세요
// "사과를 선택하셨습니다"

class GridFruits extends JFrame implements ActionListener{
	JLabel result;
	GridFruits(){
		ImageIcon ia = new ImageIcon("images/apple.jpg");
		ImageIcon ip = new ImageIcon("images/persimmon.jpg");
		ImageIcon ipe = new ImageIcon("images/pear.jpg");
		ImageIcon iba = new ImageIcon("images/banana.jpg");
		ImageIcon ic = new ImageIcon("images/cherry.jpg");
		
		JButton apple = new JButton("사과",ia);
		JButton persimmon = new JButton("감",ip);
		JButton pear = new JButton("배",ipe);
		JButton banana = new JButton("바나나",iba);
		JButton cherry = new JButton("체리",ic);
		result = new JLabel(""); //--. 이걸 빼먹었다 계쏙 에러난게
		
		apple.addActionListener(this);
		persimmon.addActionListener(this);
		pear.addActionListener(this);
		banana.addActionListener(this);
		cherry.addActionListener(this);
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(3,2));
		con.add(apple);
		con.add(persimmon);
		con.add(pear);
		con.add(banana);
		con.add(cherry);
		con.add(result);
		
		setTitle("과일");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		result.setText(e.getActionCommand() + "을(를) 선택하셨습니다.");
		
	}
}
public class Swing09 {

	public static void main(String[] args) {
		new GridFruits();

	}

}

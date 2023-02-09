package days20;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

// 컨테이너의 레이아웃 : 5행 1열의 GridLayout
// 1 행 : JPanel p1 배치 -> p1에는 FlowLayout 으로 TextField 한개 배치 (가로크기 적당히)
// 2 행 : JPanel p2 배치 -> p2에는 GridLayout 으로 버튼 네개 (7, 8, 9, +)
// 3 행 : JPanel p3 배치 -> p3에는 GridLayout 으로 버튼 네개 (4, 5, 6, -)
// 4 행 : JPanel p4 배치 -> p4에는 GridLayout 으로 버튼 네개 (1, 2, 3, X)
// 5 행 : JPanel p5 배치 -> p5에는 GridLayout 으로 버튼 네개 (C, 0, =, ÷)
class Calculator extends JFrame implements ActionListener{
	JTextField jt;
	int firstNumber;
	int secondNumber;
	int result1;
	double result2;
	int operator=0;  ///--- 1이면 더하기 2이면 빼기 이렇게 할려고
	Calculator(){
		// 텍스트 필드에 폰트 적용
		jt = new JTextField(16);
		Font f = new Font("굴림",Font.BOLD,20); // 폰트 객체 생성.
		jt.setFont(f);
		// 버튼에 폰트 적용
		JButton b = new JButton("폰트");
		b.setFont(f);
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(6,1));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));  ///--- FlowLayout 괄호안에 뭐 추가함
		jt.setText("0");  // 텍스트 0 입력(최초 표시값)
		jt.setHorizontalAlignment(SwingConstants.RIGHT);  // 텍스트 필드 오른쪽 정렬
		jt.setEditable(false); // 마우스 키보드로 편집 할수 없게 설정
		p2.setLayout(new GridLayout(1,4));
		p3.setLayout(new GridLayout(1,4));
		p4.setLayout(new GridLayout(1,4));
		p5.setLayout(new GridLayout(1,4));
		
		// 패널 1
		p1.add(jt);
		con.add(p1);
		// 패널 2 
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton bp = new JButton("+");
		b7.setFont(f); b8.setFont(f);  b9.setFont(f); bp.setFont(f);
		p2.add(b7); p2.add(b8); p2.add(b9); p2.add(bp);
		con.add(p2);
		
		// 패널 3
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton bm = new JButton("-");
		b4.setFont(f); b5.setFont(f);  b6.setFont(f); bm.setFont(f);
		p3.add(b4); p3.add(b5); p3.add(b6); p3.add(bm);
		con.add(p3);
		
		// 패널 4
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton bM = new JButton("X");
		b1.setFont(f); b2.setFont(f);  b3.setFont(f); bM.setFont(f);
		p4.add(b1); p4.add(b2); p4.add(b3); p4.add(bM);
		con.add(p4);
		
		// 패널 5
		JButton bc = new JButton("C");
		JButton bz = new JButton("0");
		JButton be = new JButton("=");
		JButton bd = new JButton("÷");
		bc.setFont(f); bz.setFont(f);  be.setFont(f); bd.setFont(f);
		p5.add(bc); p5.add(bz); p5.add(be); p5.add(bd);
		con.add(p5);
		
		// 기능 추가
		// 백스페이스
		JButton b17 = new JButton("◀");
		b17.setFont(f);
		JPanel p6 = new JPanel();
		p6.setLayout(new GridLayout(1,4));
		p6.add(b17);
		con.add(p6);
		b17.addActionListener(this);
		
		JButton b18 = new JButton("sqr");
		JButton b19 = new JButton("1/x");
		JButton b20 = new JButton("%");
		b18.setFont(f);	b19.setFont(f); 	b20.setFont(f);
		p6.add(b18); p6.add(b19); p6.add(b20);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		
		
		// 16개 액션
		b7.addActionListener(this);	b8.addActionListener(this);
		b9.addActionListener(this);	bp.addActionListener(this);
		b4.addActionListener(this); 	b5.addActionListener(this);
		b6.addActionListener(this);	bm.addActionListener(this);
		b1.addActionListener(this);	b2.addActionListener(this);
		b3.addActionListener(this);	bM.addActionListener(this);
		bc.addActionListener(this);	bz.addActionListener(this);
		be.addActionListener(this);	bd.addActionListener(this);
		
		
		
		setTitle("Calculator");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//--- jt가 텍스트필드
		// 변수 s에는 클릭된 버튼의 글자들이 저장됩니다.
		String s = e.getActionCommand();
		String oldText = jt.getText();
		
		switch(s) {
			case "0" : 	case "1" :	case "2" :	case "3" :	case "4" :	
			case "5" :	case "6" :	case "7" :	case "8" :	case "9" :
				if(oldText.equals("0")) oldText ="";
				jt.setText(oldText + s); break;
			
			// 변수를 만들어야 하는데 그걸 맨위에다가 만들어야 한다네? 
			case "+" :
				firstNumber = Integer.parseInt(oldText);
				jt.setText("0");
				operator = 1;
				break;
			case "-" :
				firstNumber = Integer.parseInt(oldText);
				jt.setText("0");
				operator = 2;
				break;
			case "X" :
				firstNumber = Integer.parseInt(oldText);
				jt.setText("0");
				operator = 3;
				break;
			case "÷" :
				firstNumber = Integer.parseInt(oldText);
				jt.setText("0");
				operator = 4;
				break;
			case "=" :
				secondNumber = Integer.parseInt(oldText);  /// --- = 누르면 값이계속 2곱하는게 아니라 20이 곱해지고 그럼
				switch(operator){
					case 1: 
						result1 = firstNumber + secondNumber;
						jt.setText(String.valueOf(result1));
						break;
					case 2:
						result1 = firstNumber - secondNumber;
						jt.setText(String.valueOf(result1));
						break;
					case 3:
						result1 = firstNumber * secondNumber;
						jt.setText(String.valueOf(result1));
						break;
					case 4:
						result2 = (double)firstNumber / (double)secondNumber;
						jt.setText(String.valueOf(result2));
						break;
					case 5:
						result1 = firstNumber % secondNumber;
						jt.setText(String.valueOf(result1));
						break;
				}
				break;  ///--- 오 이브레이크 빼먹을뻔했다 나도 빼먹은 
			case "C" :
				jt.setText("0"); break;
			case "◀" :
				// substring 과 length 활용하여 백스페이스 키를 완서하세요
				// 총글자수 -1 만큼 substring 으로 취합니다 ... 그리고 다시 setText
				
				
				// jt.getText().length() : 텍스트 필드에 있는 글자의 총갯수
				// 98763 가 있다면 총글자갯수 5 ,인덱스는 0번부터 4번까지 입니다
				// 이중9876만 취하고 싶다면 , substring에 0 ,4 라고 써야 0번부터 3번글자까지 추출됩니다.
				// 그말은 곧 legnth() 메서드를 사용했다면 문자열.substring(0,문자열.length()-1;
				// jt.setText(jt.getText().substring(0,jt.getText().length()-1));
				
				// 백스페이스 키 사용시 현재 글자갯수가 1개라면 , 바로 0으로 치환
				if (jt.getText().length()==1) jt.setText("0");
				else {
					jt.setText(oldText.substring(0,oldText.length()-1));
				}
				break;
				
			case "sqr" :
				result2 = Double.parseDouble(oldText);
				jt.setText(  String.valueOf(Math.sqrt(result2)));
				break;
			case "1/x" :
				result2 = Double.parseDouble(oldText);
				jt.setText(  String.valueOf(1/result2));
				break;
			case "%" :
				firstNumber = Integer.parseInt(oldText);
				jt.setText("0");
				operator = 5;
				break;
		}
	}
}




public class Swing13 {

	public static void main(String[] args) {
		new Calculator();
		

	}

}

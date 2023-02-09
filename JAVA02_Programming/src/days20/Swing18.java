package days20;
// 실해오하면과 같이 화면을 구성해주세요
// 확인 버튼을 클릭하면 입력 내용이 콘솔창에 나란히 표시되도록 해주세요
// 클래스 이름은 resume 입니다.

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class Resume extends JFrame implements ActionListener, ItemListener{
	
	JRadioButton male;
	JRadioButton female;
	JCheckBox jcb1;
	JCheckBox jcb2;
	JCheckBox jcb3;
	JCheckBox jcb4;
	JComboBox <String>jcb;
	JTextField jtf1;
	JTextField jtf2;
	JTextField jtf3;
	JComboBox <String>addr;
	
	Resume(){
		
		JButton bt1 =  new JButton("확인");
		Font f = new Font("굴림",Font.BOLD,20);
		
		
		/// 라벨 5개
		JLabel jl1 = new JLabel(" 성      명 : ");
		JLabel jl2 = new JLabel(" 성      별 : ");
		JLabel jl3 = new JLabel(" 취      미 :");
		JLabel jl4 = new JLabel(" 전화번호 : ");
		JLabel jl5 = new JLabel(" 거주지역 : ");
		JLabel jl6 = new JLabel(" - ");
		
		// 라디오버튼 2개  // 그룹 성별
		ButtonGroup bg = new ButtonGroup();
		male =new JRadioButton("남성");
		female =new JRadioButton("여성");
		bg.add(male); bg.add(female);
		
		// 취미 체크박스
		jcb1= new JCheckBox("게임");
		jcb2= new JCheckBox("운동");
		jcb3= new JCheckBox("음악감상");
		jcb4= new JCheckBox("영화감상");
		
		// 전화번호 콤보박스
		jcb = new JComboBox<>();
		jcb.addItem("010");
		jcb.addItem("02");
		jcb.addItem("031");
		jcb.addItem("032");
		addr = new JComboBox<>();
		addr.addItem("서울");
		addr.addItem("경기도");
		addr.addItem("인천");
		addr.addItem("강원도");
		addr.addItem("충청북도");
		
		
		/// TextField 3개
		jtf1 = new JTextField(10);
		jtf2 = new JTextField(8);
		jtf3 = new JTextField(8);
		
		/// 바탕 :  동서남북
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		//폰트
		jl1.setFont(f); jl2.setFont(f); jl3.setFont(f); jl4.setFont(f); jl5.setFont(f);
		jcb1.setFont(f); jcb2.setFont(f); jcb3.setFont(f); jcb4.setFont(f);
		male.setFont(f); female.setFont(f);
		jl6.setFont(f);
		
		// 패널 : 2개
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		jp1.setLayout(new GridLayout(6,1));
		jp2.setLayout(new GridLayout(6,1));
		// 세부패널 ??
		JPanel text1 = new JPanel();
		text1.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		JPanel sex = new JPanel();
		sex.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		JPanel hobby = new JPanel();
		hobby.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		JPanel number = new JPanel();
		number.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		JPanel paddr= new JPanel();
		paddr.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		JPanel last = new JPanel();
		last.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		// 텍스트 이름 패널
		text1.add(jtf1);
		// 성별 위치선정
		sex.add(male); sex.add(female);
		// 취미 위치선정
		hobby.add(jcb1); hobby.add(jcb2); hobby.add(jcb3); hobby.add(jcb4);
		// 전화번호 패널
		number.add(jcb); number.add(jtf2); number.add(jl6); number.add(jtf3);
		// 주소 패널
		paddr.add(addr);
		// 확인 패널
		last.add(bt1);
		
		// 반응
		bt1.addActionListener(this);
		
		// 위치 선정
		con.add(jp1,BorderLayout.WEST);
		jp1.add(jl1); jp1.add(jl2); jp1.add(jl3); jp1.add(jl4); jp1.add(jl5);
		con.add(jp2,BorderLayout.CENTER);
		jp2.add(text1); jp2.add(sex);  jp2.add(hobby); jp2.add(number); jp2.add(paddr); jp2.add(last);
		
		
		
		setTitle("구성 실습");
		setSize(650,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		//--- ??? 이건 안해도 돼?
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s;
		System.out.println("성명 : " + jtf1.getText());
		if(male.isSelected()) s="남성";
		else s = "여성";
		System.out.println("성별 : "+s);
		s = "";
		if(jcb1.isSelected()) s= s +jcb1.getText() +" ";
		if(jcb2.isSelected()) s= s +jcb2.getText() +" ";
		if(jcb3.isSelected()) s= s +jcb3.getText() +" ";
		if(jcb4.isSelected()) s= s +jcb4.getText() +" ";
		System.out.println("취미 : " + s);
		
		s=(String) jcb.getSelectedItem();
		s = s + "-" + jtf2.getText();
		s = s + "-" + jtf3.getText();
		System.out.println("전화번호 : "+s);
		System.out.println("거주지역 : " + addr.getSelectedItem());
		
	}
	
}

public class Swing18 {

	public static void main(String[] args) {
		new Resume();

	}

}

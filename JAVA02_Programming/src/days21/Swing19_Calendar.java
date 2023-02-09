package days21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Calendars extends JFrame implements ActionListener{
	
	JTextField y;
	JComboBox<String> m;
	int year = 0;
	int month = 0;
	JTextField[] jt = new JTextField[42];  // 레퍼런스 변수 42개 생성
	
	
	Calendars(){
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		Font f = new Font("굴림",Font.BOLD,20);
		
		JButton b1 = new JButton("일");
		JButton b2 = new JButton("월");
		JButton b3 = new JButton("화");
		JButton b4 = new JButton("수");
		JButton b5 = new JButton("목");
		JButton b6 = new JButton("금");
		JButton b7 = new JButton("토");
		
		b1.setFont(f); b2.setFont(f); b3.setFont(f); b4.setFont(f);
		b5.setFont(f); b6.setFont(f); b7.setFont(f);
		b1.setForeground(Color.RED); b7.setForeground(Color.BLUE);  ///--- 컬러 setForeground(Color.xxx);
		
		// jp1설정 --------------------------------------------------
		jp1.setLayout(new GridLayout(1,7));
		jp1.add(b1); jp1.add(b2); jp1.add(b3); jp1.add(b4);
		jp1.add(b5); jp1.add(b6); jp1.add(b7);
		
		// jp3 설정 ---------------------------------
		jp3.setLayout(new FlowLayout(FlowLayout.CENTER));
		y = new JTextField(8);
		y.setFont(f);
		y.setHorizontalAlignment(SwingConstants.CENTER);  ///--- 글쓰는데 가운데 .setHorizontalAlignment(SwingConstants.Center);
		
		m= new JComboBox<>();
		// 반복실행문을 이용하여 콤보상자에 1월부터 12월까지의 항목을 i값으로 추가
		for(int i = 1 ; i<= 12; i++) m.addItem(String.valueOf(i));
		m.setFont(f);
		
		JButton b = new JButton("확인");
		JButton b11 = new JButton("이전달");
		JButton b12 = new JButton("다음달");
		b.setFont(f); b11.setFont(f); b12.setFont(f);
		
		jp3.add(b11); jp3.add(y); jp3.add(new JLabel("년 ")).setFont(f);
		jp3.add(m); jp3.add(new JLabel("월 ")).setFont(f); jp3.add(b); jp3.add(b12);
		

		// jp2 설정 ------------------------------------------
		jp2.setLayout(new GridLayout(6,7));
		for (int i = 0 ; i <jt.length ; i++) {  //--- 42보다 jt.length 를 써라 그게 편하지
			jt[i] = new JTextField();
			jt[i].setFont(f);
			jt[i].setHorizontalAlignment(SwingConstants.RIGHT); // 오른쪽 정렬
			jt[i].setEditable(false);  // 임의 편집 금지
			jt[i].setBackground(Color.white); // 배경색 흰색
			jp2.add(jt[i]);
			if(i%7==6) jt[i].setForeground(Color.BLUE); // 토요일 파란색 글자
			else if(i%7 ==0) jt[i].setForeground(Color.RED); // 일요일 빨간색 글자  ///--- red도 되던데
			else jt[i].setForeground(Color.BLACK);
			
		}
		// 반응
		b11.addActionListener(this);
		b12.addActionListener(this);
		b.addActionListener(this);
		
		
		// 컨테이너에 패널 적재 ----------------------------------
		con.add(jp1, BorderLayout.NORTH);
		con.add(jp3, BorderLayout.SOUTH);
		con.add(jp2, BorderLayout.CENTER);
		
		
		// 윈도우 화면 표시 -----------------------------------------
		setTitle("스윙 캘린더");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Calendar today = Calendar.getInstance();
		y.setText(String.valueOf(today.get(Calendar.YEAR)));
		// int a = today.get(Calendar.YEAR);
		// String b = String.valueOf(a);
		// y.setText(b);
		m.setSelectedIndex(today.get(Calendar.MONTH));     ///---- setselected 선택되게 하는거구만
		
		year = Integer.parseInt(y.getText());
		month = Integer.parseInt( (String)m.getSelectedItem()); ///---- 어 여긴 Item이네????
		// String a = (String)m.getSelectedItem();
		// int b = Integer.parseInt(a);
		// month = a;
		drawCalendar();
	}
	
	private void drawCalendar() {
		// 시작날짜와 끝날짜 객체를 생성합니다. (sDay, eDay)
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		// year 값과 month 값으로 sDay, 와 eDay를 설정합니다.  (해당월의 1일과 말일)
		sDay.set(year, month-1,1);
		eDay.set(year, month,1);
		eDay.add(Calendar.DATE,-1);
		// sDay 의 요일을 얻습니다.
		int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);   //---1은 일요일  그렇자나
		// 얻은 요일까지 jt[] 를 지나칩니다
		int i;
		for(i=0 ; i<jt.length ; i++) jt[i].setText(""); // 전체 42칸 비움
		for(i=0 ; i<START_WEEK ; i++) jt[i].setText(""); // 해당 요일까지 비움
		// 이어지는jt[]부터 말일까지 숫자를 써넣습니다.
		i --;
		for(int k=1 ; k<=eDay.get(Calendar.DATE); k++) {
			jt[i].setText(String.valueOf(k));
			i++;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		Calendar temp = Calendar.getInstance();
		temp.set(year, month-1,1);
		switch(s) {
			case "확인" :
				year = Integer.parseInt(y.getText());
				month = Integer.parseInt((String)m.getSelectedItem());
				break;
			case "이전달" :
				temp.add(Calendar.MONTH, -1);
				year = temp.get(Calendar.YEAR);
				month = temp.get(Calendar.MONTH)+1;
				/*///-- 이방법도 가능
				 * 
				if (month ==1) {
					year -=1;
					month =12;
				}
				else {	month -=1;}
				*/
				break;
			case "다음달" :
				temp.add(Calendar.MONTH, 1);
				year = temp.get(Calendar.YEAR);
				month = temp.get(Calendar.MONTH)+1;
				
				/*
				if (month ==12) {
					year +=1;
					month =1;	
				}
				else {month +=1;	}
				*/
				break;
		}
		y.setText(String.valueOf(year));
		m.setSelectedIndex(month-1);
		
		drawCalendar();
		
	}
	
}

public class Swing19_Calendar {

	public static void main(String[] args) {
		new Calendars();

	}

}

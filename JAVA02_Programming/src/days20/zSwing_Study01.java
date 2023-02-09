package days20;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JCheckBoxTest1 extends JFrame implements ActionListener{  ///--- check box는 액션 리스너를 사용하지 않는다!!
	JTextField jtf;
	JCheckBox jcb1;
	JCheckBox jcb2;
	JCheckBox jcb3;
	JCheckBox jcb4;
	
	JCheckBoxTest1(){
		
		///--- 라디오는 다수개 선택이 안된다???? 되는것 같던데 
		jcb1 = new JCheckBox("JSP");
		jcb2 = new JCheckBox("PHP");
		jcb3 = new JCheckBox("ASP");
		jcb4 = new JCheckBox("SEREVLET");
		jtf = new JTextField(30);
		
		Font f = new Font("굴림",Font.BOLD,20);
		jcb1.setFont(f);
		jcb2.setFont(f);
		jcb3.setFont(f);
		jcb4.setFont(f);
		jtf.setFont(f);
		
		Container con =getContentPane();
		con.setLayout(new FlowLayout());
		
		con.add(jcb1);
		con.add(jcb2);
		con.add(jcb3);
		con.add(jcb4);
		con.add(jtf);
		
		// 감지 반응
		jcb1.addActionListener(this);
		jcb2.addActionListener(this);
		jcb3.addActionListener(this);
		jcb4.addActionListener(this);
		
		setTitle("Check Box Test");   
		setSize(800,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);       ///--- check box는 액션 리스너를 사용하지 않는다!!
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = "";
		if(jcb1.isSelected()) s =s + "JSP ";   ///---- isSelected 체크되면 true
		if(jcb2.isSelected()) s =s + jcb2.getActionCommand() +" ";
		if(jcb3.isSelected()) s =s + "ASP ";
		if(jcb4.isSelected()) s =s + jcb4.getActionCommand() +" ";
		
		jtf.setText("현재 선택 항목 : " + s);
		
	}
	
}
public class zSwing_Study01 {

	public static void main(String[] args) {
		new JCheckBoxTest();
		//////////// actionListener 로 해도 똑같다!
	}

}

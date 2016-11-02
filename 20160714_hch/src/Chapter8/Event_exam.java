package Chapter8;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event_exam extends JFrame implements ActionListener  {
	JLabel lb;
	JButton bt1;
	JButton bt2;
	Container con;
	public Event_exam(){
		super("이벤트 예제");
		con = this.getContentPane();
		con.setLayout(new FlowLayout());

		lb = new JLabel("안녕하세요.");
		bt1 = new JButton("확인");
		bt2 = new JButton("취소");
		//지역변수임.
		con.add(lb);
		con.add(bt1);
		con.add(bt2);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300, 400);
		this.setVisible(true);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event_exam ex1 = new Event_exam();
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj == bt1)
		{lb.setText("확인버튼 Event 발동!!");
		con.setBackground(Color.yellow);
		bt1.setBackground(Color.green);
		System.out.println("레벨업!!");}
		else if(obj == bt2){
			lb.setText("최소버튼 발동!!");
			con.setBackground(Color.pink);
			bt2.setBackground(Color.cyan);
			System.out.println("레벨다운!!");}
		}
	}



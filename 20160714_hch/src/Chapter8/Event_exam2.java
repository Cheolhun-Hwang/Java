package Chapter8;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event_exam2 extends JFrame {
	JLabel lb;
	JButton bt1;
	JButton bt2;
	Container con;
	public Event_exam2(){
		super("이벤트 예제2");
		con = this.getContentPane();
		lb = new JLabel("안녕하세요.");
		bt1 = new JButton("확인");
		bt2 = new JButton("취소");
		con.add(lb);
		con.add(bt1);
		con.add(bt2);
		
		con.setLayout(new FlowLayout());
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		//===============================
		
		bt1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lb.setText("확인 클릭 완료!!!!");
				con.setBackground(Color.LIGHT_GRAY);
				bt1.setBackground(Color.yellow);
				System.out.println("확인 완료!");}
		});
		
		bt2.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				lb.setText("취소 클릭 완료!!!!");
				con.setBackground(Color.blue);
				bt2.setBackground(Color.MAGENTA);
				System.out.println("취소 완료!");}
		});
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Event_exam2 exam2 = new Event_exam2();
		new Event_exam2();
	}

}

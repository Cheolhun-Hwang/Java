package Chapter8;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Event_exam3 extends JFrame {
	JLabel title;
	JLabel jl1;
	JLabel jl2;
	JLabel jl3;
	JLabel res;
	JTextField num1;
	JTextField num2;
	JButton add_b;
	JButton sub;
	JButton mul;
	JButton nan;
	JButton mod;
	Container con;
	
	public Event_exam3 (){
		super("이벤트 예제2");
		con = this.getContentPane();
		title = new JLabel("## 계산기 ##");
		jl1 = new JLabel("숫자1");
		jl2 = new JLabel("숫자2");
		jl3 = new JLabel("결과");
		res = new JLabel("0");
		num1 = new JTextField(10);
		num2 = new JTextField(10);
		add_b = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("*");
		nan = new JButton("/");
		mod = new JButton("%");
		
		
	
		
		con.add(title, BorderLayout.NORTH);
		con.add(jl1, BorderLayout.CENTER);
		con.add(num1, BorderLayout.CENTER);
		con.add(jl2, BorderLayout.CENTER);
		con.add(num2, BorderLayout.CENTER);
		con.add(add_b, BorderLayout.SOUTH);
		con.add(sub, BorderLayout.SOUTH);
		con.add(mul, BorderLayout.SOUTH);
		con.add(nan, BorderLayout.SOUTH);
		con.add(mod, BorderLayout.SOUTH);
		con.add(jl3, BorderLayout.AFTER_LAST_LINE);
		con.add(res, BorderLayout.AFTER_LAST_LINE);
		
		con.setLayout(new FlowLayout());
		
		
		add_b.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String n1 = num1.getText();
				String n2 = num2.getText();
				double result = Integer.parseInt(n1) + Integer.parseInt(n2);
				res.setText(String.valueOf(result));
			}
		});
		
		sub.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String n1 = num1.getText();
				String n2 = num2.getText();
				double result = Integer.parseInt(n1) - Integer.parseInt(n2);
				res.setText(String.valueOf(result));
			}
		});
		
		mul.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String n1 = num1.getText();
				String n2 = num2.getText();
				double result = Integer.parseInt(n1) * Integer.parseInt(n2);
				res.setText(String.valueOf(result));
			}
		});
		
		nan.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String n1 = num1.getText();
				String n2 = num2.getText();
				double result = Integer.parseInt(n1) / Integer.parseInt(n2);
				res.setText(String.valueOf(result));
			}
		});
		
		mod.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String n1 = num1.getText();
				String n2 = num2.getText();
				int result = Integer.parseInt(n1) % Integer.parseInt(n2);
				res.setText(String.valueOf(result));
			}
		});
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event_exam3();
	}

}

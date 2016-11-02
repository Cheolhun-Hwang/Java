package Chapter8;

import java.awt.*;
import java.awt.event.*;
import java.io.*;


import javax.swing.*;


public class callp extends JFrame  {
	JLabel title;
	JLabel lname;
	JLabel lcall;
	JLabel lemail;
	JTextField tname;
	JTextField tcall;
	JTextField temail;
	JButton btn;
	Container con;
	Container con2;
	
	
	public callp(){
	super("연락처 프로그램");
	title = new JLabel("## 연락처 프로그램 ##");
	lname = new JLabel("이름");
	lcall = new JLabel("전화번호");
	lemail = new JLabel("이메일");
	btn = new JButton("입력");
	tname = new JTextField(20);
	tcall = new JTextField(20);
	temail = new JTextField(20);
	con = this.getContentPane();

	
	
	
	Panel p1 = new Panel();
	p1.add(title);
	
	Panel p2 = new Panel();
	p2.add(lname);
	p2.add(tname);
	
	Panel p3 = new Panel();
	p3.add(lcall);
	p3.add(tcall);
	
	Panel p4 = new Panel();
	p4.add(lemail);
	p4.add(temail);
	
	Panel p5 = new Panel();
	p5.add(btn);
	
	Panel p6 = new Panel();
	p6.add(p2, BorderLayout.NORTH);
	p6.add(p3, BorderLayout.CENTER);
	p6.add(p4, BorderLayout.SOUTH);
	
	con.add(p1, BorderLayout.NORTH);
	con.add(p6, BorderLayout.CENTER);
	con.add(p5, BorderLayout.SOUTH);
	
	this.setSize(400, 200);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setVisible(true);
	
	btn.addActionListener(new ActionListener() {
		

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String sname = tname.getText();
			String scall = tcall.getText();
			String semail = temail.getText();
			File file = new File("C:\\Users\\qewqs\\Desktop\\Exam_d\\call.txt");
			
			
			try{
				FileWriter fw=new FileWriter(file, true);
				BufferedWriter bf = new BufferedWriter(fw);
				bf.write(sname + " ");
				bf.write(scall + " ");
				bf.write(semail + " ");
				bf.newLine();
				bf.flush();
				System.out.println("저장완료");
				bf.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	});
	
	
	
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new callp();
	}

}

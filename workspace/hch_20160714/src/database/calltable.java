package database;


import java.awt.*;
import java.sql.*;
import javax.swing.*;




public class calltable extends JFrame {
	JLabel title;
	JLabel lname;
	JLabel lcall;
	JLabel lemail;
	JTextField tname;
	JTextField tcall;
	JTextField temail;
	JButton btn;
	Container con;
	JPanel p1;
	JPanel p2;
	JPanel p3;
	
	
	public calltable(){
	
		super("연락처 프로그램");
		title = new JLabel("## 연락처 프로그램 ##");
		lname = new JLabel("이름");
		lcall = new JLabel("전화번호");
		lemail = new JLabel("이메일");
		btn = new JButton("입력");
		tname = new JTextField(20);
		tcall = new JTextField(20);
		temail = new JTextField(20);
		con = getContentPane();
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
		
		
		
		this.setSize(400, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 연결 성공");
		}catch(Exception e){
			System.out.println("드라이버 연결 에러");
			System.exit(0);
		}
		try{
			Connection con = null;
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "HCH";
			String passwd = "hch";
			con = DriverManager.getConnection(url, user, passwd);
			System.out.println("DB 연결 성공");
		}catch(Exception e){
			System.out.println("유저 연결 에러");
		}
	}

}

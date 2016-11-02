package Homework_2_GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Standard_GUI extends JFrame{

	public Standard_GUI() {
		// TODO Auto-generated constructor stub
		setSize(400, 250);											//출력창을 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//출력창의 닫기 버튼으로 프로그램 종료 유무 없을면 종료시에도 Run되고 있다.
		setTitle("과제2_4");											//출력창 제목 설정
		
		JPanel p = new JPanel();									//전체 컨테이너
		JPanel p1 = new JPanel();									//위쪽 컨테이너
		JPanel p2 = new JPanel();									//왼쪽 컨테이너
		JPanel p3 = new JPanel();									//가운데 컨테이너
		JPanel p4 = new JPanel();									//오른쪽 컨테이너
		
		p.setLayout(new BorderLayout());							//전체 컨테이너의 레이아웃 구성 : BorderLayout으로 한다.
		p2.setLayout(new BorderLayout());							//왼쪽 컨테이너의 레이아웃 구성 : BorderLayout으로 한다.
		p4.setLayout(new BorderLayout());							//오른쪽 컨테이너의 레이아웃 구성 : BorderLayout으로 한다.
		JLabel lb1 = new JLabel("파일");							//텍스트 출력 라벨
		JTextField tf1 = new JTextField(20);						//텍스트 출력창 작성 가능 길이 20자
		JButton bt1 = new JButton("찾아보기");						//찾아보기 버튼 생성
		JButton bt2 = new JButton("입력");							//입력 버튼 생성
		
		p1.add(lb1);													//p1 컨테이너에 추가
		p1.add(tf1);													//p1 컨테이너에 추가
		p1.add(bt1);													//p1 컨테이너에 추가
		p1.add(bt2);													//p1 컨테이너에 추가
		
		JLabel lb2 = new JLabel("구성박스");						//텍스트 출력 라벨
		lb2.setForeground(Color.LIGHT_GRAY);						//텍스트 색상 변경
		JTextArea ta1 = new JTextArea();							//텍스트 여러 줄을 입력 출력하는 창 생성
		ta1.setColumns(15);											//열크기를 15자로 지정
		ta1.setEnabled(false);										//텍스트 작성 불가
		p2.add(lb2, BorderLayout.NORTH);							//p2 컨테이너 위쪽에 추가
		p2.add(ta1, BorderLayout.CENTER);							//p2 컨테이너 중앙에 추가
		JLabel lb3 = new JLabel("적용");							//텍스트 출력 라벨
		lb3.setForeground(Color.LIGHT_GRAY);						//텍스트 색상 변경
		JTextArea ta2 = new JTextArea();							//텍스트 여러 줄을 입력 출력하는 창 생성
		ta2.setEnabled(false);										//텍스트 작성 불가
		ta2.setColumns(15);											//열크기를 15자로 지정
		p4.add(lb3, BorderLayout.NORTH);							//p4 컨테이너 위쪽에 추가
		p4.add(ta2, BorderLayout.CENTER);							//p4 컨테이너 중앙에 추가
		
		JButton bt3 = new JButton("넣기");							//넣기 버튼 생성
		JButton bt4 = new JButton("빼기");							//뺴기 버튼 생성
		JButton bt5 = new JButton("삭제");							//삭제 버튼 생성
		
		p3.add(bt3);													//p3 컨테이너 추가
		p3.add(bt4);													//p3 컨테이너 추가
		p3.add(bt5);													//p3 컨테이너 추가
		
		p1.setBackground(Color.red);								//p1 색상 변경 빨강
		p2.setBackground(Color.blue);								//p2 색상 변경 파랑
		p3.setBackground(Color.green);							//p3 색상 변경 녹생	
		p4.setBackground(Color.MAGENTA);							//p4 색상 변경 

		p.add(p1, BorderLayout.NORTH);							//전체 컨테이너 위쪽에 p1 컨테이너 추가
		p.add(p2, BorderLayout.WEST);								//전체 컨테이너 왼쪽에 p2 컨테이너 추가
		p.add(p3, BorderLayout.CENTER);							//전체 컨테이너 중앙에 p3 컨테이너 추가
		p.add(p4, BorderLayout.EAST);								//전체 컨테이너 오른쪽에 p4 컨테이너 추가
		
		this.add(p);													//전체 컨테이너를 프레임에 추가
		
		setVisible(true);											//창이 보이도록 설정
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Standard_GUI sg = new Standard_GUI();					//메인에서 객체 생성
	}

}

package Event_Class;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPad extends JFrame implements ActionListener {
	private JTextField txt;
	private JPanel panel;
	
	public KeyPad(){
		txt=new JTextField(20);
		add(txt, BorderLayout.NORTH);
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		add(panel, BorderLayout.CENTER);
		for(int i = 1;i<=9;i++){
			JButton btn = new JButton(""+i);
			btn.addActionListener(this);
			btn.setPreferredSize(new Dimension(100, 100));  //Dimengion 전체 윈도우창 크기 또는 frame 크기를
																		//알려주는 메소드 getPreferredSize 는 전체크기를 대비하여 적절한 크기로
																		//조정해주는 메소드
			panel.add(btn);
		}
		pack();														//pack 프레임 내에 서브컴포넌트들의 레이아웃과 PreFeredSize 에
																		//맞도록 윈도우의 사이즈를 맞추는 작업이다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	
	}
	
	public void actionPerformed(ActionEvent e){
		String actionCommand = e.getActionCommand();
		txt.setText(txt.getText() + actionCommand);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyPad();
	}

}

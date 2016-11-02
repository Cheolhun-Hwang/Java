package Chapter8;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Chapter8_5 extends JFrame implements ActionListener{
	int index = 0;
	String[] msgs = {"첫 번째 문장", "두 번째 문장","세 번째 문장"};
	JButton btn1 = new JButton("<<");
	JButton btn2 = new JButton(">>");
	JButton btn3 = new JButton(msgs[0]);
	
	public Chapter8_5(){
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.setEnabled(false);
		add(btn1, BorderLayout.WEST);
		add(btn2, BorderLayout.EAST);
		add(btn3, BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter8_5 app = new Chapter8_5();
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj == btn1){
			index --;
		}else if(obj == btn2){
			index ++;
		}
		
		if(index > 2){
			index = 0;
		}else if(index < 0){
			index = 2;
		}
		btn3.setText(msgs[index]);
	}

}

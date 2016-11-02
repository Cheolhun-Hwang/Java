package Week6;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame_FlowLayout extends JFrame{

	/**
	 * @param args
	 */
	JPanel p1;
	
	
	public MyFrame_FlowLayout() {
		// TODO Auto-generated constructor stub
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("FlowLayout");
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		for(int i = 0 ; i< 10;i++){
			p1.add(new JButton(("Button"+i)));
		}
		add(p1);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame_FlowLayout f = new MyFrame_FlowLayout();
	}

}

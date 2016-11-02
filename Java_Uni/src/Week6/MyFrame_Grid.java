package Week6;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame_Grid extends JFrame{

	/**
	 * @param args
	 */
	
	/**
	 * 
	 */
	public MyFrame_Grid(){
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 3));
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button"));
		
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame_Grid f = new MyFrame_Grid();
	}

}

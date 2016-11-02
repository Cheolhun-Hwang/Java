package Chapter8;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

import javax.swing.JButton;

public class Chapter8_4 extends JFrame{

	JButton btn1 = new JButton("버튼 1");
	JButton btn2 = new JButton("버튼 2");
	JButton btn3 = new JButton("버튼 3");
	JButton btn4 = new JButton("버튼 4");
	JButton btn5 = new JButton("버튼 5");
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	
	public void flowLayout(){
		p1.setLayout(new FlowLayout());
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		p1.add(btn5);
	}
	
	public void gridLayout(){
		p1.setLayout(new GridLayout());
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		p1.add(btn5);
	}
	public void borderLayout(){
		p1.setLayout(new BorderLayout());
		p1.add(btn1, BorderLayout.NORTH);
		p1.add(btn2, BorderLayout.WEST);
		p1.add(btn3, BorderLayout.EAST);
		p1.add(btn4, BorderLayout.SOUTH);
		p1.add(btn5, BorderLayout.CENTER);
	}
	/*public void cardLayout(){
		final CardLayout card = new CardLayout();
		setLayout(card);
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p2.add(btn4);
		p2.add(btn5);
		add("p1", p1);
		add("p2", p2);
		
		button3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0){
				card.show(getContentPan(), "p2");
			}
		});
	}*/
	
	public Chapter8_4(){
		super("Layout Showcase");
		getContentPane().add(p1);
		//flowLayout();
		//gridLayout();
		borderLayout();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter8_4 app = new Chapter8_4();
	}

}

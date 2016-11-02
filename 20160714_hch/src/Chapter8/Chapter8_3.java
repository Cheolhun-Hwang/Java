package Chapter8;

import java.awt.*;

public class Chapter8_3 extends Frame{
	
	public Chapter8_3(){
		super("AWT 기본예제");
		setLayout(new BorderLayout());
		Label t1 = new Label("ID");
		Label t2 = new Label("Passwd");
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		Button btn1 = new Button("Login");
		Button btn2 = new Button("Cancel");
		
		Panel p1 = new Panel();
		p1.add(t1);
		p1.add(id);
		
		Panel p2 = new Panel();
		p2.add(t2);
		p2.add(pwd);
		
		Panel p3 = new Panel();
		p3.add(btn1);
		p3.add(btn2);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		setSize(250, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter8_3 app = new Chapter8_3();
	}

}

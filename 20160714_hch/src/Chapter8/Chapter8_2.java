package Chapter8;

import java.awt.*;
import javax.swing.*;

public class Chapter8_2 extends JFrame {

		public Chapter8_2(){
			super("Hello World");
			//getContentPane().setLayout(new FlowLayout());
			Container cont = this.getContentPane();
			//Container는 상위 클래스가 만든거라 new 사용 불가능!!!
			cont.setLayout(new FlowLayout());
			JLabel id = new JLabel("Hello Linux World");
			cont.add(id);
			JButton bt1 = new JButton("확인");
			JButton bt2 = new JButton("확인");
			cont.add(bt1);
			cont.add(bt2);
			
			JCheckBox chbox1 = new JCheckBox("포켓몬 Go");
			JCheckBox chbox2 = new JCheckBox("오버워치");
			JCheckBox chbox3 = new JCheckBox("검은사막");
			JCheckBox chbox4 = new JCheckBox("디아블");
			
			cont.add(chbox1);
			cont.add(chbox2);
			cont.add(chbox3);
			cont.add(chbox4);
			//체크박스
			
			JRadioButton rbo1 = new JRadioButton("1학년");
			JRadioButton rbo2 = new JRadioButton("2학년");
			JRadioButton rbo3 = new JRadioButton("3학년");
			JRadioButton rbo4 = new JRadioButton("4학년");
			cont.add(rbo1);
			cont.add(rbo2);
			cont.add(rbo3);
			cont.add(rbo4);
			
			//라디오 박스
			
			/*getContentPane().add(label);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(200, 200);
			setVisible(true);*/
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setSize(300, 400);
			this.setVisible(true);
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter8_2 app = new Chapter8_2();
	}

}

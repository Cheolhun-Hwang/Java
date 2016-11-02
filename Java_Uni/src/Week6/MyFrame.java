package Week6;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	/**
	 * @param args
	 */
	
	public MyFrame(){
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JPanel panela = new JPanel();
		JPanel panelb = new JPanel();
		
		JLabel label = new JLabel("종류를 선택하시오.");
		panela.add(label);
		
		JButton button1 = new JButton("콤보");
		JButton button2 = new JButton("감자");
		JButton button3 = new JButton("고기");
		panelb.add(button1);
		panelb.add(button2);
		panelb.add(button3);
		
		JLabel label2 = new JLabel("개수");
		JTextField field1 = new JTextField(10);
		panelb.add(label2);
		panelb.add(field1);
		
		panel.add(panela);
		panel.add(panelb);
		add(panel);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
	}

}

package Event_Class;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel{
	BufferedImage img = null;
	int img_x = 100, img_y = 100;
	
	public MyPanel(){
		try{
			img=ImageIO.read(new File("/home/hch/workspace/Java_Uni/bin/Event_Class/images (1).jpg")); //절대경로
		}catch(IOException e){
			System.out.println("No Image!");
			System.exit(1);
		}
		addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e){
				int keycode = e.getKeyCode();
				switch(keycode){
				case KeyEvent.VK_UP: img_y -= 10; break;
				case KeyEvent.VK_DOWN: img_y += 10; break;
				case KeyEvent.VK_LEFT: img_x -= 10; break;
				case KeyEvent.VK_RIGHT: img_x += 10; break;
				}
				repaint();										//디스플레이 메소드
				/*repaint() 메소드 : 강제로 paint() 메소드를 한 번 더 호출하고 싶을 때 사용 (방금 처리한 작업을 화면에 바로 보여주고 싶으면 repaint()메소드를 호출하여 paint()메소드를 호출) */
			}
			public void keyReleased(KeyEvent arg0){}		//추상클래스 정의
			public void keyTyped(KeyEvent arg0) {}			//추상클래스 정의
		});		//무명 클래스 정의
		this.requestFocus();		//component 가 이벤트를 받을 수 있게 함
		setFocusable(true);		//키보드 포커스 요청하고 패널이 포커스를 받을 수 있게 한다.
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
		//이미지를 위치에 그린다.
	}
}

public class CarGameTest extends JFrame {

	/**
	 * @param args
	 */
	public CarGameTest(){
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarGameTest s = new CarGameTest();
	}

}

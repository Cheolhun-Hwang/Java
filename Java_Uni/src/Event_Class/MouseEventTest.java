package Event_Class;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Rectangle{
	int x, y, w, h;
}

class MyPanel3 extends JPanel implements MouseListener{
	BufferedImage img = null;
	int img_x = 0, img_y = 0;
	Rectangle[] array = new Rectangle[100];
	int index = 0;
	
	public MyPanel3(){
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(Rectangle r : array){
			if(r != null){
				g.drawRect(r.x, r.y, r.w, r.h); // 사각형 그리기
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(index > 100){
			return;
		}
		
		array[index] = new Rectangle();
		array[index].x = e.getX();
		array[index].y = e.getY();
		array[index].w = 50;
		array[index].h = 50;
		index ++;
		repaint();
		/*repaint() 메소드 : 강제로 paint() 메소드를 한 번 더 호출하고 싶을 때 사용 (방금 처리한 작업을 화면에 바로 보여주고 싶으면 repaint()메소드를 호출하여 paint()메소드를 호출) */
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
public class MouseEventTest extends JFrame {

	/**
	 * @param args
	 */
	public MouseEventTest(){
		setSize(300, 300);
		setTitle("마우스로 사각형 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel3());
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseEventTest s = new MouseEventTest();
	}

}

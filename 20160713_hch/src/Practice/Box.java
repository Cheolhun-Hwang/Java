/*
 * 내용 : 강사 실습 예제
 * 작성자 : 황철
 */
package Practice;

public class Box extends Nemo { //자바는 각 클래스를 따로 클래스 파일로 만들어야한다.
	private int Nopi;
	
	public Box(){
		this.Nopi = 10;
	}
	
	public Box(int a, int b, int c){
		super(a, b);
		this.Nopi = c;
	}
	
	
	public int getArea(){
		return getWidth()*getHight()*Nopi;
		//protect 이상 권한을 주어야함. 아니면 get set 메소드를 부모에 만들어주어야할수 있음.
		//return width*hight*Nopi;
	}

}

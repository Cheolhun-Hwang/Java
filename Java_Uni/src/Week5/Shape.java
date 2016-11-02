package Week5;

public class Shape {

	private int x;
	private int y;
	
	public Shape(int x, int y){
		System.out.println("Shape()");
		this.x = x;
		this.y = y;
	}
	
	public int getx() {return x;}
	public void setx(int x) {this.x =x;}
	public int gety() { return y;}
	public void sety(int y) {this.y=y;}
	
	void print(){
		System.out.println("x좌표 : " + x + " y좌표 : " + y);
	}

}

package Week5;

public class Rectangle extends Shape {

	private int width;
	private int height;
	
	public Rectangle(int x,  int y, int w, int h){
		super(x, y);
		System.out.println("Rectangle()");
		this.width = w;
		this.height = h;
	}
	
	public int getWidth() {return width;}
	public int getHeight() {return height;}
	public void setWidth(int width) {this.width = width;}
	public void setHeight(int height){this.height = height;}
	
	double area(){
		return (double)width*height;
	}
	
	void draw(){
		System.out.println("(" + this.getx() + ", " + this.gety() + ") 위치에 " + "가로: " + width + " 세로: " + height);
	}
	double CalcArea(){
		return (this.width*this.height);
	}
}

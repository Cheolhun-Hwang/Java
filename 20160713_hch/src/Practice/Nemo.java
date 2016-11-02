/*
 * 내용 : 강의 실습 예제
 * 작성자 : 황철
 */
package Practice;

import java.util.Scanner;

public class Nemo {
	//protected int width;
	//protected int hight;
	
	private int width;
	private int hight;
	
	public Nemo(){
		this.width = 10;
		this.hight = 10;
	}
	
	public Nemo(int a, int b){
		this.width = a;
		this.hight = b;
	}
	
	public int getArea(){
		return width*hight;
	}
	
	public int getWidth(){
		return width;
	}
	
	public void setWidth(int a){
		this.width = a;
	}
	
	public void setHight(int a){
		this.hight = a;
	}
	
	public int getHight(){
		return hight;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nemo n1 = new Nemo(20, 30);
		Box b1 = new Box(10, 20, 60);
		Nemo n2 = new Nemo();
		
		n2.width =4;
		n2.hight = 5;
		 // 이렇게 안하지 특수한 경우를 제외하고는 생성자에서 핸들링하니까.
		int result = 0;
		
		System.out.println(n1.getArea());
		System.out.println(b1.getArea());
		
		result = n2.getArea();
		System.out.println("가로 : " + n2.width + "  세로 : " + n2.hight + "\n면적 : " + result);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("## 박스 넓이 구하기 ##");
		System.out.print("박스 가로 : ");
		int w = scan.nextInt();
		System.out.print("박스 세로 : ");
		int h = scan.nextInt();
		System.out.print("박스 높이 : ");
		int n = scan.nextInt();
		
		Box b2 = new Box(w, h, n);
		System.out.println("박스의 넓이 : " + b2.getArea());
	}

}

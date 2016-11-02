package Week2;

import java.util.Scanner;

public class CircleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radious;
		double area;
		
		Scanner input = new Scanner(System.in);
		System.out.print("반지름을 입력하시오 : ");
		radious = input.nextDouble();
		area = 3.14 * radious * radious;
		
		System.out.println("면적 : " + area);
	}

}

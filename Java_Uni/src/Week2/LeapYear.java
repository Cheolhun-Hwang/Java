package Week2;

import java.util.Scanner;

public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		boolean isLeapYear;
		Scanner input = new Scanner(System.in);
		
		System.out.print("윤년을 확인인지 확인하고 싶은 년수를 적으시오 : ");
		year = input.nextInt();
		
		isLeapYear = (year % 4 == 0);
		System.out.println(isLeapYear);
	}

}

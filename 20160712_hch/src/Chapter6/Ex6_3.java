/*
 * 날짜 : 20160712
 * 작성자 : 황철훈
 * 내용 : 교재 예
 */
package Chapter6;

public class Ex6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = new Integer(30);
		Integer num2 = num1.intValue();
		Integer num3=50;
		
		int num4 = num3;
		String num5="40";
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("SIZE : " + Integer.SIZE);
		
		int result = num1 + Integer.parseInt(num5);//parse char[]->int!!
		System.out.println("num1 + num5 = " + result);
	}

}

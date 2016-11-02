/* 작성일 : 20160712
 * 작성자 : 황철훈
 * 내용 : 교재 예제
 */
package Chapter4;

public class Ex5 {
	static int num1 = 10;
	int num2 = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex5 ex1 = new Ex5();
		Ex5 ex2 = new Ex5();
		ex1.num1 = 20;
		ex2.num1 = 30;
		System.out.println("ex1.num1 : " + ex1.num1);
		System.out.println("ex2.num1 : " + ex2.num1);
		
		ex1.num2 = 30;
		ex2.num2 = 50;
		System.out.println("ex1.num2 : "+ ex1.num2);
		System.out.println("ex2.num2 : " + ex2.num2);
		
		System.out.println("num1 : " + num1);
	}

}

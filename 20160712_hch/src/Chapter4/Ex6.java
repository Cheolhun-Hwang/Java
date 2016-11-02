/* 작성일 : 20160712
 * 작성자 : 황철훈
 * 내용 : 교재 예제
 */
package Chapter4;
//클라스에 넣어라!!!!!!!
public class Ex6 {
	public int sum(int num1, int num2){
		return (num1+num2);
	}
	
	public double sum(double num1, double num2, double num3){
		return (num1+num2+num3);
	}
	
	public int sum(int num1, int num2, int num3){
		return (num1+num2+num3);
	}
	
	public double sum(double num1, double num2){
		return (num1+num2);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex6 exam = new Ex6();
		System.out.println(exam.sum(3, 5));
		System.out.println(exam.sum(3, 5, 9));
		System.out.println(exam.sum(3.5, 5.8));
		System.out.println(exam.sum(3.5, 5.8, 6.6));
	}

}

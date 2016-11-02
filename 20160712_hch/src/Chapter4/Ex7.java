/* 작성일 : 20160712
 * 작성자 : 황철훈
 * 내용 : 교재 예제
 */
package Chapter4;

 public class Ex7 {
	 /*@Override*/
	 public String toString(){
	 	return "오버라이딩 예제입니다.";
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex7 exam = new Ex7();
		Ex7 exam2 = new Ex7();
		
		System.out.println(exam.toString());
		System.out.println(exam2.toString());
	}
}

/* 작성일 : 20160711
 * 작성자 : 황철훈
 * 내용 : 책내용 예재
 */
package java_key;

public class Chapter3_14 extends Chapter3_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		while(num > 10){
			System.out.println(num--);
		}
		
		boolean flag = true;
		while(flag){
			num--;
			if(num == 3){
				flag = false;
				System.out.println("num = 3 종료!!");
			}
		}
	}

}

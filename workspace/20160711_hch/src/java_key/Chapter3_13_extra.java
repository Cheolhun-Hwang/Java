/* 작성일 : 20160711
 * 작성자 : 황철훈
 * 내용 : 강사 예제
 */
package java_key;

public class Chapter3_13_extra extends Chapter3_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i<100;i++){
			sum = sum+i;
			System.out.println("i = " + i + "\t누적합 = " + sum);
		}
	}

}

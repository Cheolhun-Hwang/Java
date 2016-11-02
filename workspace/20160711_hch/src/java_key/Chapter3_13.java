/* 작성일 : 20160711
 * 작성자 : 황철훈
 * 내용 : 책내용 예재
 */
package java_key;

public class Chapter3_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2 ;i<10;i++){
			System.out.println("##" + i + "단 ##");
			for(int j = 1; j<10;j++){
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
	}

}

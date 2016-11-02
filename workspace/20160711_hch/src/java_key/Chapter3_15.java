/* 작성일 : 20160711
 * 작성자 : 황철훈
 * 내용 : 교재 예제
 */
package java_key;

public class Chapter3_15 extends Chapter3_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] products = {"Apple Iphone", "Samsung Galexy", "Nokia Rumia", "Sony Expria"};
		for(int i = 0 ; i< products.length ; i++){
			System.out.println(products[i]);
		}
		System.out.println("===================================");
		for(String s : products){
			System.out.println(s);
		}
	}

}

/* 작성일 : 20160711
 * 작성자 : 황철훈
 * 내용 : 책내용 예재
 */
package java_key;

public class Chapter3_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chapter 3 - 2
        byte num1 = 'A';
        int result;

        short char1= '}';
        char char2 = 66;
        long num2 = 9876543210L;

        System.out.printf("num1 숫자 : %d \n", num1);
        System.out.printf("num1 문자 : %c \n", num1);
        System.out.printf("char1 숫자 : %d \n", char1);
        System.out.printf("char2 문자 : %c \n", char2);
        System.out.printf("num2 숫자 : %d \n", num2);
        result = num1 +30;
        System.out.printf("num1+30 : %d \n", result);
	}

}

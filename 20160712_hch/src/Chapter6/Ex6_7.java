/*
 * 날짜 : 20160712
 * 작성자 : 황철훈
 * 내용 : 교재 예
 */
package Chapter6;

import java.util.Random;

public class Ex6_7 {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		/*Random r2 = new Random(99);
		Random r3 = new Random(123);
		Random r4 = new Random(System.currentTimeMillis());
		
		System.out.println("## 기본 난수 출력 ##");
		System.out.println("r1 : " + r1.nextInt(10));
		System.out.println("r2 : " + r2.nextInt(10));
		System.out.println("r3 : " + r3.nextInt(10));
		System.out.println("r4 : " + r4.nextInt(10));
		
		System.out.println("## 범위 지정 난수 출력 ##");
		System.out.println("1~20 : " + (r1.nextInt(20)+1));
		System.out.println("1~20 : " + (r1.nextInt(20)+1));
		System.out.println("1~20 : " + (r1.nextInt(20)+1));
		System.out.println("1~20 : " + (r1.nextInt(20)+1));*/
		int lim = 1000;
		int[] a = new int[lim];
		for(int i = 0 ; i<lim;i++){
			a[i] = 0;
		}
		int i = 0;
		while(i<lim){
			int sub = r1.nextInt(lim);
			System.out.println("나온 값 : " + sub);
			a[sub]++;
			i++;
		}
		double h = 0;
		for(int j=0;j<lim;j++){
			h = ((double)a[j]/lim)*100;
			System.out.println((j+1) + "번 나온 횟수 : " + a[j] + "  확률 : " + h +"%");
		}
		
	}

}

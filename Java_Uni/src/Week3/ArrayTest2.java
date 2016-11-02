package Week3;

import java.util.Scanner;

public class ArrayTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int Stu = 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
	
		int[] scores = new int[Stu];
		
		for(int i = 0; i<scores.length;i++){
			System.out.print("성적을 입력하시오: ");
			scores[i] = scan.nextInt();
		}
		
		for(int i = 0;i<scores.length;i++){
			total+=scores[i];
		}
		System.out.println("평균 성적은" + total / Stu+"입니다.");
	
	
	
	}

}

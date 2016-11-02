package Week3;

import java.util.Scanner;

public class NumberGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 59;
		int guess;
		Scanner scan = new Scanner(System.in);
		int tries = 0;
		
		do{
			System.out.print("정답을 추측하여 보시오 : ");
			guess = scan.nextInt();
			tries++;
			
			if(guess > answer){
				System.out.println("제시한 정수가 높습니다.");
			}else if(guess < answer){
				System.out.println("제시한 정수가 낮습니다.");
			}
		}while(guess != answer);
		
		System.out.println("축화합니다. 시도횟수 = " + tries);
	}

}

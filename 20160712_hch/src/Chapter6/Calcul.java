package Chapter6;

import java.util.Scanner;

public class Calcul {

	@SuppressWarnings("resource")
	public void go(){
		Scanner scan = new Scanner(System.in);
		String ans = "y";
		while(ans.equals("y") || ans.equals("Y") ){
		System.out.println("## 간단한 계산기##");
		System.out.print("숫자1 ->");
		int num1 = scan.nextInt();
		System.out.print("연산자(+, -, *, /, %) ->");
		String op = scan.next();
		System.out.print("숫자2 ->");
		int num2 = scan.nextInt();
		
		switch(op){
		case "+" :
			System.out.printf("계산결과 : %d + %d = %d \n", num1 ,num2 ,(num1+num2));
			break;
		case "-" :
			System.out.printf("계산결과 : %d - %d = %d \n", num1 ,num2 ,(num1-num2));
			break;
		case "*" :
			System.out.printf("계산결과 : %d * %d = %d \n", num1 ,num2 ,(num1*num2));
			break;
		case "/" :
			System.out.printf("계산결과 : %d / %d = %f \n", num1 ,num2 ,(double)(num1/num2));
			break;
		case "%" :
			//System.out.println("계산결과 : " + num1 + " % " + num2 + " = " + num1%num2);
			System.out.printf("계산결과 : %d  %d = %d", num1 ,num2 ,(num1%num2));
			break;
		default:
				System.out.println("잘못된 입력입니다.");
		}
		System.out.print("계속하시겠습니까? [y/n] ->");
		ans = scan.next();
		if(ans.equals("n")||ans.equals("N")){
			break;
		}
		}
		/*if(op.equals("+")){
			System.out.printf("계산결과 : %d + %d = %d", num1 ,num2 ,(num1+num2));
		}else if(op.equals("-")){
			System.out.printf("계산결과 : %d - %d = %d", num1 ,num2 ,(num1-num2));
		}else if(op.equals("*")){
			System.out.printf("계산결과 : %d * %d = %d", num1 ,num2 ,(num1*num2));
		}else if(op.equals("/")){
			System.out.printf("계산결과 : %d / %d = %f", num1 ,num2 ,(double)(num1/num2));
		}else if(op.equals("%")){
			System.out.printf("계산결과 : %d % %d = %d", num1 ,num2 ,(num1%num2));
		}else{
			System.out.println("잘못된 입력입니다.");
		}*/
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcul cl = new Calcul();
		cl.go();
	}
}

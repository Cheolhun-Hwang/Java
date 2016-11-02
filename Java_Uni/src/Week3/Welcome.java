package Week3;

import java.util.Currency;
import java.util.Date;

public class Welcome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int currentHour = date.getHours();
		
		System.out.println("현재 시간 : "+ date);
		if(currentHour < 11 && currentHour > 5){
			System.out.println("Good Morning");
		}else if (currentHour < 15){
			System.out.println("Good Afternoon");
		}else if (currentHour < 20){
			System.out.println("Good Evening");
		}else{
			System.out.println("Good Night");
		}
	}

}

package Chapter6;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Cel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date();
		System.out.println("date1 : " + date1);
		Calendar cal = Calendar.getInstance();
		System.out.println("오늘은 " + cal.get(Calendar.YEAR) + "년 " + cal.get(Calendar.MONTH) + "월 " + cal.get(Calendar.DATE) + "일 입니다.");
		
	}

}

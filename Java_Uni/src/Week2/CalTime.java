package Week2;

public class CalTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double light_speed = 30e4; // 기호상수로 만들기 위한 final 사용
		double distance = 40e12;
		
		double secs;
		
		secs = distance/light_speed;
		
		double light_year = secs / (60.0*60.0*24.0*365.0);
		System.out.println("걸리는 시간은 " + light_year + "광년입니다.");
	}

}

package Week2;

public class Light {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long lightspeed;
		long distance;
		
		lightspeed = 300000;  //초당 가는 거리
		distance = lightspeed * 365L * 24 * 60 * 60; // 초당 가는 거리 * 1년을 초로 계산한 결과
		
		
		System.out.println("빛이 1년 동안 가는 거리 : " + distance + "km.");
	}

}

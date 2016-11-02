package Week5;

public class ManagerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager("Tom", "Seoul", 1000000, 123456, 500000);
		System.out.println(m); //객체만 호출되면 toString 선언시 이하 내용이 호출된다.
		m.test();
	}

}

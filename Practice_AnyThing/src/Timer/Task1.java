package Timer;

//쓰레드를 직접 만들어서 단순하고 직관적으로 동작하게함.
public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final long timeInterval = 1000;
		Runnable runnable = new Runnable() {

		public void run() {
		while (true) {
		// ------- code for task to run
		System.out.println("Hello !!");
		// ------- ends here
		try {
		Thread.sleep(timeInterval);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}
		}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

}

package Timer;

import java.util.Timer;
import java.util.TimerTask;

public class Timer_TimerTask {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimerTask task = new TimerTask() {
			public void run() {
			// task to run goes here
			System.out.println("Hello !!!");
			}
			};

			Timer timer = new Timer();
			long delay = 0;
			long intevalPeriod = 1 * 1000;
			// schedules the task to be run in an interval
			timer.scheduleAtFixedRate(task, delay,
			intevalPeriod);
	}

}

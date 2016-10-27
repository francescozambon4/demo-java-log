package demo;

import com.jcabi.aspects.Loggable;

public class DummyBean {

	@Loggable
	public void talk() {
		
		int time = 1000;
		
		System.out.println("i will say something i will wait " + time + " second(ms)");
		System.out.println("i like make things and see people");
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

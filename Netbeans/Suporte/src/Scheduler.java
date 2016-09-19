
public class Scheduler extends Thread {
	private CircularList queue;
	private int timeSlice;
	private static final int DEFAULT_TIME_SLICE = 1000;
	
	public Scheduler () {
		timeSlice = DEFAULT_TIME_SLICE;
		queue = new CircularList();
	}
	
	public void addThread(Thread t) {
		t.setPriority(2);
		queue.addItem(t);
	}
	
	private void schedulerSleep() {
		try {
			Thread.sleep(timeSlice);			
		} catch (InterruptedException e) {
			
		}
	}
	
	public void run() {
		Thread current;
		
		this.setPriority(6);
		
		while(true){
			// obtem o próximo thread
			current = (Thread) queue.getNext();
			if ((current!=null)&&(current.isAlive())) {
				current.setPriority(4);
				schedulerSleep();
				current.setPriority(2);
			}
			
		}
	}

}


public class SemaphoreDummy {
	private int value;
	
	public SemaphoreDummy() {
		value = 0;
	}
	
	public SemaphoreDummy(int v) {
		value = v;
	}
	
	public synchronized void P() { // acquire ?
		
		while (value <=0) {
			try {
				wait();
			} catch(InterruptedException e) { }
		}
		
		value--;
	}
	
	public synchronized void V() { // release ??
		++value;
		notify();
	}
}

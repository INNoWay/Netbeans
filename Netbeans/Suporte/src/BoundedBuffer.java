import java.util.*;
import java.util.concurrent.Semaphore; // Solução com Semáforo

public class BoundedBuffer {
	public static final int NAP_TIME = 5;
	private static final int BUFFER_SIZE = 5;
	private volatile int count;
	private int in;
	private int out;
	private Object[] buffer;
	
	private Semaphore mutex;
	private Semaphore empty;
	private Semaphore full;	
	
	public BoundedBuffer () {
		//buffer esta inicialmente vazio
		count = 0;
		in = 0;
		out = 0;
		
		buffer = new Object[BUFFER_SIZE];
		
		mutex = new Semaphore(1);
		empty = new Semaphore(BUFFER_SIZE);
		full = new Semaphore(0);
	}
	
	// o produtor e o consumidor chamam este método para cochilar
	public static void napping() {
		int sleepTime = (int) (NAP_TIME * Math.random());
		try {
			Thread.sleep(sleepTime*1000);
		} catch (InterruptedException e) { }
	}
	
	public void enter (Object item) throws Exception {
		empty.acquire();
		mutex.acquire(1);
		
		while (count == BUFFER_SIZE);
		
		++count;
		buffer[in] = item;
		in = (in+1) % BUFFER_SIZE;
		
		if (count == BUFFER_SIZE)
			System.out.println("Producer Entered" + item + "Buffer FULL");
		else
			System.out.println("Producer Entered" + item + "Buffer Size = " + count);
		
		mutex.release(1);
		full.release();
	}
	
	public Object remove () throws Exception {
		Object item;
		
		full.acquire();
		mutex.acquire(1);
		
		
		while (count ==0);
		
		--count;
		item = buffer[out];
		out = (out + 1) % BUFFER_SIZE;
		
		if (count == 0)
			System.out.println("Consumer Consumed" + item + "Buffer EMPTY");
		else
			System.out.println("Consumer COnsumed" + item + "Buffer Size = " + count);
				
		mutex.release(1);
		empty.release();
		
		return item;
	}
	
}

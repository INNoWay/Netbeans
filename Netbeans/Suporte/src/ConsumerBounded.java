import java.util.Date;

public class ConsumerBounded extends Thread {
	
	public ConsumerBounded (BoundedBuffer b) {
		buffer = b;
	}
	
	public void run () {
		Date message = null;
		
		while (true) {
			BoundedBuffer.napping();
			
			
			try {
				message = (Date) buffer.remove();
			} catch (Exception e) { }
			
			if (message != null)
				System.out.println("Consumer consumed" + message);
		}
	}
	
	private BoundedBuffer buffer;

}


import java.util.Date;
import java.util.*;

public class ProducerBounded extends Thread {
	
	public ProducerBounded (BoundedBuffer b) {
		buffer = b;
	}
	
	public void run () {
		Date message;
		
		while (true) {
			BoundedBuffer.napping();
			// produz um item e insere o item no buffer
			message = new Date();
			System.out.println("ProducerBounded produced " + message);
			try {
				buffer.enter(message);
			} catch (Exception e) { }			
		}
	}
	
	private BoundedBuffer buffer;

}


public class BoundedBufferServer {
	
	public static void main(String args[]) {		
		BoundedBuffer server = new BoundedBuffer();
		
		// cria os threads consumidor e produtor
		
		ProducerBounded producerThread = new ProducerBounded(server);
		ConsumerBounded consumerThread = new ConsumerBounded(server);
		
		producerThread.start();
		consumerThread.start();	
		
	}
	
	
}

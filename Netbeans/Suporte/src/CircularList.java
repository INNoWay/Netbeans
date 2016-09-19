
public class CircularList {

	private static final int BUFFER_SIZE = 5;
	private volatile int count;
	private int in;
	private int out;
	private Object[] buffer;
	
	public CircularList() {
		//buffer esta inicialmente vazio
		count = 0;
		in = 0;
		out = 0;
		
		buffer = new Object[BUFFER_SIZE];
	}
	
	public void addItem (Object item) {
		while (count == BUFFER_SIZE);
		
		++count;
		buffer[in] = item;
		in = (in+1) % BUFFER_SIZE;
	}
	
	public Object getNext () {
		Object item;
		
		while (count ==0);
		
		--count;
		item = buffer[out];
		out = (out + 1) % BUFFER_SIZE;
						
		return item;
	}
}

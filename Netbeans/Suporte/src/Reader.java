
public class Reader extends Thread {
	private Database server;
	private int readerNum;
	
	public Reader(int r, Database db) {
		readerNum = r;
		server = db;
	}
	
	public void run() {
		int c;
		
		while (true) {
			System.out.println("Reader " + readerNum + "is sleeping");
			
			Database.napping();
			System.out.println("Reader " + readerNum + "wants to be read");
			c = server.startRead();
			
			//voce ten acesso de leitura no banco de dados		
			System.out.println("Reader " + readerNum + "is reading. Count = "+c);
			Database.napping();
			
			c = server.endRead();
			System.out.println("Reader " + readerNum + "is done reading. Count = "+c);
			
		}
	}

}

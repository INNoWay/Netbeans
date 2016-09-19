
public class Writer {
	private Database server;
	private int writerNum;

	public Writer(int w, Database db) {
		writerNum = w;
		server = db;
	}
	
	public void run() {
		
		while (true) {
			System.out.println("Writer " + writerNum + "is sleeping");
			
			Database.napping();
			System.out.println("Writer " + writerNum + "wants to be write");
			server.startWrite();
			
			//voce ten acesso de escrita no banco de dados		
			System.out.println("Writer " + writerNum + "is wrinting.");
			Database.napping();
			
			server.endWrite();
			System.out.println("Writer " + writerNum + "is done reading.");
			
		}
	}
	
}

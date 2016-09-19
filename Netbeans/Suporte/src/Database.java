
public class Database {
	private static final int NAP_TIME = 5;
	
	private int readerCount;
	//flags para indicar se o banco de dados
	//esta sendo lido ou escrito
	private boolean dbReading;
	private boolean dbWriting;
	
	public Database() {
		readerCount = 0;
		dbReading = false;
		dbWriting = false;
	}
	
	//leitores-escritores chamam este metodo para cochilar
	public static void napping() {
		int sleepTime = (int) (NAP_TIME * Math.random());
		try {
			Thread.sleep(sleepTime*1000);
		} catch (InterruptedException e) { }
	}
	
	public synchronized int startRead() {
		while (dbWriting == true) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		
		++readerCount;
		
		//se sou o primeiro leitor, informe
		//todos os outros que o banco de dados esta sendo lido
		if (readerCount == 1) 
			dbReading = true;
		
		return readerCount;
	}
	
	public synchronized int endRead() {
		--readerCount;
		
		//se sou o ultimo leitor, informe todos os 
		//outros que o banco de dados nao esta mais sendo lido
		if (readerCount == 0)
			dbReading = false;
		
		notifyAll();
		
		return readerCount;
	}
	
	public synchronized void startWrite() {
		while (dbReading == true || dbWriting == true) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		
		//assin que não houver mais leitores-escritores
		//indicar que o banco de dados esta sendo gravado
		dbWriting = true;
	}
	
	public synchronized void endWrite() {
		dbWriting = false;
		
		notifyAll();
	}

}

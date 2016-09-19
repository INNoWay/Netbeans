
public class PhilosopherDead extends Thread {

	private String name;
	private int id;
	private TableDinner shared;
	
	static int state;
	static final int THINKING = 0;
	static final int HUNGRY = 0;
	static final int EATING = 0;
	public static final int NAP_TIME = 5;

	public PhilosopherDead (String n, int i, TableDinner s) {
		name = n;
		id = i;
		shared = s;
		
		state = THINKING;
	}
	
	public void run () {
		while (true) {
			state = HUNGRY;
			
			// pega pauzinho da esquerda
			while (!shared.chopStick(id));			
			System.out.println(name + " takes stick " + id);
			// pega pauzinho da direita
			while (!shared.chopStick((id+1)%5));
			System.out.println(name + " takes stick " + ((id+1)%5) );

			// eating 
			eating();
						
			// solta pauzinho da esquerda
			shared.releaseStick(id);						
			// pega pauzinho da direita
			shared.releaseStick((id+1)%5);
			System.out.println(name + " releases sticks ");
			
			thinking();
			
			
		}
	}

	public void eating() {
		// TODO Auto-generated method stub
		state = EATING;
		int eatingtime = (int) (NAP_TIME * Math.random());
		
		System.out.println(name + " eating for " + eatingtime + " seconds");
	
		try {
		
			Thread.sleep(eatingtime*1000);
	
		} catch (InterruptedException e) {		}
		
		state = THINKING;
	}

	public void thinking() {
		// TODO Auto-generated method stub

		int eatingtime = (int) (NAP_TIME * Math.random());
		
		System.out.println(name + " thinking for " + eatingtime + " seconds");
	
		try {
		
			Thread.sleep(eatingtime*1000);
	
		} catch (InterruptedException e) {		}
		
	}
}

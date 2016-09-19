
public abstract class Philosopher {
	static int state;
	static final int THINKING = 0;
	static final int HUNGRY = 0;
	static final int EATING = 0;
	public static final int NAP_TIME = 5;
	
	public Philosopher() {
		state = THINKING;
	}
	
	// eating abstract class
	public abstract void eating();
	public abstract void thinking();

}

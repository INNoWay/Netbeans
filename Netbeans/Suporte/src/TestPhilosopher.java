
public class TestPhilosopher {
	
	public static void main(String args[]) {
		TableDinner table = new TableDinner();
		
		PhilosopherDead one = new PhilosopherDead("Philosopher 0", 0, table);
		PhilosopherDead two = new PhilosopherDead("Philosopher 1", 1, table);
		PhilosopherDead three = new PhilosopherDead("Philosopher 2", 2, table);
		PhilosopherDead four = new PhilosopherDead("Philosopher 3", 3, table);
		PhilosopherDead five = new PhilosopherDead("Philosopher 4", 4, table);
		
		one.start();
		two.start();
		three.start();
		four.start();
		five.start();
	}

}


public class Dekker extends MutualExclusion {
	
	private volatile int turn;
	private volatile boolean[] flag = new boolean[2];
	
	public Dekker() {
		flag[0] = false;
		flag[1] = false;
		turn = TURN_0;
	}

	@Override
	public void enteringCriticalSection(int t) {
		// TODO Auto-generated method stub
		int other;
		
		other = 1 -t;		
		flag[t] = true;
		

		
		
		while (flag[other]==true) {
			if (turn==other) {
				flag[t] = false;
				while (turn == other)
					Thread.yield();
			   	flag[t] = true;				
			}
		}		
	}

	@Override
	public void leavingCriticalSection(int t) {
		// TODO Auto-generated method stub
		turn = 1 - t;
		flag[t] = false;
	}
	
	

}

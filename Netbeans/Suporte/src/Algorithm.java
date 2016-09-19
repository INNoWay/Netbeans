
public class Algorithm extends MutualExclusion {
	
	private volatile int turn;
	private volatile boolean[] flag = new boolean[2];
	
	public Algorithm() {
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
		turn = other;
		
		while ((flag[other]==true)&&(turn==other))
			Thread.yield();
		
	}

	@Override
	public void leavingCriticalSection(int t) {
		// TODO Auto-generated method stub
		flag[t] = false;
	}
	
	

}

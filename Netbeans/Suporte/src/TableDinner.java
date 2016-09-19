
public class TableDinner {
	static final boolean[] table = new boolean[5];
	
	public TableDinner() {
		for (int i = 0; i<5; i++)		
			table[i] = false;	
	}
	
	public boolean chopStick(int i) {
		if (table[i]== false) {
			table[i] = true;
			return true;
		} else return false;
	}
	
	public void releaseStick(int i) {
		table[i] = false;
	}
}

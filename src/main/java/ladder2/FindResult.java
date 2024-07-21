package ladder2;

import java.util.List;

public class FindResult {

	private List<Ladder2> completeLadder;
	private int location;
	
	public FindResult(List<Ladder2> completeLadder, int location) {
		this.completeLadder = completeLadder;
		this.location = location;
	}
	
	 public int move(int i, List<String> line) {
	        if (i > 0 && line.get(i - 1).equals("-----")) {
	            return i - 1;
	        }
	        if (i < line.size() - 1 && line.get(i).equals("-----")) {
	            return i + 1;
	        }
	        return i;
	    }

	    public int find() {
	        int currentPosition = location;
	        //System.out.println("current position: " + currentPosition);
	        for (Ladder2 ladder : completeLadder) {
	            currentPosition = move(currentPosition, ladder.getLadder());
	            //System.out.println("current position: " + currentPosition);
	        }
	        return currentPosition;
	    }
	    
}

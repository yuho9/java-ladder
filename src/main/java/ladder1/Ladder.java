package ladder1;

import java.util.List;
import java.util.Random;

public class Ladder {

	private int width;
	private int height;
	private List<String> ladder;
	private int[] randomArray;
	
	public Ladder(int width, int height) {
		this.width = width;
        this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int w) {
		this.width = w;
	}
	public void setHeight(int h) {
		this.height = h; 
	}
	
	public void makeRandom(int i) {
		Random random = new Random();
		if(randomArray[i-1]==0 || i==0) {
			randomArray[i] = random.nextInt(2);
		}
		if(randomArray[i-1]==1) {
			randomArray[i] = 0;
		}
	}
	
	public String change(int i) {
		if(randomArray[i]==0) {
			return "     ";
		}
		return "-----";
	}
	
	public void makeLadder() {
		for(int i=0;i<width-1;i++) {
			makeRandom(i);
			ladder.add(change(i));
		}
	}

	
}

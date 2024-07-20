package ladder1;

import java.util.List;

public class Ladder {

	private int width;
	private int height;
	private List<String> ladder;
	private List<List<String>> completeLadder;
	
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
	
}

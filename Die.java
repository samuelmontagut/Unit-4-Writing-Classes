import java.lang.Math;

public class Die {
	
	private int num;
	private int sides;
	
	public Die(int s) {
		sides = s;
	}
	
	public void roll() {
		num = (int) (Math.random() * (sides) + 1);
	}
	
	public int getNumber() {
		return num;
	}
	
	public String toString() {
		return "Number of Sides = " + sides + "\nNumber on top face: " + num;
	}
	
}

import java.lang.Math;


public class CoinFlipper {
	
	int heads;
	int tails;
	

	public void flipper() {
		for (int i = 0; i < 10; i++) {
			int rand = (int) (Math.random() * 2);
			if (rand == 1) {
				heads = +1;
				System.out.println("Heads!");
			}
			else {
				tails = +1;
				System.out.println("Tails!");
			}
		}
		
		int percent = (heads * 100/(tails + heads));
		System.out.println("The percent of heads is: " + percent);
	}
	

}

public class DieClient {
	
	public static void main(String[] args) {
		Die die1 = new Die(6);
		Die die2 = new Die(6);
		int rolls = 0;
		int averagerolls = 0;
		
		for (int i = 0; i < 100; i++){
			boolean doubles = false;
			int spins = 0;
			while (!doubles) {
				
				die1.roll();
				die2.roll();
				System.out.println("The first die landed on: " + die1.getNumber());
				System.out.println("The second die landed on: " + die2.getNumber());
				System.out.println("The sum of the dice is " + (die1.getNumber() + die2.getNumber() ));
				System.out.println("");
				spins = spins + 1;
				if(die1.getNumber() == die2.getNumber()) {
					doubles = true;
					System.out.println("It took " + spins + " rolls to get doubles!\n");
				}
				
			}
			rolls = rolls + spins;
			
		}
		averagerolls = rolls/100;
		System.out.println("\nIt took an average of " + averagerolls + " to get doubles.");
		
	}

}

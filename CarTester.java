
public class CarTester {

	public static void main(String[] args) {
		Car Prius = new Car("Prius", "toyota", 64, 25);
		Car henny = new Car("Agera R", "Koenigsegg Automotive AB", 19.2, 80);
		Car rav = new Car("Rav4", "Toyota", 27, 40);
		System.out.println(rav);
		
		henny.setEfficiency(56);
		rav.setModel("Rav4 Hybrid");
		Prius.setEfficiency(98);
		System.out.println(Prius.getEfficiency());
		henny.setMake("koenigsegg");
		System.out.println(henny.getMake());
		
		System.out.println(rav);
	
	}

}

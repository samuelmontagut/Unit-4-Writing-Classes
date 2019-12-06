
public class Car {

	private String model;
	private String make;
	private double efficiency;
	private double gas;
	
	public Car(String mod, String maker, double mpg, double tank) {
		model = mod;
		make = maker;
		efficiency = mpg;
		gas = tank;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getMake() {
		return make;
	}
	public double getEfficiency() {
		return efficiency;
	}
	public double getGas() {
		return gas;
	}
	public void setModel(String m) {
		model = m;
	}
	public void setMake(String m) {
		make = m;
	}
	public void setEfficiency(double e) {
		efficiency = e;
	}
	public void setGas(double g) {
		gas = g;
	}
	public String toString() {
		return "model: " + model + "\nmake: " + make + "\nefficiency: " + efficiency + " mpg" + "\nFuel in tank: " + gas + " gallons\n";
	}
}

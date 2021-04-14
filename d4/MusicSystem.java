package d4;

public class MusicSystem {
	private String manufacturer;
	private String modelNumber;
	private int cost;
	private boolean power;

	public MusicSystem() {
		// TODO Auto-generated constructor stub
		super();
	}

	public MusicSystem(String manufacturer, String modelNumber, int cost, boolean power) {
		super();
		this.manufacturer = manufacturer;
		this.modelNumber = modelNumber;
		this.cost = cost;
		this.power = power;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void printMsDetails() {
		System.out.println("Manufacturer: " + manufacturer +
				"\nModel number: " + modelNumber +
				"\nCost: " + cost +
				"\nPower: " + power);
	}

}


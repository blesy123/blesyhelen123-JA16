package d4;
import d4.Car;
public class Demo {
	
	private Car[] cars = new Car[5];
	private int count = 0;
	
	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void insertCar(Car car) {
		cars[count] = new Car();
		cars[count].setCarName(car.getCarName());
		cars[count].setCarPower(car.getCarPower());
		cars[count].setCost(car.getCost());
		cars[count].setEngine(car.getEngine());
		count++;
	}
	
	public Car searchCar(int searchNumber) {
		return cars[searchNumber];
	}

}


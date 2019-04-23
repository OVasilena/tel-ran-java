package car_set;

public class Car {
	private String autoManufacturer;
	private String model;
	private double maxSpeed;
	private double power;
	private int capacity;
	


public Car(){
	
}
public Car(String autoManufacturer, String model, double maxSpeed, double power, int capacity){
	this.autoManufacturer=autoManufacturer;
	this.model=model;
	this.capacity=capacity;
	this.maxSpeed=maxSpeed;
	this.power=power;
}
public String getAutoManufacturer() {
	return autoManufacturer;
}
public void setAutoManufacturer(String autoManufacturer) {
	this.autoManufacturer = autoManufacturer;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getMaxSpeed() {
	return maxSpeed;
}
public void setMaxSpeed(double maxSpeed) {
	this.maxSpeed = maxSpeed;
}
public double getPower() {
	return power;
}
public void setPower(double power) {
	this.power = power;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public String toString() {
	return "Car [autoManufacturer=" + autoManufacturer + ", model=" + model
			+ ", maxSpeed=" + maxSpeed + ", power=" + power + ", capacity="
			+ capacity + "]";
}
public void display(){
	System.out.println("autoManufacturer" + autoManufacturer);
	System.out.println("Model" + model);
	System.out.println("Power" + power);
	System.out.println("Max speed" + maxSpeed);
	System.out.println("Capacity is " + capacity);
	System.out.println("_________________________");
	
}
public static void printArray(Car arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
}

package lesson007m;

public class Motorcycle extends GroundVehicle {
	private int maxSpeed;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Motorcycle(int passengers, int maxSpeed) {
		super(passengers);
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void drive() {
		System.out.println("Ground Vehicle the motorcycle has a maximum speed of: " + getMaxSpeed()
				+ ". Passenger capacity: " + super.getPassengers());
	}

}
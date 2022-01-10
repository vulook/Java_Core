package lesson006g;

public class Developer extends Employee {

	private String position;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Developer(String name, int age, double salary, String position) {
		super(name, age, salary);
		this.position = position;
	}

	@Override
	public String toString() {
		return super.toString() + ", Position: " + position;
	}

	@Override
	public String report() {
		return String.format("Name: %s, Age: %d yers, Position: %s, Salary: \u20B4 %.2f.", getName(),
				getAge(), getPosition(), getSalary());
	}

}
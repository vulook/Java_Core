package lesson006g;

public class Employee {

	private String name;
	private int age;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
	}

	public String report() {
		return String.format("Name: %s, Age: %d yers, Salary: \u20B4 %.2f.", getName(), getAge(), getSalary());
	}

}

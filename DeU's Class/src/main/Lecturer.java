package main;

public class Lecturer extends People{
	
	private Integer salary;

	public Lecturer(String name, Integer age, String role, Integer salary) {
		super(name, age, role);
		
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}

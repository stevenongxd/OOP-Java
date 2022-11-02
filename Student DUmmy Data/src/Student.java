
public class Student {
	
	private final String name;
	private final Integer age;
	private Double gpa;
	
	public Student(String name, Integer age, Double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	
	void display() {
		System.out.println("Your name is " + getName());
		System.out.println("Your age is " + getAge());
		System.out.println("Your GPA is " + getGpa() + " / 4.0");
	}

}

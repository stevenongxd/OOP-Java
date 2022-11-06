package main;

public class Student extends People{
	
	private Integer gpa;
	
	public Student(String name, Integer age, String role, Integer gpa) {
		super(name, age, role);
		
	}

	public Integer getGpa() {
		return gpa;
	}

	public void setGpa(Integer gpa) {
		this.gpa = gpa;
	}
	
	public void gpaCount() {
		System.out.println("My GPA is " + this.getGpa());
	}

}

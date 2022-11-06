package main;

public abstract class People {
	
	private String name;
	private Integer age;
	private String role;
	
	public People(String name, Integer age, String role) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String type) {
		this.role = type;
	}
}

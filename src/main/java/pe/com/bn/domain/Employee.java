package pe.com.bn.domain;

public class Employee {

	private String firstname;
	private Integer age;

	public Employee(String firstname, Integer age) {
		super();
		this.firstname = firstname;
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}

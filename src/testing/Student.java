package testing;

public class Student extends Person {
	
	private String matricNo;

	public String getMatricNo() {
		return matricNo;
	}

	public void setMatricNo(String matricNo) {
		this.matricNo = matricNo;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, String matricNo) {
		setName(name);
		setAge(age);
		setMatricNo(matricNo);		
	}

}

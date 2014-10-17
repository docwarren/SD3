package testing;

public class Person {
	private String name;
	int age;
	
	public Person(String name, int age){
		setAge(age);
		setName(name);
	}
	
	public Person(){
		
	}
	
	public void happyBirthday(){
		this.age++;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

package decorator;

public abstract class Car {
	String description = "";
	
	public Car(){
		
	}
	
	public abstract double cost();
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}

package coffee;

public abstract class Coffee {
	String description = "";
	
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Coffee(){}
	public abstract double cost();
}

package commandPattern;

public abstract class FoodOrder {
	public Chef chef;
	
	public abstract void cook();
	
	public void setChef(Chef chef){
		this.chef = chef;
	}
}

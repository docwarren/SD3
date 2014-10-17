
public class Ball {
	private String colour;
	private int weight;
	
	public Ball(){
		this.weight = 1;
	}
	public Ball(int weight, String colour) {
		this.weight = weight;
		this.colour = colour;
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return "Ball [colour=" + colour + ", weight=" + weight + "]";
	}
}

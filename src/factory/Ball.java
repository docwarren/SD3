package factory;

public abstract class Ball {
	String colour;
	
	public Ball(){
		
	}
	
	public void announceWinner(){
		System.out.println("Err. " + this.colour + " fook! you won!");
	}
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}

package factory;

public class BallGame {
	BallFactory ballBoy;
	
	public BallGame(){
		setBallBoy(new BallFactory());
	}
	
	public void setBallBoy(BallFactory ballBoy) {
		this.ballBoy = ballBoy;
	}
	
	public void playgame(String colour){
		Ball b;
		b = this.ballBoy.createBall(colour);
		b.announceWinner();
	}
}

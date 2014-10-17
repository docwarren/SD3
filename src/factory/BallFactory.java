package factory;

public class BallFactory {
	public Ball createBall(String colour){
		Ball ball = null;
		if(colour.equalsIgnoreCase("white")) ball = new WhiteBall();
		if(colour.equalsIgnoreCase("black")) ball = new BlackBall();
		if(colour.equalsIgnoreCase("red")) ball = new RedBall();
		return ball;
	}
}

package Politics;

public class GreenPolitician extends Politician{
	public GreenPolitician(){
		setBelief(new GreenBelief());
		setLives(new GreenLife());
	}
}

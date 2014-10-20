package Politics;

public class LibPolitician extends Politician{
	public LibPolitician(){
		setBelief(new LibBelief());
		setLives(new LibLife());
	}
}

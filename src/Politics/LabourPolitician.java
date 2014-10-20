package Politics;

public class LabourPolitician extends Politician{
	public LabourPolitician(){
		setBelief(new LabourBelief());
		setLives(new LabourLife());
	}
}

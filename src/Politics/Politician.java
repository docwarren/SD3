package Politics;

public class Politician{
	private String name;
	private String party;
	protected Lives lives;
	protected Believes belief;
	
	public Lives getLives() {
		return this.lives;
	}

	public void setLives(Lives lives) {
		this.lives = lives;
	}

	public Believes getBelief() {
		return this.belief;
	}

	public void setBelief(Believes belief) {
		this.belief = belief;
	}

	public Politician(){
		
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return this.party;
	}

	public void setParty(String party) {
		this.party = party;
	}
	
	@SuppressWarnings("unused")
	public String toString(){
		if(this == null) return "";
		return this.name + " of " + this.party + " party,  lives in a " + this.lives.livesIn() +  " and believes that " + this.belief.stateBelief();
	}	
}

package commandPrac;

public abstract class Issue {
	protected Technician techie;
	private int priority;
	
	public int getPriority() {
		return this.priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public abstract void fixIssue();
	
	public void setTechnician(Technician t){
		this.techie = t;
	}
}

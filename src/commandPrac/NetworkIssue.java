package commandPrac;

public class NetworkIssue extends Issue {
	
	public NetworkIssue(Technician t) {
		// TODO Auto-generated constructor stub
		setPriority(3);
		setTechnician(t);
	}

	@Override
	public void fixIssue() {
		// TODO Auto-generated method stub
		this.techie.fixIssue("network issue");
	}

}

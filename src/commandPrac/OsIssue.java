package commandPrac;

public class OsIssue extends Issue {

	public OsIssue(Technician t) {
		// TODO Auto-generated constructor stub
		setPriority(1);
		setTechnician(t);
	}

	@Override
	public void fixIssue() {
		// TODO Auto-generated method stub
		this.techie.fixIssue("OS issue.");
	}

}

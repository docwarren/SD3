package commandPrac;

public class DatabaseIssue extends Issue {

	public DatabaseIssue(Technician t) {
		// TODO Auto-generated constructor stub
		setTechnician(t);
		setPriority(5);
	}

	@Override
	public void fixIssue() {
		// TODO Auto-generated method stub
		this.techie.fixIssue("database issue");
	}

}

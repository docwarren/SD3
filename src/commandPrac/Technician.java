package commandPrac;

public class Technician {
	private String name;
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Technician(String name){
		this.name = name;
	}
	public void fixIssue(String issue){
		System.out.println( this.name + " is fixing issue: " + issue);
	}
}

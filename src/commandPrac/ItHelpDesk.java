package commandPrac;

public class ItHelpDesk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		helpDesk hd = new helpDesk();
		Technician mike = new Technician("Mike");
		Technician john = new Technician("John");
		
		hd.addIssue(new NetworkIssue(mike));
		hd.addIssue(new NetworkIssue(john));
		hd.addIssue(new NetworkIssue(mike));
		hd.addIssue(new DatabaseIssue(mike));
		hd.addIssue(new DatabaseIssue(john));
		hd.addIssue(new OsIssue(john));
		hd.addIssue(new DatabaseIssue(mike));
		hd.addIssue(new NetworkIssue(mike));
		hd.addIssue(new OsIssue(john));
		hd.addIssue(new DatabaseIssue(john));
		
		hd.assignIssues();
	}

}

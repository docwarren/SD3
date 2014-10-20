package commandPrac;

import java.util.ArrayList;
import java.util.Collections;

public class helpDesk {
	private ArrayList<Issue> issues = new ArrayList<Issue>();

	public ArrayList<Issue> getIssues() {
		return this.issues;
	}

	public void setIssues(ArrayList<Issue> issues) {
		this.issues = issues;
	}
	
	public void addIssue(Issue i){
		this.issues.add(i); 
	}
	
	public void sortIssues(){
		Collections.sort(this.issues, new IssueComparator());
	}
	
	public void assignIssues(){
		sortIssues();
		for(Issue i: this.issues){
			i.fixIssue();
		}
	}
}

package Politics;
import java.util.*;

import javax.swing.JOptionPane;

public class Politicians {
	private ArrayList<Politician> pigs;
	
	public Politicians(){
		this.pigs = new ArrayList<Politician>();
	}

	public ArrayList<Politician> getPigs() {
		return this.pigs;
	}

	public void setPigs(ArrayList<Politician> pigs) {
		this.pigs = pigs;
	}
	
	public void addPig(Politician p){
		this.pigs.add(p);
	}
	
	public void removePig(Politician p){
		this.pigs.remove(p);
	}
	
	public String toString(){
		String result = "Politicians: \n";
		for(Politician pig: this.pigs){
			result += pig.toString() + "\n";
		}
		return result;
	}
	
	public void selectWindow() {
		String opts = "";
		int count = 0;
		for(Politician pig: this.pigs){
			opts += count + ": " + pig.getName() + ": " + pig.getParty() + "\n";
			count++;
		}
		String selected = JOptionPane.showInputDialog(null, opts);
		int sel = Integer.parseInt(selected);
		Politician px = this.pigs.get(sel);
		editWindow(px);
	}

	public void addWindow(){
		Politician p = null;
		String name = JOptionPane.showInputDialog(null, "Enter Name");
		String party = JOptionPane.showInputDialog(null, "0: Conservatives\n1: Labour\n2: Lib Dem\n3: Green");
		int part = Integer.parseInt(party);
		if(part == 0) {
			p = new Conservative();
			p.setName(name);
			p.setParty("Conservatives");
			p = new ConservativePolicy(p);
		}
		if(part == 1) {
			p = new LabourPolitician();
			p.setName(name);
			p.setParty("Labour");
			p = new LabourPolicy(p);
		}
		if(part == 2) {
			p = new LibPolitician();
			p.setName(name);
			p.setParty("Lib Dem");
			p = new LiberalPolicy(p);
		}
		if(part == 3) {
			p = new GreenPolitician();
			p.setName(name);
			p.setParty("Green");
			p = new GreenPolicy(p);
		}
		if(p == null) showMain();
		this.pigs.add(p);
		showMain();
	}
	
	public void editWindow(Politician p){
		selectParty(p);
		selectHouse(p);
		selectBelief(p);
		showMain();
	}

	private void selectBelief(Politician p) {
		// TODO Auto-generated method stub
		String party = JOptionPane.showInputDialog(null, "0: fuck the poor\n1: tax the poor\n2: everyone else is stupid\n3: save the trees");
		int part = Integer.parseInt(party);
		if(part == 0) {
			p.setBelief(new ConservativeBelief());
		}
		if(part == 1) {
			p.setBelief(new LabourBelief());
		}
		if(part == 2) {
			p.setBelief(new LibBelief());
		}
		if(part == 3) {
			p.setBelief(new GreenBelief());
		}
	}

	private void selectHouse(Politician p) {
		// TODO Auto-generated method stub
		String party = JOptionPane.showInputDialog(null, "0: huge house\n1: mud hut\n2: castle\n3: tree");
		int part = Integer.parseInt(party);
		if(part == 0) {
			p.setLives(new ConservativeLife());
		}
		if(part == 1) {
			p.setLives(new LabourLife());
		}
		if(part == 2) {
			p.setLives(new LibLife());
		}
		if(part == 3) {
			p.setLives(new GreenLife());
		}
	}

	private void selectParty(Politician p) {
		// TODO Auto-generated method stub
		String party = JOptionPane.showInputDialog(null, "0: Conservatives\n1: Labour\n2: Lib Dem\n3: Green");
		int part = Integer.parseInt(party);
		if(part == 0) {
			p.setParty("Conservative Party");
		}
		if(part == 1) {
			p.setParty("Labour Party");
		}
		if(part == 2) {
			p.setParty("Lib Dem Party");
		}
		if(part == 3) {
			p.setParty("Green Party");
		}
	}

	public void showMain() {
		// TODO Auto-generated method stub
		String[] options = {"Add politician", "Edit Politician", "Show Politicians"};
		String opts = "";
		for(int i = 0; i < options.length; i++){
			opts += i + ": " + options[i] + "\n";
		}
		String selected = JOptionPane.showInputDialog(null, opts);
		
		if(selected.equals("0")) addWindow();
		if(selected.equals("1")) selectWindow();
		if(selected.equals("2")) {
			JOptionPane.showMessageDialog(null, toString());
			showMain();
		}
	}
}

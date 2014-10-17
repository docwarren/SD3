import javax.swing.JOptionPane;

public class Student implements Observer, Display{

	String name;
	String updates;
		
	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.updates = "";
	}
	

	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUpdates() {
		return updates;
	}


	public void setUpdates(String updates) {
		this.updates = updates;
	}


	@Override
	public void update(String theNews) {
		// TODO Auto-generated method stub
		this.updates += theNews + "\n\t";
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		String news = this.name + ":\n\t" + this.updates;
		JOptionPane.showMessageDialog(null, news);
	}
}

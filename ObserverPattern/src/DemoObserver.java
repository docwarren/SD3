
public class DemoObserver {

	public DemoObserver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lecturer john = new Lecturer();
		for(String name: new String[]{"Tim", "Calum", "Andrew"}){
			Student x = new Student(name);
			john.registerObserver(x);
		}
		
		john.setNews("Free Beer on Friday!");
		john.notifyObservers();
	}

}

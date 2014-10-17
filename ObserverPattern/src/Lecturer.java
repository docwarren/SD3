import java.util.*;

public class Lecturer implements Observeable{

	private ArrayList<Student> students;
	private String news;
	
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public Lecturer() {
		// TODO Auto-generated constructor stub
		students = new ArrayList<Student>();
	}

	@Override
	public void registerObserver(Student a) {
		// TODO Auto-generated method stub
		this.students.add(a);
	}

	@Override
	public void removeObserver(Student a) {
		// TODO Auto-generated method stub
		this.students.remove(a);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Student a: this.students){
			a.update(this.news);
		}
	}

}

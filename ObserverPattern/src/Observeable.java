
public interface Observeable {
	public void registerObserver(Student a);
	public void removeObserver(Student a);
	public void notifyObservers();
}

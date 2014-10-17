import javax.swing.JOptionPane;


public class KylieException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString(){
		return "There can be only one Kylie!";
	}
	
	public void display(){
		JOptionPane.showMessageDialog(null, this.toString());
	}
}

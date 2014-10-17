
public class Kylie {
	static Kylie uniqueInstance;
	
	private Kylie(){
		
	}
	
	public static synchronized Kylie getInstance() throws KylieException{
		if( uniqueInstance == null){
			uniqueInstance = new Kylie();
			return uniqueInstance;
		}
		else{
			return uniqueInstance;
		}
	}
}

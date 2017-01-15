package biblio.iu;
import java.util.Vector;
import biblio.om.Bibliotheque;

public class Gestionnaire {
	
	private Vector tampon;
	private Bibliotheque _biblio;
	/**
	 * Method Gestionnaire
	 *
	 *
	 */
	public Gestionnaire() {
		// TODO: Add your code here
	}
	
	public static void main(String[] args) {
		Gestionnaire gest = new Gestionnaire();
		System.out.println("\n==== SCENARIO 100 ====\n");
	    Vector tampon = new Vector();
	    Bibliotheque _biblio = new Bibliotheque("A7");
		gest.scenario1();
		//System.out.println("\n==== SCENARIO 2 ====\n");
		//gest.scenario2();
		
		
		
	}
	
	
	
	private void scenario1() {
		
	}
	
	private void scenario2() {
		
	}
	
}

package biblio.iu;
import java.util.Vector;
import biblio.om.Bibliotheque;
import biblio.om.Document;
import biblio.om.Livre;

public class Gestionnaire {
	
	private Vector tampon;
	private Bibliotheque _biblio;
	private static int numberOfDocuments = 0;
	private static Document documents[] = new Document[6];
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
		gest.scenario1();

		
		
		
		//gest.scenario2();
		
		
		
	}
	
	
	
	private void scenario1() {
		System.out.println("\n==== SCENARIO 1 ====\n");
		// Gestionnaire.numberOfDocuments = _biblio.getNumberOfDocuments();
	    //System.out.println(Integer.toString(numberOfDocuments));
	    Vector tampon = new Vector();
	    Bibliotheque _biblio = new Bibliotheque("A7");
	   
	   
	    _biblio.addDocument(new Livre("Java 1.5 ",786,"Laura Lemay","SM"));
	  
	  
	    Gestionnaire.documents = _biblio.getDocuments();
	    System.out.println(Gestionnaire.documents[0].toString());
	}
	
	private void scenario2() {
		//System.out.println("\n==== SCENARIO 2 ====\n");
		
	}
	
}

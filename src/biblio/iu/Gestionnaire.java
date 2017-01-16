package biblio.iu;
import java.util.Vector;
import java.util.Collections;

import biblio.om.Bibliotheque;
import biblio.om.Document;
import biblio.om.Livre;
import biblio.om.Periodique;
import biblio.om.Parametres;

public class Gestionnaire {
	
	private Vector tampon;
	private Bibliotheque _biblio;
	private static int numberOfDocuments = 0;
	private static Document documents[] = new Document[Parametres._biblioCapacity];
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

		
		
		
		gest.scenario2();
		
		
		
	}
	
	
	
	private void scenario1() {
		System.out.println("\n==== SCENARIO 1 ====\n");
		System.out.println("=== Creation des documents et stockage dans un Vector ===");
		// Gestionnaire.numberOfDocuments = _biblio.getNumberOfDocuments();
	    //System.out.println(Integer.toString(numberOfDocuments));
	    this.tampon = new Vector();
	    Livre l1,l2,l3;
	    Periodique p1,p2,p3,p4,p5,p6;
	    
	    l1 =  new Livre("Java 1.5 ",786,"Laura Lemay","SM");
	    l2 = new Livre("Les Particule Elémentaires",388,"Michel Houellebecq","Flammarion");
	    l3 = new Livre("L'alchimiste",189,"Paulo Coelho","Poche");
	    
	    this.tampon.addElement(l1);
	    this.tampon.addElement(l2);
	    this.tampon.addElement(l3);
	    
	    p1 = new Periodique("Le Monde 2",150,Parametres.bimensuel);
	    p2 = new Periodique("MSDN Magazine #1",140,Parametres.mensuel);
	    p3 = new Periodique("MSDN Magazine #2",140,Parametres.mensuel);
	    p4 = new Periodique("MSDN Magazine #3",140,Parametres.mensuel);
	    p5 = new Periodique("MSDN Magazine #4",140,Parametres.mensuel);
	    p6 = new Periodique("MSDN Magazine #5",140,Parametres.mensuel);
	    
	    this.tampon.addElement(p1);
	    this.tampon.addElement(p2);
	    this.tampon.addElement(p3);
	    this.tampon.addElement(p4);
	    this.tampon.addElement(p5);
	    this.tampon.addElement(p6);
	    
	    System.out.println("nombre de documents crées : " + Integer.toString(this.tampon.size()) + "\n");
	    
	    for(int i = 0; i <= this.tampon.size()-1; i++)
		{
  			System.out.println(this.tampon.elementAt(i)+ "\n");
		}
	   
	  
	}
	
	private void scenario2() {
			System.out.println("\n\n\n==== SCENARIO 2 ====\n");
			this._biblio = new Bibliotheque("Bibliothèque Locale");
			
			System.out.println("---> nom : " + this._biblio.getNom());
			
			
			
		
			System.out.println("---> ajout des documents à la bibliotheque dans l'ordre inverse de Vector");
			
			Collections.reverse(this.tampon); 	// On renverse le Vector
			for(int i = 0; i <= this.tampon.size()-1; i++)
		{
  			this._biblio.addDocument((Document)this.tampon.elementAt(i));
		}
		
			System.out.println("---> liberation du vector");
			this.tampon.removeAllElements();
			
			System.out.println("==== Affichage du contenu de la Bibliotheque ====\n");
			
	
	    
	   	   Gestionnaire.documents = this._biblio.getDocuments();
	   	   
	   	   	for(int i =1; i <= Gestionnaire.documents.length -1; i++)
		{
			//System.out.println("---> Inventaire n°" + Integer.toString(Gestionnaire.documents[i]._numInv);
			System.out.println("---> Inventaire n°" + Integer.toString(Parametres._startIndexForInventory + this._biblio.getInventoryNb(Gestionnaire.documents[i])));
  			System.out.println(Gestionnaire.documents[i].toString2() + "\n");
		}
	   // System.out.println(Gestionnaire.documents[0].toString());
		//System.out.println("\n==== SCENARIO 2 ====\n");
		 //
		
	}
	
}

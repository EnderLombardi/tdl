package biblio.om;


public class Bibliotheque {
	
	private String _nom = "";
	private int _nDocuments = 0;
	private Document[] documents = {}; // peut-être qu'il faut écrire Document documents[] à la place; à voir au moment de la compilation
	
	
	public Bibliotheque(String nom) {
		System.out.println(nom);
		this._nom = nom;
	}
	
	public int getNumberOfDocuments() {
		return(_nDocuments);
	}
	
	public String getNom() {
		return(_nom);
	}
	
	public void setNom(String nom) {
		this._nom = nom;
	}
	
	public Document[] getDocuments() {
		return(documents);
	}
	
	public void addDocument(Document document) {
		documents[_nDocuments] = document;
	_nDocuments ++;		
	}
	
	public int getInventoryNb(Document document){
		boolean found = false;
		int i = 0;
		int inventoryNb = 0;
		while ( found == false && i <= documents.length)  {
			if( documents[i].equals(document) ) {
				found = true;
				inventoryNb = i;
			}
			else {
				continue;
			}
			i++;
		}
		if (found == true) {
			return(inventoryNb);
		}
		else{
			return(-1); // insérer une exception
		}
	}
	
				
}

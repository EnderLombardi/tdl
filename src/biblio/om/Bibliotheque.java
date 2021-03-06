package biblio.om;


public class Bibliotheque {
	
	private String _nom = "";
	private int _nDocuments = 0;
	//private Document[] documents = {}; // peut-�tre qu'il faut �crire Document documents[] � la place; � voir au moment de la compilation
	//Document documents[] = {};
	Document documents[] = new Document[Parametres._biblioCapacity];
	
	
	public Bibliotheque(String nom) {
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
		while ( found == false && i <= documents.length-1)  {
			if( this.documents[i].equals(document) ) {
				found = true;
				inventoryNb = i;
			}
			i++;
		}
		if (found == true) {
			return(inventoryNb);
		}
		else{
			return(-1); // ins�rer une exception
		}
	}
	
				
}

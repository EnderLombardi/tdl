package biblio.om;


public class Document {
	private static int docTotal = 0;
	private int _numInv = 0;
	protected  String _titre;
	protected int _pages;
//	private Date _creationDate;
	
	public Document(String titre, int pages) {
		this._titre = titre;
		this._pages = pages;
	}
	
	public int getPages() {
		return(this._pages);
	}
	
	public void setPages(int pages) {
		this._pages = pages;
	}
	
/*	public Date getDate() {
		return(this._creationDate);
	}
	*/
	
	public String getTitre() {
		return(this._titre);
	}
	
	public void setTitre(String titre) {
		this._titre = titre;
	}
	
	public String toString() {
		String phrase_descriptive;
		phrase_descriptive = "Titre : " + this._titre + " ; Pages : " + this._pages + " ; numInv : " + Integer.toString(this._numInv); // convertir date en string
		return(phrase_descriptive);
	}
	
	
	public static int getNumberOfDocumentCreated() {
		return(Document.docTotal);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

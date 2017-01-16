package biblio.om;
import java.util.Date;
import biblio.om.Parametres;


public  class Document {
	private static int docTotal = 0;
	public int _numInv = 0;
	protected  String _titre;
	protected int _pages;
	protected Date _creationDate;
	
	public Document(String titre, int pages) {
		this._titre = titre;
		this._pages = pages;
		this._creationDate = new Date();
		//Document.docTotal ++;
		//this._numInv = Parametres._startIndexForInventory + Document.docTotal;
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
	
	public String toString2(){
		return("");
	}
	
	
	public static int getNumberOfDocumentCreated() {
		return(Document.docTotal);
	}
	
	public void setNumberOfInventory(int invNumber) {
		this._numInv = invNumber;
	}
	
	
	
	public  boolean equals(){
		return(false);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

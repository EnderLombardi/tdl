package biblio.om;
import biblio.om.Document;


public class Periodique extends Document {
	private String _frequence;
	
	public Periodique (String titre, int pages, String frequence) {
	
		super(titre,pages);
		this._frequence = frequence;
	}
		
	public String getFrequence() {
		return(this._frequence);
	}
	public void setFrequence(String frequence) {
		this._frequence = frequence;
	}
	
	public String toString() {
		String phrase_descriptive;
		phrase_descriptive = this._creationDate.toString() + " ---> biblio.om.Periodique: Titre =  " + this._titre + " - Pages =  " + Integer.toString(this._pages) + " - Fr�quence : " + this._frequence; 
		return(phrase_descriptive);
	}
	
	/* public Object clone() {
		
	} */

}
  
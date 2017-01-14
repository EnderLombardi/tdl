package biblio.om;


public class Periodique extends Document {
	private String _frequence;
	
	public Periodique (String titre, int pages, String frequence)
		this._frequence = frequence
		
	public String getFrequence() {
		return(this._frequence)
	}
	public void setFrequence(String frequence) {
		this._frequence = frequence
	}
	
	public String toString() {
		String phrase_descriptive;
		phrase_descriptive = "Titre : " + this._titre + " ; Pages : " + this._pages + " ; Fréquence : " + this._frequence;
	}
	
	public Object clone() {
		
	}

}

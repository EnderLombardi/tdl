package biblio.om;


public class Livre {
	
	private String _auteur = "";
	private String _editeur = "";
	private int _numExemplaire = 0;
	
	
	public Livre(String auteur, String editeur) {
		this._auteur = auteur;
		this._editeur = editeur;
	}
	
	
	public String getAuteur() {
		return(_auteur);
	}

	public String getEditeur() {
		return(_editeur);
	}

	public void setAuteur(String auteur) {
		this._auteur = auteur;
	}

	public void setEditeur(String editeur) {
		this._editeur = editeur;
	}
	
	public String toString() {
		String phrase_descriptive;
		phrase_descriptive = "Auteur : " + this._auteur + " ; Editeur : " + this._editeur + " ; Numero d exemplaire : " + this._numExemplaire;
		return(phrase_descriptive);
	}
		
}
	
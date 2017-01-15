package biblio.om;


public class Livre extends Document {
	
	private String _auteur = "";
	private String _editeur = "";
	private int _numExemplaire = 1;
	
	
	public Livre(String titre, int pages,String auteur, String editeur) {
		super(titre, pages);
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
		phrase_descriptive = this._creationDate.toString() + " ---> biblio.om.Livre: Titre =  " + this._titre + " - Pages =  " + Integer.toString(this._pages) + " - Auteur = " + this._auteur + " - Editeur = " + this._editeur + " - Numero d exemplaire = " + this._numExemplaire;
		return(phrase_descriptive);
	}
		
}
	
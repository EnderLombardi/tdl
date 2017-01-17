package biblio.iu;
import java.util.Vector;
import java.util.Collections;
import java.util.Scanner; 

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
	    
	    boolean flag = true,flag2 = true, flag3 = true;
	    Scanner sc = new Scanner(System.in);
	    String rep1,rep3;
	    int rep2,pages;
	    String titre,auteur,editeur,frequence;
	    
	    /*   ======= INTERFACE CONSOLE ======= 
	     
	     		1) On demande à l'utilisateur s'il veut ajouter un document à la bibliothèque.
	     		2) On demande s'il s'agit d'un livre ou d'un périodique.
	     		3) En fonction, on lui demande de renseigner les attributs adéquats.
	     		4) On demande confirmation avant de créer l'objet et de l'ajouter dans le vector tampon, qui est la liste des documents à ajouter.
	     
	     les variables flagX permettent de contrôler les boucles.
	     les variables repX permettent d'enregistrer les choix de l'utilisateurs.
	     
	     */
	    
	    
	    while(flag) {
	    flag2 = true; // on réinitialise ces booléens au début de la grande boucle, pour s'assurer de rentrer dans les sous boucles quand on renvoie l'user au début.
		flag3 = true;
		System.out.println("Voulez vous ajouter un document à la Bibliothèque? (o/n) :");
		rep1 = sc.nextLine();
		if (rep1.toLowerCase().equals("o"))
			{
				System.out.println("Veuillez rentrer le chiffre correspondant à votre requête : \n 1 - Ajout d'un Livre \n 2 - Ajout d'un Périodique ");
				rep2 = sc.nextInt();
				sc.nextLine(); // pour récupérer l'appui sur la touche entrée au moment de valider le choix précédent. Si cette ligne est absente, l'appui sur la touche Entrée est enregistré lors du prochain nextLine(), correspondant au titre.
				if (rep2 == 1) // Ajout d'un livre
					{
						System.out.println("Quel est le titre du livre?\n");
						titre = sc.nextLine();
						System.out.println("Quel est l'auteur du livre?\n");
						auteur = sc.nextLine();
						System.out.println("Combien de pages comporte-t-il?\n");
						pages = sc.nextInt();
						sc.nextLine();
						System.out.println("Quel est l'éditeur du livre?\n");
						editeur = sc.nextLine();
						
						System.out.println("Vous êtes sur le point d'ajouter le document suivant : \n Titre =  " + titre + " - Pages =  " + Integer.toString(pages) + " - Auteur = " + auteur + " - Editeur = " + editeur +"\n Confirmez-vous la saisie? (o/n)");
						rep3 = sc.nextLine();
						while (flag2)
						{
						
						if (rep3.toLowerCase().equals("o")) // On passe la réponse de l'user en minuscule, un moyen simple d'augmenter légèrement la robustesse
							{
								Livre new_livre = new Livre(titre,pages,auteur,editeur); // L'objet est crée...
								this.tampon.addElement(new_livre); // ... puis ajouté au vector tampon
								System.out.println("Le livre a bien été rentré à la liste des documents à ajouter.");
								flag2 = false; // pour pouvoir sortir de cette boucle
							}
						else if (rep3.toLowerCase().equals("n"))
							{
								System.out.println("Fort bien, nous vous renvoyons à la question initiale");
								flag2 = false;
							}
						else
							{
								System.out.println("Nous n'avons pas compris votre réponse, veuillez saisir seulement \"o\" ou \"n\" et arrêter de vouloir faire planter le programme :)" );
							}
						}	
					}
					
				else if (rep2 ==2) // Ajout d'un périodique
					{
						System.out.println("Quel est le titre du périodique?\n");
						titre = sc.nextLine();
						System.out.println("Combien de pages comporte-t-il?\n");
						pages = sc.nextInt();
						sc.nextLine();
						System.out.println("A quelle fréquence paraît le périodique? hebdomadaire, bimensuel ou mensuel?");
						frequence = sc.nextLine();
						
						System.out.println("Vous êtes sur le point d'ajouter le document suivant : \n Titre =  " + titre + " - Pages =  "
											 + Integer.toString(pages) + " - Fréquence : " + frequence + "\n Confirmez vous la saisie? (o/n)"); // demande de confirmation
						
						rep3 = sc.nextLine();
						while (flag3)
						{
						
						if (rep3.toLowerCase().equals("o"))
							{
								Periodique new_periodique = new Periodique(titre,pages,frequence);
								this.tampon.addElement(new_periodique);	
								System.out.println("Le périodique a bien été rentré à la liste des documents à ajouter.");
								flag3 = false;
							}
						else if (rep3.toLowerCase().equals("n"))
							{
								System.out.println("Fort bien, nous vous renvoyons à la question initiale");
								flag3 = false;
							}
						else
							{
								System.out.println("Nous n'avons pas compris votre réponse, veuillez saisir seulement \"o\" ou \"n\" et arrêter de vouloir faire planter le programme :)" );
							}
						}						 
						
					}
				
				else 
					{
						System.out.println("Nous n'avons pas compris votre choix. Retour à la question initiale");
					}
			}	
		else if (rep1.toLowerCase().equals("n"))
			{
				System.out.println("Aucun document à ajouter");
				flag = false;
			}
		else
			{
					System.out.println("Nous n'avons pas compris votre réponse, veuillez saisir seulement \"o\" ou \"n\" et arrêter de vouloir faire planter le programme :)" );
			}
		
		
		
		
	    }
	    	
	    
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
	   	   	for(int i =0; i < Gestionnaire.documents.length -2; i++)
		{	
			if (Gestionnaire.documents[i] != null)
			{
					System.out.println("---> Inventaire n°" + Integer.toString(Parametres._startIndexForInventory + 1 + this._biblio.getInventoryNb(Gestionnaire.documents[i])));
  					System.out.println(Gestionnaire.documents[i].toString2() + "\n");
			}
			
		
		}
	  
	}
	
}

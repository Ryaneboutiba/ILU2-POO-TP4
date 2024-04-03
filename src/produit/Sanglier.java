package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	private String nom;
	private String unite;
	private Gaulois chasseur;
	private int poid;
	
	public Sanglier(int poid,Gaulois chasseur) {
		super("sanglier");
		this.chasseur=chasseur;
		this.poid=poid;
	}
	
	@Override
	public void descriptionProduit() {
		
	}

}

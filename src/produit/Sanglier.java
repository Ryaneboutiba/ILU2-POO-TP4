package produit;

import personnages.Gaulois;

public class Sanglier extends Produit implements IProduit{
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
	public String descriptionProduit() {
		return "";
	}
	
	
	@Override 
	public double calculerPrix(int prix) {
		return 1.5;
	}
}

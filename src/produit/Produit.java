package produit;

public abstract class Produit implements IProduit {
	private String nom;
	private UNITE unite;
	
	
	
	@Override
	public String getNom() {
		return nom;
	}
	
	
	public Produit(String nom) {
		this.nom=nom;
	}
	
	@Override
	public abstract void descriptionProduit();
	

}

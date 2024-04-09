package produit;

public class Poisson extends Produit{
	private String nom;
	private UNITE unite;
	private String date;
	
	public Poisson(String date) {
		super("poisson");
		this.date=date;
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

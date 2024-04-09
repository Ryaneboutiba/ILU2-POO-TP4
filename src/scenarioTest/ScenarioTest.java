package scenarioTest;

import personnages.Gaulois;
import produit.IProduit;
import produit.Poisson;
import produit.Sanglier;
import vilagegauloisold.Etal;
import vilagegauloisold.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		
		IEtal[] etals = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		etals[0] = etalSanglier;
		Gaulois gaulois=new Gaulois("Ordralfab�tix", 12);
		Poisson poisson=new Poisson("lundi");
		etals[0].occuperEtal(gaulois, poisson, 10);
		
		
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		Etal<Sanglier> etalSanglier1=new Etal<>();
		Etal<Sanglier> etalSanglier2=new Etal<>();
		Etal<Poisson> etalPoissson=new Etal<>();
		
		IEtal[] marche=new IEtal[3];
		marche[0]=etalSanglier1;
		marche[1]=etalSanglier2;
		marche[2]=etalPoissson;
		
		etalSanglier1.installerVendeur(obelix, sangliersObelix, 8);
        etalSanglier2.installerVendeur(asterix, sangliersAsterix, 10);
        etalPoissson.installerVendeur(ordralfabetix, poissons, 7);

	}
	
}

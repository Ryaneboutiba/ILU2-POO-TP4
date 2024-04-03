package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Sanglier;
import vilagegauloisold.Etal;
import vilagegauloisold.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		
		IEtal[] etals = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		etals[0] = etalSanglier;
		Gaulois gaulois=new Gaulois("Ordralfabétix", 12);
		Poisson poisson=new Poisson("lundi");
		etals[0].occuperEtal(gaulois, poisson, 10);
	}
	
}

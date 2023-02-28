package febbraio;

public class LibroMastro {

	private double Vendite[];
	private int VenditeEffettuate;
	private int MassimeVendite;

	//costruttori
	public LibroMastro() {
		
	}
	public LibroMastro(int massimo) {
		
		MassimeVendite = massimo;
		Vendite = new double [MassimeVendite];
		VenditeEffettuate = 0;
	}
	
	//calcolo del totale delle vendite
	public double getTotaleVendite() {
		
		double totale = 0;
		for (int i = 0; i < Vendite.length; i++) {
			
			totale += Vendite[i];
		}
		return totale;
	}
	
	public int getNumeroDiVenditeEffettuate() {
		return VenditeEffettuate;
	}
	
	public int getMassimeVendite() {
		return MassimeVendite;
	}
	
	public void aggiungiVendita(double d) {
		
		Vendite[VenditeEffettuate] = d;
		VenditeEffettuate += 1;
	}
	
	//visualizzazione delle venidte con valore maggiore di v
	public int getVenditeAlDiSopra(double v) {
		
		int contatore = 0;
		for (int i = 0; i < Vendite.length; i++) {
			
			if (Vendite[i] > v) {
				
				contatore++;
			}
		}
		return contatore;
	}
	
	//calcolo della media delle vendite
	public double getMediaVendite() {
		
		double medio = 0;
		for (int i = 0; i < Vendite.length; i++) {
			
			medio += Vendite[i];
		}
		return medio/Vendite.length;
	}
}
package febbraio;
import java.util.Scanner;
public class test_LibroMastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creazione oggetto
		Scanner x = new Scanner (System.in);
		Scanner y = new Scanner (System.in);
		LibroMastro oggetto1 = new LibroMastro();
		
		//variabile string per la riesecuzione dell'esercizio
		String ripeti;
		
		//ciclo do while dell'esercizio intero
		do {
			
			System.out.print("inserisci il numero massimo di vendite possibili: ");
			int massimo = x.nextInt();
			oggetto1 = new LibroMastro(massimo);
			
			System.out.print("inserisci il numero di vendite da effettuare: ");
			int daEffettuare = x.nextInt();
			
			//se il valore di venidte da effettuare eccede quello delle vendite possibile, il dato viene reinserito
			while (daEffettuare > massimo) {
				
				System.out.print("hai inserito un numero troppo grande, reinserisci: ");
				daEffettuare = x.nextInt();
			}
				
			//inserimento delle vendite
			for (int i = 0; i < daEffettuare; i++) {
					
				System.out.print("aggiungi il valore della vendita: ");
				oggetto1.aggiungiVendita(x.nextInt());
			}
			
			//variabile booleana che, se impostata a false, fà terminare il do while interno
			boolean rifai = true;
			
			//ciclo do while per il collaudo dei metodi
			do {
				
				//richiamo metodo caricamento
				switch(Caricamento()) {
					
					//reinserimento dei valori
					case 1:
					
						if (oggetto1.getNumeroDiVenditeEffettuate() == oggetto1.getMassimeVendite()) {
							
							System.out.println("numero massimo di vendite raggiunto, non è più possibile effettuare vendite");
							break;
						}
						else {
							
							int rimanenti = oggetto1.getMassimeVendite() - oggetto1.getNumeroDiVenditeEffettuate();
							System.out.println("ci sono ancora " + rimanenti + " possibili vendite");
							System.out.print("inserisci il numero di vendite da effettuare: ");
							daEffettuare = x.nextInt();
							
							//se il valore di venidte da effettuare eccede quello delle vendite possibile, il dato viene reinserito
							while (daEffettuare > rimanenti) {
								
								System.out.print("hai inserito un numero troppo grande, reinserisci: ");
								daEffettuare = x.nextInt();
							}
							
							//inserimento delle vendite
							for (int i = 0; i < daEffettuare; i++) {
								
								System.out.print("aggiungi il valore della vendita: ");
								oggetto1.aggiungiVendita(x.nextInt());
							}
						}
						break;
				
						
					//stampa del guadagno totale
					case 2:
						
						System.out.println("guadagno delle vendite effettuate: " + oggetto1.getTotaleVendite());
						break;
						
						
					//visualizzazione delle vendite maggiori di un dato in input
					case 3:
						
						System.out.print("inserisci il limite dal quale bisogna visualizzare la vendita: ");
						int limite = x.nextInt();
						System.out.println("il numero di vendite con valore maggiore di: " + limite + " è: "
											+ oggetto1.getVenditeAlDiSopra(limite));
						break;
				
						
					//visualizzazione media delle vendite
					case 4:
						
						System.out.println("la media delle vendite equivale a: " + oggetto1.getMediaVendite());
						
						
					case 0:
						
						rifai = false;
						break;
				}
			}while(rifai);
			
			//chiedo all'utente se vuole rieseguire l'esercizio
			System.out.print("vuoi rifare? ");
			ripeti = y.nextLine();
		}while(ripeti.equals("si"));
	}
	
	//metodo di caricamento per il collaudo dei metodi
	public static int Caricamento() {
		
		Scanner x = new Scanner (System.in);
		
		System.out.println("\ncosa vuoi fare?");
		System.out.println("1 per inserire di nuovo un libro");
		System.out.println("2 per visualizzare il totale delle vendite");
		System.out.println("3 per visualizzare il numero di vendite con valore superiore ad un valore inserito");
		System.out.println("4 per visualizzare la media delle vendite");
		System.out.println("0 per terminare");
		int scelta = x.nextInt();
		
		return scelta;
	}
}
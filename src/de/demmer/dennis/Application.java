package de.demmer.dennis;

public class Application {
	
	public static void main(String[] args) {
		
		//--- while - schleife ---
			
		//initialisierung der Läufervariable
		int i = 0;
		
			// Abbruchbedingung
		while(i < 5) {
			System.out.println("Hallo Welt");
			
			//Hochzählen der Läufervariable
			i = i + 1;
		}
			
		
		
		//--- for schleife ---
		
			//Läufervariable ;  Abbruchbedingung ;  var hochzählen  (man kann auch j++ schreiben)
		for(  int j = 0      ;      j < 5        ;   j = j + 1    ) {
			
			System.out.println("hallo for schleife");
		}
		
		
		
		
		
		// ---do while ---
		
		do {
			System.out.println("Do while");
		} while(5 < 10);
		
		
		
		
	}

}

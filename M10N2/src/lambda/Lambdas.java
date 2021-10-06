package lambda;

import java.util.Comparator;
import java.util.List;

public class Lambdas {
	
	// Exercici 1 i 2: longitud (de més curta a més llarga) i longitud inversa (de més llarga a més curta)

	public void getCadenesPerLlargaria(List<String> llista, boolean ascendent) {
		
		if (ascendent) {
			llista.stream()
				.sorted(Comparator.comparing(l -> l.length())).forEach(System.out::println);
		
		} else {
			llista.stream()
				.sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
		}
				
	}
	
	// Exercici 3: alfabèticament pel primer caràcter (Nota: charAt(0) retorna el codi numèric del primer caràcter).
	
	public void getCadenesAlfabeticament(List<String> llista) {
		
		llista.stream()
			.sorted(Comparator.comparing(l -> l.charAt(0))).forEach(System.out::println);
	}
	
	// Exercici 5: modifica tots els elements de la matriu per canviar els caràcters “a” a “4”.

	public void getCadenesCanviaCharForNum(List<String> llista, String caracter, String num) {
		
		llista.stream()
			.map(l -> l.replace(caracter, num)).forEach(System.out::println);

	}

	// Exercici 6: 
	
	public void getCadenesNumeriques(List<String> llista) {

		llista.stream()
			.filter(l -> l.matches("[0-9]+")).forEach(System.out::println);

	}

}

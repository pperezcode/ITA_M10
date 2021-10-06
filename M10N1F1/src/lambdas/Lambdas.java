package lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {
	
	// Exercici 1
	// Tenint una llista de cadenes de noms propis, escriu un mètode que retorni una llista de totes les cadenes 
	// que comencen amb la lletra 'a' (mayuscula) i tenen exactament 3 lletres. Imprimeix el resultat. 
	
	public List<String> getCadenesLletraInicialNumCaracters(List<String> llista, String lletraInicial, int numLletres ) {
		
		return llista.stream()
				.filter(l -> l.startsWith(lletraInicial))
				.filter(l -> l.length() == numLletres)
				.collect(Collectors.toList());
	}

	// Exercici 2	
	// Escriu un mètode que retorni una cadena separada per comes basada en una llista d’Integers. 
	// Cada element hauria d'anar precedit per la lletra "e" si el nombre és parell, i precedit de la lletra "o" si el nombre és imparell. 
	// Per exemple, si la llista d'entrada és (3,44), la sortida hauria de ser "o3, e44". Imprimeix el resultat. 
			
	public String getIntegersPrefix(List<Integer> llista, String prefixParell, String prefixImparell, String separador) {
		
		return llista.stream()
				.map(n -> (n % 2 == 0) ? prefixParell + n : prefixImparell + n)
				.collect(Collectors.joining(separador));
		
	}
	
	// Exercici 3
    // Tenint una llista de Strings, escriu un mètode que retorni una llista de totes les cadenes que continguin la lletra ‘o’. Imprimeix el resultat. 

	public List<String> getCadenesLletra(List<String> llista, String lletra) {
		
		return llista.stream()
				.filter(l -> l.contains(lletra))
				.collect(Collectors.toList());
	}
	
	// Exercici 4
    // Fer el mateix que en el punt anterior, però retornant una llista que inclogui els elements amb més de 5 lletres. Imprimeix el resultat. 

	public List<String> getCadenesNumCaracters(List<String> llista, int numCaracters) {
		
		return llista.stream()
				.filter(l -> l.length() > numCaracters)
				.collect(Collectors.toList());
		
	}
	
}

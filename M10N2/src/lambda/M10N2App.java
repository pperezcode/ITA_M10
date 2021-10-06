package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class M10N2App {

	Lambdas l = new Lambdas();

	List<String> Llista7Meravelles = Arrays.asList("1", "Chichen Itza", "2", "El Coliseo Romano", "3", "La estatua del Cristo Redentor", 
			"4", "La Gran Muralla China", "5", "Machu Picchu", "6", "Petra", "7", "El Taj Mahal");
	
	public static void main(String[] args) {
		
		M10N2App mApp = new M10N2App();

		//Feu una matriu que contingui algunes cadenes de text y n�meros i ordeneu-les pels criteris indicats.
		
		mApp.exercici1();
		mApp.exercici2();
		mApp.exercici3();
		mApp.exercici4();
		mApp.exercici5();
		mApp.exercici6();
		mApp.exercici7();
		
	}
	
	public void exercici1() {
				
		System.out.println("\nExercici 1: cadenes de m�s curta a m�s llarga\n-----------");

		l.getCadenesPerLlargaria(Llista7Meravelles, true);
		
	}
		
	public void exercici2() {
	
		System.out.println("\nExercici 2: cadenes de m�s llarga a m�s curta\n-----------");

		l.getCadenesPerLlargaria(Llista7Meravelles, false);
		
	}
	
	public void exercici3() {
		
		System.out.println("\nExercici 3: cadenes ordenades alfab�ticament\n-----------");

		l.getCadenesAlfabeticament(Llista7Meravelles);
	
	}
	
	public void exercici4() {

		System.out.println("\nExercici 4: cadenes ordenades alfab�ticament, amb prioritat les que contenen 'e'\n-----------");
		
		List<String> startsWithE = new ArrayList<String>();
		List<String> startsWithNoE = new ArrayList<String>();

		for(String s : Llista7Meravelles) {
		  if(s.toLowerCase().startsWith("e")) {
			  startsWithE.add(s);
		  } else {
			  startsWithNoE.add(s);
		  }
		}
		
		startsWithE.stream()
			.sorted(Comparator.comparing(l -> l.charAt(0))).forEach(System.out::println);
		startsWithNoE.stream()
			.sorted(Comparator.comparing(l -> l.charAt(0))).forEach(System.out::println);
		
	}
	
	public void exercici5() {

		System.out.println("\nExercici 5: cadenes amb car�cters 'a' canviats per '4'\n-----------");

		l.getCadenesCanviaCharForNum(Llista7Meravelles, "a", "4");
	}
	
	public void exercici6() {

		System.out.println("\nExercici 6: elements 100% num�rics (tot i que estiguin guardats com strings)\n-----------");

		l.getCadenesNumeriques(Llista7Meravelles);
	}
	
	
	public void exercici7() {
		
		//Crea una Functional Interface que contingui un m�tode abstracte operacio(), que retorni un valor float; 
		//injecta a la interf�cie creada mitjan�ant una lambda el cos del m�tode, de manera que pugis transformar 
		// la operaci� a una suma, resta, multiplicaci� i divisio. 
		 
		InterfaceOperation iOp = (a, b, op) -> {
			
			float resultat;
			
			switch (op) {
				case "+":
					resultat = a + b;
					break;
				case "-":
					resultat = a - b;
					break;
				case "*":
					resultat = a * b;
					break;
				case "/":
					resultat = a / b;
					break;
				case "%":
					resultat = a % b;
					break;
				default:
					resultat = 0;
			}
			
			return resultat;
		};
		
		float valorA = Float.parseFloat(JOptionPane.showInputDialog("Operaci� amb 2 valors float:\nDona'm el 1er valor"));
		float valorB = Float.parseFloat(JOptionPane.showInputDialog("Operaci� amb 2 valors float:\nDona'm el 2n valor"));
		String simbol = JOptionPane.showInputDialog("Operaci� amb 2 valors float:\nQuina operaci� vols fer?\n+   -   *   /   %");

		System.out.println("\nExercici 7: FunctionalInterface operacio()\n-----------");
		System.out.println(valorA + " " + simbol + " " + valorB + " = " + iOp.operacio(valorA, valorB, simbol));		
		
	}

}

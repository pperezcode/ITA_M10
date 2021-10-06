package lambdas;

public class M10N1F1App {
	
	Llistes llista = new Llistes();
	Lambdas l = new Lambdas();

	public static void main(String[] args) {
		
		M10N1F1App mApp = new M10N1F1App();
		
		mApp.exercici1();
		mApp.exercici2();
		mApp.exercici3();
		mApp.exercici4();
		mApp.exercici5();
		mApp.exercici6();
	}
		
	private void exercici1() {
		
		System.out.println("\nExercici 1: cadenes de 3 lletres que comencen per 'A'\n-----------");
		
		l.getCadenesLletraInicialNumCaracters(llista.LlistaNoms, "A", 3).forEach(System.out::println);
	
	}			
		
	private void exercici2() {
				
		System.out.println("\nExercici 2: cadena separada per comes amb prefix 'e' per parells i 'o' per imparells\n-----------");
		
		System.out.println(l.getIntegersPrefix(llista.LlistaIntegers,  "e", "o", ", "));
			
	}

	private void exercici3() {
			
		System.out.println("\nExercici 3: cadenes que contenen la lletra 'o'\n-----------");
		
		l.getCadenesLletra(llista.LlistaStrings, "o").forEach(System.out::println);
			
	}

	private void exercici4() {
			
		System.out.println("\nExercici 4: cadenes amb més de 5 lletres\n-----------");
		
		l.getCadenesNumCaracters(llista.LlistaStrings, 5).forEach(System.out::println);
	
	}
	
	private void exercici5() {
				
		System.out.println("\nExercici 5: mesos de l'any amb lambda\n-----------");
		
		llista.LlistaMesos.stream().forEach(m -> System.out.println(m));
	}
	
	private void exercici6() {
		
		System.out.println("\nExercici 6: mesos de l'any amb method reference\n-----------");
		
		llista.LlistaMesos.stream().forEach(System.out::println);
	
	}
		
}

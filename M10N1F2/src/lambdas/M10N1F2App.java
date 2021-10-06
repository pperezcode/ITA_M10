package lambdas;

public class M10N1F2App {

	public static void main(String[] args) {
		
		// Crea una Functional Interface que contingui un mètode abstracte getPiValue(), que retorni un valor double; 
		// en una altra classe, instancia la interfície i assigna-li mitjançant una lambda el valor 3.1416. 
		// Invoca el mètode getPiValue() de la instància d'interfície i imprimeix el resultat. 
		
		InterfacePiValue iPI = () -> {
			final double PI = 3.1416; 
			return PI;
		};
		
		System.out.println("PI = " + iPI.getPiValue());
		
	}

}

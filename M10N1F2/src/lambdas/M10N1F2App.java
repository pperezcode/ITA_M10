package lambdas;

public class M10N1F2App {

	public static void main(String[] args) {
		
		// Crea una Functional Interface que contingui un m�tode abstracte getPiValue(), que retorni un valor double; 
		// en una altra classe, instancia la interf�cie i assigna-li mitjan�ant una lambda el valor 3.1416. 
		// Invoca el m�tode getPiValue() de la inst�ncia d'interf�cie i imprimeix el resultat. 
		
		InterfacePiValue iPI = () -> {
			final double PI = 3.1416; 
			return PI;
		};
		
		System.out.println("PI = " + iPI.getPiValue());
		
	}

}

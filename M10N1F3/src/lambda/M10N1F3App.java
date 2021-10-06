package lambda;

public class M10N1F3App {

	public static void main(String[] args) {
	
			// Crea una Functional Interface que contingui un mètode abstracte reverse(), que retorni un valor String; 
			// en una altra classe, injecta a la interfície creada mitjançant una lambda el cos del mètode, 
			// de manera que retorni la mateixa cadena que rep com a paràmetre però a l'inrevés. 
			// Invoca la instància de la interfície passant-li una cadena i comprovant el resultat. 
			
		InterfaceReverse iRev = (c) -> {
	
				System.out.println(c);
				StringBuilder strb = new StringBuilder(c);
				c = strb.reverse().toString();
				return c;
				
			};
			
			System.out.println(iRev.getReverseString("SATOR"));
			System.out.println(iRev.getReverseString("AREPO"));
			System.out.println(iRev.getReverseString("TENET"));
			System.out.println(iRev.getReverseString("OPERA"));
			System.out.println(iRev.getReverseString("ROTAS"));
		}

}

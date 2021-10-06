package lambda;

public class M10N1F3App {

	public static void main(String[] args) {
	
			// Crea una Functional Interface que contingui un m�tode abstracte reverse(), que retorni un valor String; 
			// en una altra classe, injecta a la interf�cie creada mitjan�ant una lambda el cos del m�tode, 
			// de manera que retorni la mateixa cadena que rep com a par�metre per� a l'inrev�s. 
			// Invoca la inst�ncia de la interf�cie passant-li una cadena i comprovant el resultat. 
			
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

package lambdas;

import java.util.ArrayList;

public class LlistaAlumnes {
		
	public ArrayList<Alumne> getLlistaAlumnes() {
		
		ArrayList<Alumne> alumnes = new ArrayList<Alumne>();
		
		alumnes.add(new Alumne("Maria", 17, CursEnum.JAVA, 7.5));
		alumnes.add(new Alumne("Pere", 24, CursEnum.ANGULAR, 5.5));
		alumnes.add(new Alumne("Antoni", 38, CursEnum.REACT, 4.0));
		alumnes.add(new Alumne("Pascual", 41, CursEnum.PHP, 8.5));
		alumnes.add(new Alumne("Cristina", 28, CursEnum.JAVA, 4.2));
		alumnes.add(new Alumne("Ana", 26, CursEnum.PHYTON, 4.3));
		alumnes.add(new Alumne("Andreu", 44, CursEnum.JAVA, 5.8));
		alumnes.add(new Alumne("Joel", 52, CursEnum.PHP, 9.0));
		alumnes.add(new Alumne("Carla", 29, CursEnum.JAVA, 4.0));
		alumnes.add(new Alumne("Teresa", 47, CursEnum.REACT, 6.7));
		
		return alumnes;
	}

}

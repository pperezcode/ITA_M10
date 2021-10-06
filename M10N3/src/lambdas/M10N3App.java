package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class M10N3App {

	
	public static void main(String[] args) {

		//Crea una classe Alumne que tingui com a propietats: Nom, edat, curs i nota.
		// Omple la llista amb 10 alumnes.
		
		llistaAlumnes = new LlistaAlumnes();
		alumnes = llistaAlumnes.getLlistaAlumnes();
		
		exercici1();
		exercici2();
		exercici3();
		exercici4();
		exercici5();
		
	}
	
	private static LlistaAlumnes llistaAlumnes;
	private static ArrayList<Alumne> alumnes;
	
	private static void exercici1() {
		
		System.out.println("\nExercici 1: mostrar nom i edat de cada alumne\n-----------");
		
		alumnes.forEach(a -> System.out.println("- " + a.getNom() + ", "+ a.getEdat() + " anys"));
        		
	}
		
	private static void exercici2() {
		
		System.out.println("\nExercici 2: nova llista amb alumnes amb nom que comenci per 'a' (tot amb lambdes)\n-----------");

		List<Alumne> alumnesA = alumnes.stream().filter(a -> a.getNom().toLowerCase().startsWith("a")).collect(Collectors.toList());
		
		alumnesA.forEach(System.out::println);

	}
		
	private static void exercici3() {
		System.out.println("\nExercici 3: alumnes que tinguin un 5 o més de nota\n-----------");

		alumnes.stream()
			.filter(a -> a.getNota() >= 5)
			.sorted(Comparator.comparingDouble(Alumne::getNota))
			.forEach(a -> System.out.println("- " + a.getNom() + ", nota: "+ a.getNota()));

	}
				
	private static void exercici4() {
		System.out.println("\nExercici 4 : alumnes que tinguin un 5 o més de nota y que no siguin de PHP\n-----------");

		alumnes.stream()
		.filter(a -> a.getNota() >= 5)
		.filter(a -> !a.getCurs().equals(CursEnum.PHP))
		.sorted(Comparator.comparingDouble(Alumne::getNota))
		.forEach(a -> System.out.println("- " + a.getNom() + ", " + a.getCurs() + " , nota: " + a.getNota()));

	}
	
	private static void exercici5() {
		System.out.println("\nExercici 5: alumnes que facin JAVA i siguin majors d’edat\n-----------");

		alumnes.stream()
			.filter(a -> a.getCurs().equals(CursEnum.JAVA))
			.filter(a -> a.getEdat() >= 18)
			.sorted(Comparator.comparingInt(Alumne::getEdat))
			.forEach(a -> System.out.println("- " + a.getNom() + ", " + a.getEdat() + " anys, " + a.getCurs()));
		
		System.out.println("");

	}

}

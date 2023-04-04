package avancado;

import java.util.Set;
import java.util.TreeSet;

/*
 * @autor dimitri.leone
 * @since 04.04.2023
 */

public class SobreSet_2 {

	public static void main(String[] args) {
		Set<String> setDeFrutas = new TreeSet<>();
		
		setDeFrutas.add("Laranja");
		setDeFrutas.add("Pera");
		setDeFrutas.add("Manga");
		setDeFrutas.add("Limão");
		
		System.out.println(setDeFrutas);
	}
	
}
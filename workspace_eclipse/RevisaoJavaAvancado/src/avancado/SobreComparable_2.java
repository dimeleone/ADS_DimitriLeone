package avancado;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/*
 * @autor dimitri.leone
 * @since 04.04.2023
 */

public class SobreComparable_2 {

	public static void main(String[] args) {
	List<Animal> listaDeAnimais = new ArrayList<>();
	listaDeAnimais.add(new Animal(1L, "Tartatuga"));
	listaDeAnimais.add(new Animal(2L, "Coelho"));
	listaDeAnimais.add(new Animal(3L, "Cachorro"));
	listaDeAnimais.add(new Animal(4L, "Gato"));
	listaDeAnimais.add(new Animal(5L, "Girafa"));
	listaDeAnimais.add(new Animal(6L, "Gato"));
	
	
	System.out.println("> Pela ordem de inserção:");
	System.out.println(listaDeAnimais);
	
	System.out.println("> Pela ordem alfabética do nome do animal:");
	Collections.sort(listaDeAnimais);
	System.out.println(listaDeAnimais);
	
	}
}

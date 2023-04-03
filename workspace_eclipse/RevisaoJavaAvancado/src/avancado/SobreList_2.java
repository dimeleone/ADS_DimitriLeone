package avancado;

import java.util.List;
import java.util.ArrayList;
/*
 * @autor dimitri.leone
 * @since 03.04.2023
 */

public class SobreList_2 {
	
	public static void main(String[] args) {
	List<Animal> listaDeAnimais = new ArrayList<>();
	
	listaDeAnimais.add(new Animal(1L, "Tartatura"));
	listaDeAnimais.add(new Animal(2L, "Coelho"));
	listaDeAnimais.add(new Animal(3L, "Cachorro"));
	listaDeAnimais.add(new Animal(4L, "Gato"));
	listaDeAnimais.add(new Animal(5L, "Girafa"));
	listaDeAnimais.add(new Animal(6L, "Gato"));
	
	System.out.println(listaDeAnimais);
	
	}
}
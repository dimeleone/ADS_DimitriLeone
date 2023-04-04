package avancado;

import java.util.Comparator;

/*
 * @autor dimitri.leone
 * @since 04.04.2023
 */

	public class ComparadorPorNome implements Comparator<Animal>{
		
		@Override
		public int compare(Animal a1, Animal a2) {
			return a1.getNome().compareTo(a2.getNome());
		}
	}


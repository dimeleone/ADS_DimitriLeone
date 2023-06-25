package strategy.comparator;

import java.util.Comparator;

/*
 * @autor dimitri.leone
 * @since 06.06.2023
 */

public class ComparadorPorId implements Comparator<Animal> {

	@Override
	public int compare(Animal a1, Animal a2) {
		return a1.getId().compareTo(a2.getId());
	}
	
}

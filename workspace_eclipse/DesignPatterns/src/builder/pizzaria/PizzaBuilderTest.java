package builder.pizzaria;

/*
 * @autor dimitri.leone
 * @since 01.06.2023
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PizzaBuilderTest {

	@Test
	void deveConstruirPizzaValida() {
		
		Pizza pizza = new PizzaBuilder()
				.setSize(1)
				.addCheese()
				.addPepperoni()
				.getPizza();
		
		assertNotNull(pizza);
		assertNotNull(pizza.getSize());
		assertTrue(pizza.getFlagCheese());
		assertTrue(pizza.getFlagPepperoni());	
	}

	
	@Test
	void deveInvalidarPizzaComTamanhoErrado() {
		try {
			Pizza pizza = new PizzaBuilder()
					.setSize(11)
					.addCheese()
					.addPepperoni()
					.getPizza();
			
			fail("FALTOU LANÇAR EXCEPTION");
		} catch (IllegalStateException e) {
			//O QUE SERIA ESPERADO:
			e.printStackTrace();
		}
	}
	
	
	@Test
	void deveInvalidarPizzaSemIngrediente() {
		try {
			Pizza pizza = new PizzaBuilder()
					.setSize(1)
					.getPizza();
			
			fail("FALTOU LANÇAR EXCEPTION");
		} catch (IllegalStateException e) {
			//O QUE SERIA ESPERADO:
			e.printStackTrace();
		}
		
	}
	
}

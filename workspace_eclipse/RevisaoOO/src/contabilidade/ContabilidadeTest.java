package contabilidade;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * @autor dimitri.leone
 * @since 30.03.2023
 */

public class ContabilidadeTest {
	
	@Test
	void testEmpresaMEI() {
		EmpresaMEI empresaMEI = new EmpresaMEI(100.0);
		
		Double IRvalor = 27.5;
		assertEquals(IRvalor, empresaMEI.getValorIR(), 2);
		
		Double ISSvalor = 0.0;
		assertEquals(ISSvalor, empresaMEI.getValorISS(), 2);
	}
	
	
	
	
	@Test
	void testEmpresaSimples() {
		EmpresaSimples empresaSimples = new EmpresaSimples(100.0);
		
		Double IRvalor = 15.0;
		assertEquals(IRvalor, empresaSimples.getValorIR(), 2);
		
		Double ISSvalor = 8.0;
		assertEquals(ISSvalor, empresaSimples.getValorISS(), 2);
	}

}

package contabilidade;

/*
 * @autor dimitri.leone
 * @since 30.03.2023
 */

public class EmpresaMEI implements Tributavel {

	private static final Double ISS_TAXA_MEI = 0.0;
	private static final Double IR_TAXA_MEI = 0.275;
	
	Double faturamentoMensal;
	
	public EmpresaMEI(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}
	
	
	@Override
	public Double getValorIR() {
		return this.faturamentoMensal * IR_TAXA_MEI;
	}
	
	@Override
	public Double getValorISS() {
		return this.faturamentoMensal * ISS_TAXA_MEI;
	}
}

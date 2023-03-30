package contabilidade;

/*
 * @autor dimitri.leone
 * @since 30.03.2023
 */

public class EmpresaSimples implements Tributavel {
	
	static final double ISS_TAXA_SIMP = 0.08;
	static final double IR_TAXA_SIMP = 0.15;
	Double faturamentoMensal;
	
	public EmpresaSimples(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorIR() {
		return this.faturamentoMensal * IR_TAXA_SIMP;
	}
	
	@Override
	public Double getValorISS() {
		return this.faturamentoMensal * ISS_TAXA_SIMP;
	}
}

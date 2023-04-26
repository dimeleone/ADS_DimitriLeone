package open_closed;

/*
 * @autor dimitri.leone
 * @since 26.04.2023
 */

public class ContratoCLT {

	private Double salario;
	
	public ContratoCLT(Double salario) {
		super();
		this.salario = salario;
	}
	
	public Double getSalario() {
		return salario;
	}
}


//Refatorando depois:
/*public class ContratoCLT implements Remuneravel {
	
	public double getRemuneracao() {
		return this.getSalario;
	}
}*/


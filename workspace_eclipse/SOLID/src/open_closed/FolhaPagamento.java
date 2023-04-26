package open_closed;

/*
 * @autor dimitri.leone
 * @since 26.04.2023
 */

public class FolhaPagamento {

	private Double totalFolha = 0.0;
	
	public void calcular(Object obj) {
		if (obj instanceof ContratoCLT) {
			ContratoCLT contratoCLT = (ContratoCLT) obj;
			totalFolha += contratoCLT.getSalario();
		
		} else if (obj instanceof Estagio) {
			Estagio estagio = (Estagio) obj;
			totalFolha += estagio.getBolsaAuxilio();
		
		} else {
			//o que fazer aqui?
		}
	}
	
	public Double getTotalFolha() {
		return totalFolha;
	}
}

//Refatorando FolhaPagamento para usar a Remunerável:
/*
public class FolhaPagamento {

	public void calcular(Remuneravel r){
	this.totalFolha += r.getRemuneracao();
	}
}
*/
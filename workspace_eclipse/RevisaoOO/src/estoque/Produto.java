package estoque;
import java.time.LocalDate;

/*
 * @autor dimitri.leone
 * @since 30.03.2023
 */

public class Produto {

	private String descricao;
	private Double valorCompra;
	private LocalDate dataValidade;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public LocalDate getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}
	

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", valorCompra=" + valorCompra + ", dataValidade=" + dataValidade + "]";
	}



}

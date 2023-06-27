package state.artigo;

import java.util.ArrayList;
import java.util.List;

/*
 * @autor dimitri.leone
 * @since 13.06.2023
 */

public class Artigo {

	private Estado estado;
	private List<String> logHistorico = new ArrayList<>();
	
	public Artigo() {
		this.estado = new EstadoRascunho(this); // Estado Inicial
	}
	
	public void publicar() {
		estado.publicar();
	}
	
	public void reprovar() {
		estado.reprovar();
	}
	
	protected void transitarEstadoPara(Estado estado) {
		this.estado = estado;
	}
	
	
	//Getters...
	public Estado getEstado() {
		return estado;
	}

	public List<String> getLogHistorico() {
		return logHistorico;
	}
	
	
	
	
	
	

	
}

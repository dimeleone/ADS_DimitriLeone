package state.artigo;

/*
 * @autor dimitri.leone
 * @since 13.06.2023
 */

public class EstadoAprovado implements Estado {

	private Artigo artigo;
	
	public EstadoAprovado(Artigo artigo) {
		super();
		this.artigo = artigo;
	}
	
	@Override
	public void publicar() {
		//faz nada
	}
	
	@Override
	public void reprovar() {
		//faz nada
	}
}


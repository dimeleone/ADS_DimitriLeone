package state.artigo;

/*
 * @autor dimitri.leone
 * @since 13.06.2023
 */

public class GerenteDeSeguranca {

	private static GerenteDeSeguranca instance;
	
	private GerenteDeSeguranca() {
}
	
	public static GerenteDeSeguranca getInstance() {
		if(instance == null) {
			instance = new GerenteDeSeguranca();
		}
		
		return instance;
	}
	
	
	//declarar usuarioCorrente
	public String usuarioCorrente;
	
	public String getUsuarioCorrente() {
		return usuarioCorrente;
	}
	
	public void setUsuarioCorrente(String usuarioCorrente) {
		this.usuarioCorrente = usuarioCorrente;
	}
	
	public boolean ehUsuarioModerador() {
		return "MODERADOR".equals(usuarioCorrente);
	}
	
	public boolean ehUsuarioAutor() {
		return "AUTOR".equals(usuarioCorrente);
	}
}

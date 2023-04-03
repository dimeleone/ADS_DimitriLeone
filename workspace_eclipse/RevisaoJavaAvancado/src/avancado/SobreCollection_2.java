package avancado;

import java.util.Collection;
import java.util.ArrayList;

/*
 * @autor dimitri.leone
 * @since 03.04.2023
 */

public class SobreCollection_2 {
	
	public static void main(String[] args) {
		//1
		Collection<String> engenhariasAtuais = new ArrayList<String>();
		engenhariasAtuais.add("Telecomunicação: ");
		engenhariasAtuais.add("Biomédica: ");
		engenhariasAtuais.add("Computação: ");
		engenhariasAtuais.add("Software: ");
		engenhariasAtuais.add("Produção: ");
		
		System.out.println("Engenharias atuais: " + engenhariasAtuais);
		
		
		//2
		Collection<String> engenhariasFuturas = new ArrayList<String>();
		engenhariasFuturas.add("Mecânica: ");
		engenhariasFuturas.add("Mecatrônica: ");
		
		System.out.println("Engenharias futuras" + engenhariasFuturas);
		
		
		//3
		Collection<String> todas = new ArrayList<String>();
		todas.addAll(engenhariasAtuais);
		todas.addAll(engenhariasFuturas);
		
		System.out.println("Todas as engenharias: " + todas);
	}
	
	private static void imprimirStatusDaColecao(Collection<String> engenharias) {
		if(engenharias.isEmpty()) {
			System.out.println("Vazio");
		} else {
			System.out.println("Tem elementos");
		}
		
		//Se achar redundante, deixar apenas um if
		if(engenharias.size() == 0) {
			System.out.println("Vazio");
		} else {
			System.out.println("Tem elementos");
		}
	}
	
	//Entendendo clear():
	/*System.out.println("");
	  System.out.println(">> Entendendo clear():");
	  
	  imprimirStatusDaColecao(engenharias);
	  
	  System.out.println("...invocando clear()");
	  engenharias.clear();
	  
	  imprimirStatusDaColecao(engenharias);
	 */
}


//O método addAll() é thread-safe?
//R: Não. O método manipula os dados internos o que vai demandar um tempo para fazê-lo.
//Se outra thhread assumir o controle quando a primeira thread ainda está manipulando, os dados internos podem se tornar inconsistentes.
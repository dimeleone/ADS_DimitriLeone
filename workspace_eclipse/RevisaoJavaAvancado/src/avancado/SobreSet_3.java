package avancado;

import java.util.LinkedHashSet;

/*
 * @autor dimitri.leone
 * @since 04.04.2023
 */

public class SobreSet_3 {

	public static void main(String[] args) {
		LinkedHashSet<String> setDeFrutas = new LinkedHashSet<>();
		
		setDeFrutas.add("Laranja");
		setDeFrutas.add("Pera");
		setDeFrutas.add("Manga");
		setDeFrutas.add("Limão");
		
		System.out.println(setDeFrutas);
	}
	
}

//QUESTÃO DE "DESAFIO".
//Pergunta: Qual é a característica desta implementação?
//Resposta: Mantém a ordenação de inserção assim como a List.
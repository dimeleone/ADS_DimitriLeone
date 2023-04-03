package avancado;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/*
 * @autor dimitri.leone
 * @since 03.04.2023
 */

public class SobreCollection_1 {
	
	public static void main(String[] args) {
		Collection<String> colecao = buildCollectionImplementation();
		colecao.add("Gato");
		colecao.add("Cachorro");
		colecao.add("Leão");
		colecao.add("Pantera");
		colecao.add("Avestruz");
		
		System.out.println(colecao);
	}
	
	//Sem ordem definida
	private static HashSet<String> buildCollectionImplementation(){
		return new HashSet<String>();
	}
	
	//Em ordem alfabética
	private static TreeSet<String> buildCollectionImplementation2(){
		return new TreeSet<String>();
	}
	
	//Em ordem de inserção
	private static ArrayList<String> buildCollectionImplementation3(){
		return new ArrayList<String>();
	}
}



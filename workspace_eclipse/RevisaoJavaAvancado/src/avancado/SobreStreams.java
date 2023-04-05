package avancado;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
/*
 * @autor dimitri.leone
 * @since 05.04.2023
 */

public class SobreStreams {

	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(1L, "Cadeira", 100.0));
		produtos.add(new Produto(2L, "Cama", 400.0));
		produtos.add(new Produto(3L, "Mesa", 200.0));
		produtos.add(new Produto(4L, "Sofá", 500.0));
		produtos.add(new Produto(5L, "Cadeira", 150.0));
		
		
		//1.filter()
		List<Produto> produtosFiltrados = produtos.stream()
				.filter(p -> p.getPreco() > 300.0)
				.collect(Collectors.toList());
		produtos.forEach(System.out::println);
		
		//2.map()
		List<String> descricoes = produtos.stream()
				.map(p -> p.getDescricao())
				.collect(Collectors.toList());
		descricoes.forEach(System.out::println);
		
		//3.map() e reduce()
		Double precoTotal = produtos.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, Double::sum);
		System.out.println(precoTotal);
		
	}
}

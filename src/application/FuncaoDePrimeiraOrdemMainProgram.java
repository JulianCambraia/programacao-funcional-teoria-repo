package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Produto;

/**
 * Funções são objetos de Primeira Ordem na programação funcional
 * 
 * @author julian
 *
 */
public class FuncaoDePrimeiraOrdemMainProgram {
	
	public static int compareProdutos(Produto p1, Produto p2) {
		return p1.getPreco().compareTo(p2.getPreco());
	}

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<Produto>();
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 450.00));
		
		list.sort(FuncaoDePrimeiraOrdemMainProgram::compareProdutos);
		list.forEach(System.out::println);

	}

}

package br.com.impacta.lab;

import br.com.impacta.models.*;
import java.util.ArrayList;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		/*
		 * Transforme a tabela produto em uma classe separadas
		 * no pacote br.com.impacta.models
		 * 
		 *  
		 *  Tabela de produto
		 *  
		 *  CodigoProduto	descrição do Produto		Valor do Produto
		 * 	1				Camisa						70.00
		 * 	2				Shorts						57.50
		 * 	3				Meia						9.99
		 * 	4				Toca						35.00
		 * 	5				Luvas						19.50
		 * 
		 * -----------------------------------------------------------------
		 * 
		 * Em seguida crie um método na classe Produto onde o mesmo tenho o nome de montarResumo
		 * Exemplo de um método:
		 * public String falar(String palavra) {
		 * 	System.out.println(palavra);
		 * }
		 * 
		 * receba como parametro um Produto e devolva uma String
		 * 
		 * O retorno deve ser no seguinte formato
		 * 
		 * "codigo: <produto.codigo>, descricao: <produto.descricao>, valor: <produto.valor>"
		 * 
		 * 
		 */
		
    ArrayList<Produto> listaDeProdutos= new ArrayList();

      
		Produto produto = new Produto();
		produto.codigo = 1;
		produto.descricao = "Camisa";
		produto.valor = 70.00;

    listaDeProdutos.add(produto);
		

    Produto shorts = new Produto();
		shorts.codigo = 2;
		shorts.descricao = "Shorts";
		shorts.valor = 57.50;
		
    listaDeProdutos.add(shorts);

    Produto meia = new Produto();
		meia.codigo = 3;
		meia.descricao = "Meia";
		meia.valor = 9.99;
		
    listaDeProdutos.add(meia);

    Produto toca = new Produto();
		toca.codigo = 4;
		toca.descricao = "Toca";
		toca.valor = 35.00;
		
    listaDeProdutos.add(toca);

    Produto luvas = new Produto();
		luvas.codigo = 5;
		luvas.descricao = "Luvas";
		luvas.valor = 19.50;
		
    listaDeProdutos.add(toca);

   Produto produtoEncontrado = Produto.buscarProdutoPeloId(listaDeProdutos, 2);
	  System.out.println(produtoEncontrado.descricao);
	}

}

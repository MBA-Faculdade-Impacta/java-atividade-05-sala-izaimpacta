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

		Produto produto = new Produto();
		produto.codigo = 1;
		produto.descricao = "Camisa";
		produto.valor = 70.00;

		String resumo = produto.montarResumo(produto);

		System.out.println(resumo);
    ArrayList<Produto> listaProduto = new ArrayList();

    Produto camisa = new Produto();
    camisa.criarCodigo(1);
    //camisa.codigo = 1;
    camisa.descricao = "Camisa";
    camisa.valor = 70.00;
    listaProduto.add(camisa);

    Produto shorts = new Produto();
    shorts.criarCodigo(2);
    //shorts.codigo = 2;
    shorts.descricao = "Shorts";
    shorts.valor = 57.50;
    listaProduto.add(shorts);

    Produto luvas = new Produto();
    luvas.criarCodigo(3);
    //luvas.codigo = 2;
    luvas.descricao = "Luvas";
    luvas.valor = 60.00;
    listaProduto.add(luvas);

    for (int contador = 0; contador < listaProduto.size(); contador++) {

      Produto objetoDaLista = listaProduto.get(contador);
      if (objetoDaLista.retornaCodigo() == 100) {
        System.out.println(objetoDaLista.montarResumo());
      }
    }

    //Produto objetoDaLista = listaProduto.get(0);

    //System.out.println(objetoDaLista.montarResumo());

	}

}

package br.com.impacta.models;

import java.util.ArrayList;

public class Produto {

  public int codigo; 
  public String descricao; 
  public double valor;

  public static Produto buscarProdutoPeloId(ArrayList<Produto> listaDeProdutos, int codigoProduto) 
  { 
		for (int  contador=0; contador < listaDeProdutos.size(); contador++)
    {
      Produto produto = listaDeProdutos.get(contador);
      if ( codigoProduto == produto.codigo ) 
      {
        return produto;
      }

    }
    return null;
	}

}
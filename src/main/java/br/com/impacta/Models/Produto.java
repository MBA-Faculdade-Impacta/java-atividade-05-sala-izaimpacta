package br.com.impacta.models;

public class Produto {

  public int codigo;
  public String descricao;
  public double valor;

  public String montarResumo(){

    String resumo = "Código do produto é: " + this.codigo + " descricao: " + this.descricao + " valor: " + this.valor;

    return resumo;

  }

} 
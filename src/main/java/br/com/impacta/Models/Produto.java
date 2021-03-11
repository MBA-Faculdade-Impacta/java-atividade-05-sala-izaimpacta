package br.com.impacta.models;

public class Produto {
  public int codigo;
  public String descricao;
  public double valor;

  public String montarResumo() {
    String resumo = "Codigo do produto é: " + this.codigo + 
                      " descricao: " + this.descricao + 
                      " valor: " + this.valor;

    return resumo;
  }

  public void criarCodigo(int codigo) {
    this.codigo = codigo * 100;
  }

  public int retornaCodigo() {
    return this.codigo;
  }

} 
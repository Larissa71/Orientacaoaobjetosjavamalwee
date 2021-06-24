package br.com.senai.produto;
//CLASSE
public class Produto {
	
	//ATRIBUTOS
	private String nomeDoProduto;
	private double valorUnitarioProduto;
	private int quantidadeDoProduto;
	private double valorTotalDoProduto;
	
	//CONSTRUTOR
	public Produto() {
	}
	
	public Produto(String nomeDoProduto, double valorUnitarioProduto, int quantidadeDoProduto,
			double valorTotalDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
		this.valorUnitarioProduto = valorUnitarioProduto;
		this.quantidadeDoProduto = quantidadeDoProduto;
		this.valorTotalDoProduto = valorTotalDoProduto;
	}

	//METODOS
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public double getValorUnitarioProduto() {
		return valorUnitarioProduto;
	}
	public void setValorUnitarioProduto(double valorUnitarioProduto) {
		this.valorUnitarioProduto = valorUnitarioProduto;
	}
	public int getQuantidadeDoProduto() {
		return quantidadeDoProduto;
	}
	public void setQuantidadeDoProduto(int quantidadeDoProduto) {
		this.quantidadeDoProduto = quantidadeDoProduto;
	}
	public double getValorTotalDoProduto() {
		return valorTotalDoProduto;
	}
	public void setValorTotalDoProduto(double valorTotalDoProduto) {
		this.valorTotalDoProduto = valorTotalDoProduto;
	}

	

}

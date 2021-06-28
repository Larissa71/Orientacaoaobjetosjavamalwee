package br.com.senai.loja;

import java.util.List;
import java.util.Scanner;
import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class VendaController {
	
	private Scanner tec;
	private ProdutoController produtoController;
	private PessoaController pessoaController;
	
	public VendaController() {
		tec = new Scanner(System.in);
		produtoController = new ProdutoController();
		pessoaController = new PessoaController();
		
	}
	
	public static int leOpcao() {
		System.out.println(">");
		return tec.nextInt();
	}
	public List<Venda> listarVenda(List<Venda> vendas) {
		
		System.out.println("--- VENDAS REALIZADAS ---");
		
		System.out.printf(" | %10s | %10s | %4s | %6s | \n",
				"Cliente", "Produto", "Qtd", "Valor"
		);
		
		for(int i = 0; i< vendas.size(); i++) {
			System.out.printf("| %10s | %10s | %4s | %6.2f | \n",
					vendas.get(i).getPessoa().getNome(),
					vendas.get(i).getProduto().getNomeDoProduto(),
					vendas.get(i).getQuantidade(),
					vendas.get(i).getValor()
			);
		}
		return vendas;
	}
	
	public Venda cadastrarVenda(List<Produto> produtos, List<Pessoa> pessoas) {
		
		if(produtos.isEmpty() || pessoas.isEmpty()) {
			System.out.println("Impossível realizar vendas sem PRODUTOS ou PESSOAS cadastradas.");
			return null;
		}
		
		produtoController.listarProdutos(produtos);
		pessoaController.listarPessoas(pessoas);
		
		Venda venda = new Venda();
		Produto produto = new Produto();
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Informe o Id da pessoa: ");
		int idPessoa = tec.nextInt() - 1;
		
		pessoa.setNome(pessoas.get(idPessoa).getNome());
		pessoa.setAltura(pessoas.get(idPessoa).getAltura());
		pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
		
		venda.setPessoa(pessoa);
		int idProduto = tec.nextInt() - 1;
		
		System.out.println("Informe o Id do produto: ");
		int idPorduto = tec.nextInt();
		produto.setNomeDoProduto(produtos.get(idPorduto).getNomeDoProduto());
		produto.setQuantidadeDoProduto(produtos.get(idPorduto).getQuantidadeDoProduto());
		produto.setValorUnitarioProduto(produtos.get(idPorduto).getValorUnitarioProduto());
		produto.setValorTotalDoProduto(produtos.get(idPorduto).getValorTotalDoProduto());
		
		venda.setProduto(produto);
		
		System.out.print("Informe a quantidade desejada: ");
		venda.setValor(produto.getValorUnitarioProduto() * venda.getQuantidade());
		
		return venda;
	}
	public void menu3(List <Produto> produto ,List <Pessoa> pessoa ) {
		System.out.println("\n---MENU---");
		System.out.println("1) Cadatrar venda");
		System.out.println("2) Listar vendas");
		System.out.println("11) Sair do sistema");
		System.out.println("--------------------");
	
		boolean sair = false;
	
		do {
		int opcao = leOpcao();
		switch(opcao) {
	case 1:
		vendas.add(cadastrarVenda( produto, pessoa));
		break;
	
	case 2:
		ListarVenda(produtos);
		break;
		
		}
		}while (!sair);
		System.out.println("Sistema finalizado!");
	}
}
	


package br.com.senai;

	import java.util.ArrayList;
	import java.util.List;

import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;
import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;
	
	public class ProgramaPrincipal {
		
		public void menu() {
			System.out.println("\n---MENU PRINCIPAL---");
			System.out.println("1) Chamar Pessoa");
			System.out.println("2) Chamar Produto");
			System.out.println("3) Chamar Vendas");
			System.out.println("11) sair");
			System.out.println("--------------------");
		
		}

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Venda> vendas = new ArrayList<Venda>();

		
		Produto produto = new Produto(
				"Abacate",
				2.5,
				35,
				2.5 * 35
				);
		produtos.add(produto);
		
		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoConroller = new ProdutoController();
		VendaController vendaController = new VendaController();
		boolean sair = false;
		
		do {
			pessoaController.menu();
			
			int opcao = pessoaController.leopcao();
			switch(opcao) {
				case 1:
					pessoas.add(pessoaController.cadastrarPessoa());
					break;
					
				case 2:
					pessoaController.listarPessoas(pessoas);
					break;

				case 3:
					pessoaController.editarPessoa(pessoas);
					break;	
					
				case 11:
					sair = true;
					break;
			default:
				System.out.println("Opção invalida! ");
				break;
			}
			
		}while(!sair);
		
		System.out.println("Sistema finalizado!");
		
	}	
}


package br.com.senai;

	import java.util.ArrayList;
	import java.util.List;

import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;
	
	public class ProgramaPrincipal {


	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
		
		Produto produto = new Produto(
				"Abacate",
				2.5,
				35,
				2.5 * 35
				);
		produtos.add(produto);
		
		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoConroller = new ProdutoController();
		
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
					produtos.add(produtoConroller.cadastrarProduto());
					break;
					
				case 4:
					produtoConroller.listarProdutos(produtos);
					break;
					
				case 5: 
					produtoConroller.editarProduto(produtos);
					break;
				case 6:
					produtoConroller.excluirProduto(produtos);
					break;
				case 7:
					pessoaController.editarPessoa(pessoas);
					break;
				case 8: 
					pessoaController.excluirPessoa(pessoas);
					break;
				case 9:
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

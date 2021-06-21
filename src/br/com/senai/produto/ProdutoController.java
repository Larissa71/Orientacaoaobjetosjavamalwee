package br.com.senai.produto;
import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;

public class ProdutoController {

	private Scanner tec;
	
	public ProdutoController( ) {
		tec = new Scanner(System.in);
	}
	
	public int leopcao() {
		System.out.println("> ");
		return tec.nextInt();
	}
	public void menu() {
		System.out.println("\n---MENU---");
		System.out.println("3)cadastrar produto");
		System.out.println("4) Listar produto cadastradas");
		System.out.println("9)Sair do sistema");
		System.out.println("--------------------");
	}	
	
	public Produto cadastrarProduto() {
		Produto produto = new Produto();
		
		System.out.println("--- Cadastrar produto--- ");
		System.out.print("Informe o nome do produto: ");
		produto.setNomeDoPrdoduto(tec.next());
	
		System.out.println("Informe o valor unitário do produto: ");
		produto.setValorUnitarioProduto(tec.nextDouble());
		
		System.out.println("Informe a quantidade do produto: ");
		produto.setQuantidadeDoPrdoduto(tec.nextInt());
		
		produto.setValorTotalDoProduto(produto.getValorUnitarioProduto() * produto.getQuantidadeDoPrdoduto());
		return produto;
	}
	   	public List<Produto> listarProdutos(List<Produto> produtos) {
	   		
	   		if(produtos.isEmpty()) {
	   			System.out.println("Não possui produtos cadastrados.");
	   			return null;
	   		}
	   	 
	   		System.out.printf(" %2s |%10s | %13s | %20s | %10s\n", 
	   				"Id" , "Nome" , "Valor unitário" , "Quantidade do produto" , "Valor total do produto");
			for(int i = 0; i<produtos.size(); i++) {
				System.out.printf("%2d |%10s | %13s | %20s | %10s|\n",
				i + 1,
				produtos.get(i).getNomeDoPrdoduto(),
				produtos.get(i).getValorUnitarioProduto(),
				produtos.get(i).getQuantidadeDoPrdoduto(),
				produtos.get(i).getValorTotalDoProduto());
			}

	   	return produtos;	
 	}
	   	public List <Produto> editarProduto(List<Produto> produtos) {
	   		Produto produto = new Produto();
	   		listarProdutos(produtos);
	   		if(produtos.isEmpty() ) {
	   			return null;
	   		}
	   		
	   		System.out.println("Informe o Id do produto para ser editar: ");
	   		int idProduto = tec.nextInt() - 1;
	   		
	   		System.out.println("1) Nome do produto");
	   		System.out.println("2) Quantidade do produto");
	   		System.out.println("3) Valor unitário do produto");
	   		System.out.println("Informe o campo para ser editado:" );
	   		int opcao = tec.nextInt();
	   		
	   		switch(opcao) {
	   			case 1: 
	   				System.out.println("--- Editar nome do Produto ---");
	   				System.out.println("Informe o novo nome do produto: ");
	   				produto.setNomeDoPrdoduto(tec.next());
	   				
	   				produto.setQuantidadeDoPrdoduto(produtos.get(idProduto).getQuantidadeDoPrdoduto());
	   				produto.setValorUnitarioProduto(produtos.get(idProduto).getValorUnitarioProduto());
	   				produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
	   				
	   				produtos.set(idProduto, produto);
	   				break;
	   			case 2:
	   				System.out.println("--- Editar a quantidade de Produto ---");
	   				System.out.println("Informe a nova quantidade: ");
	   				produto.setQuantidadeDoPrdoduto(tec.nextInt());
	   				
	   				produto.setQuantidadeDoPrdoduto(produtos.get(idProduto).getQuantidadeDoPrdoduto());
	   				produto.setValorUnitarioProduto(produtos.get(idProduto).getValorUnitarioProduto());
	   				produto.setValorTotalDoProduto(produto.getValorUnitarioProduto() * produto.getQuantidadeDoPrdoduto());
	   				
	   				produtos.set(idProduto, produto);
	   				
	   				break;
	   			case 3:
	   				System.out.println("--- Editar o valor uitário de produto ---");
	   				System.out.println("Informe o valor unitario do produto: R$ ");
	   				produto.setNomeDoPrdoduto(produtos.get(idProduto).getNomeDoPrdoduto());
	   				produto.setQuantidadeDoPrdoduto(produtos.get(idProduto).getQuantidadeDoPrdoduto());
	   				produto.setValorTotalDoProduto(produto.getValorUnitarioProduto() * produto.getQuantidadeDoPrdoduto());

	   				produtos.set(idProduto, produto);	   				
                    break;
	   			default:
	   				System.out.println("opção inválida!");
	   				break;
	   		}
	   	return produtos;	
 	}
	   	public void excluirProduto(List <Produto> produtos) {
	   		
	   		listarProdutos(produtos);
	   		
	   		if(produtos.isEmpty()) {
	   			return;
	   		}
	   		System.out.println("--- EXCLUIR PRODUTO ---");
	   		
	   		System.out.println("Informe o Id do produto para exluir: ");
	   		int idProduto = tec.nextInt() - 1;
	   		
	   		if(produtos.size() <= idProduto) {
	   			System.out.println("Produto não cadastrado.");
	   			return;
	   		}
	   		
	   		produtos.remove(idProduto);
	   	}
}



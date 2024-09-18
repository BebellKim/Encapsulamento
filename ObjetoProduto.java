package Encapsulamento;

public class ObjetoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto ("Queijo Prato", 50.00);
		
		// Mostra Valores iniciais
		System.out.println(produto.getNome() + ""+ produto.getPreco());
		
		produto.setPreco (53);
		System.out.println(produto.getPreco());
		
		produto.setPreco (56);
		System.out.println(produto.getPreco());
		
		produto.setNome ("Queijo Parmesão");
		produto.setPreco (80);
		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());

	}

}

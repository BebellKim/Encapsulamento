package Encapsulamento;

public class Produto {
	
	// Atributos privados
	private String nome;
	private double preco;
	
	// contrutor
	public Produto(String nome, double preco) {
		this.nome = nome;
		setPreco(preco);
	}
	
	// getter para o nome
	public String getNome() {
		return nome;
	}
	
	// Setter para o nome
	public void setNome (String nome) {
	this.nome = nome;
	}
	
	// Getter para o preço
	public double getPreco() {
	return preco;
	}
	
	
	// Setter para o preço com validação
	public void setPreco (double preco) {
	if (preco >= 0) {
	this.preco = preco;
	} else {
		
	System.out.println("Preço inválido! Não pode ser negativo");
	}
	}
	
	// Método para exibir informações do produto
	public void exibirInformacoes() {
	System.out.println("Produto: "+ nome + "Preço:" + preco);
			
	}
	}
	
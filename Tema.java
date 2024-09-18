package Encapsulamento;

public class Tema {

	private String nome;
	private double valorAluguel;
	private int id;
	private String corToalha;
	
	public Tema () {}
	public Tema (String nome, double valorAluguel, int id, String corTolha) {
		this.nome = nome;
		this.corToalha = corTolha;
		this.id = id;
		this.valorAluguel = valorAluguel;
	}
	
	public String getNome () {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getCorToalha () {
		return corToalha;
	}
	public void setCorToalha (String corToalha) {
		this.corToalha = corToalha;
	}
	
	public double getValorAluguel () {
		return valorAluguel;
	}
	public void setvalorAluguelalorAluguel (double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	
	public int getId () {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}
}


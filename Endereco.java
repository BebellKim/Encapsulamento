package Encapsulamento;

public class Endereco {

	private int id,numero;
	private String logradouro,complemento,bairro,cidade,cep,uf;
	public Endereco () {
	}

	public Endereco (String logradouro,String complemento,String bairro,String cidade,String cep,String uf, int id, int numero ) {
		this.logradouro=logradouro;
		this.complemento=complemento;
		this.bairro=bairro;
		this.cidade=cidade;
		this.cep=cep;
		this.uf=uf;
		this.id=id;
		this.numero=numero;
	}

	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro=logradouro;
	}

	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento=complemento;
	}

	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro=bairro;
	}

	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade=cidade;
	}

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep=cep;
	}

	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf=uf;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero=numero;
	}
	public void exibirInformacoes() {
		System.out.println(" Id: "+ id + " Numero: " + numero + " Longradouro: " + logradouro +" Complemento "+ complemento + " Bairo"+ bairro + " Cidade: "+ cidade + " CEP: "+ cep + " UF: "+uf);
	}
}


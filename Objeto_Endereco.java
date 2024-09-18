package Encapsulamento;

public class Objeto_Endereco {

	public static void main(String[] args) {
		Endereco end1= new Endereco ("Rodovia Raposo Tavares","- do Km 160,000 ao Km 168,000","Vila Nova Itapetininga","Itapetininga","18203-340","São Paulo",123456978,817);
		Endereco end2= new Endereco ();
		
		end1.exibirInformacoes();
		
		System.out.println("Endereço 1: ");
		System.out.println("Logradouro: "+end1.getLogradouro());
		System.out.println("Complemento: "+end1.getComplemento());
		System.out.println("Bairro: "+end1.getBairro());
		System.out.println("Cidade: "+end1.getCidade());
		System.out.println("CEP: "+end1.getCep());
		System.out.println("UF: "+end1.getUf());
		System.out.println("ID: "+end1.getId());
		System.out.println("Numero: "+end1.getNumero());
		System.out.println("Endereço 2: ");
		
		end2.setLogradouro("Estrada de São Bento");
		end2.setComplemento("- de 4500 a 6800 - lado par");
		end2.setBairro("Pium");
		end2.setCidade("Itaquaquecetuba");
		end2.setCep("08591-840");
		end2.setUf("São Paulo");
		end2.setId(764131);
		end2.setNumero(23);
		
		System.out.println("Logradouro: "+end2.getLogradouro());
		System.out.println("Complemento: "+end2.getComplemento());
		System.out.println("Bairro: "+end2.getBairro());
		System.out.println("Cidade: "+end2.getCidade());
		System.out.println("CEP: "+end2.getCep());
		System.out.println("UF: "+end2.getUf());
		System.out.println("ID: "+end2.getId());
		System.out.println("Numero: "+end2.getNumero());

	}

}


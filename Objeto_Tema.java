package Encapsulamento;

public class Objeto_Tema {

	public static void main(String[] args) {
		Tema tema = new Tema ("isa",1000, 101, " branca " ) ;
		Tema tema1 = new Tema () ;
		
		System.out.println ("cor da toalha: " + tema.getCorToalha());
		System.out.println ("identificação: " + tema.getId());
		System.out.println ("Nome: " + tema.getNome());
		System.out.println ("Valor aluguel: " + tema.getValorAluguel());
		tema1.setCorToalha("Rosa");
		tema1.setId(101);
		tema1.setNome("isa");
		tema1.setvalorAluguelalorAluguel(1000);
		System.out.println ("----------------------------------------------");
		System.out.println ("cor da toalha: " + tema1.getCorToalha());
		System.out.println ("identificação: " + tema1.getId());
		System.out.println ("Nome: " + tema1.getNome());
		System.out.println ("Valor aluguel: " + tema1.getValorAluguel());
	}

}



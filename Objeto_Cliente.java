package Encapsulamento;

public class Objeto_Cliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente ("Isabella", 34567, "123456789", "98765432", "78643287");
		cliente.setNome("Nome: Isabella");
		System.out.println(cliente.getNome());
		cliente.setId(4567);
		System.out.println(cliente.getId());
		cliente.setTelefone( "Telefone: 123456789");
		System.out.println(cliente.getTelefone());
		cliente.setCpf("Cpf: 98765432");
		System.out.println(cliente.getCpf());
		cliente.setRg("Rg: 78643287");
		System.out.println(cliente.getRg());


}

}

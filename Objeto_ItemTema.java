package Encapsulamento;

public class Objeto_ItemTema {

	public static void main(String[] args) {
		
		Item_tema item = new Item_tema ("Computador", "bom", 123456789);
		Item_tema item1 = new Item_tema ("notbook", "ótimo", 987654321);
		
		item.exibirInformacoes ();
		item1.exibirInformacoes ();


	}

}

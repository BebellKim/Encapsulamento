package Encapsulamento;

public class Item_tema {
	
	// Atributos privados
		private String nome;
		private String descricao;
		private int id;
		
		// contrutor
		public Item_tema(String nome,String descricao, int id) {
			this.nome = nome;
			setDescricao(descricao);
			setId(id);
		}
		
		// getter para o nome
		public String getNome() {
			return nome;
		}
		
		// Setter para o nome
		public void setNome (String nome) {
		this.nome = nome;
		}
		
		// getter para o descricao
				public String getDescricao() {
					return descricao;
				}
				
				// Setter para o descricao
				public void setDescricao(String descricao) {
				this.descricao = descricao;
				}
		// Getter para o id
		public int getId() {
		return id;
		}
		
		// Setter para o id
		public void setId(int id) {
		this.id = id;
		}
		
		// Método para exibir informações do produto
		public void exibirInformacoes() {
		System.out.println("Nome: "+ nome + " Descrição: " + descricao + " Id: " +id );
				
		}
		}


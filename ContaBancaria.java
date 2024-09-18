package Encapsulamento;

public class ContaBancaria {
	//Atributo privado
	private double saldo;

	// Cosntrutor para inicializar o saldo
	public ContaBancaria(double saldoInicial) {
		if (saldoInicial >=0) {
			this.saldo= saldoInicial;
		}else {
			this.saldo =  0;
		}
	}

	//Getter para o saldo
	public double getSaldo() {
		return saldo;

	}
	//metodo para depositar dinheiro (só aceita valores positivos)
	public void depositar(double valor) {
		if (valor > 0) {
			saldo +=valor;
		}else {
			System.out.println("Valor de depósito invalido!");
		}
	}

	// metodo para sacardinheiro (não pode secar mais do que o saldo)
	public  void sacar (double valor) {
		if (valor > 0 && valor <= saldo ) {
			saldo -= valor;

		} else {
			System.out.println("Saque inválido! Verifique o valor.");
		}
	}
}

package entidade;

public class ContaPoupanca extends Conta {
//extends faz ela herdar da classe conta
	public ContaPoupanca(String nome, int numero, double saldo) {
		super(nome, numero, saldo);
	}

	@Override
	public String toString() {
		return "ContaPoupanca " + mostrar();
	}
	
	

}

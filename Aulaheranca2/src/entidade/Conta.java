package entidade;

public class Conta {
	private String nome;
	private int numero;
	private double saldo;
	//             ||||
	//Constructors VVVV
	public Conta(String nome, int numero, double saldo) {
		
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
	//cria o método sacar
	public void sacar(double saque) {
		saldo = saque - saque;
	}
	//Cria método para depositar
	public void depositar(double deposito) {
        saldo = saldo + deposito;
	}
	//Cria método para mostrar o que você tem
	public String mostrar() {
	//Retorna o que você tem
	return " O nome é "+ nome + " o saldo é " + saldo;	
	}
}
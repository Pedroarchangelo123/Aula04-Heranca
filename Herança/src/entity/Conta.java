package entity;
import entity.enums.Cores;
public class Conta {


		
		private String nome;
		private int numero;
		private double saldo;
		private Cores cor;
		public Conta(String nome, int numero, double saldo, Cores cor) {
			this.nome = nome;
			this.numero = numero;
			this.saldo = saldo;
			this.cor = cor;
			
		}
			public String toString() {
				return "Conta [nome=" + nome + ", numero=" + numero + ", saldo=" + saldo + "]";
			}
			public double getsaldo() {
				return saldo;
			}
			public void setsaldo(int saldo) {
				this.saldo = saldo;
			
		}
			public double Saque(double deposito) {
				saldo = saldo- (deposito +5) ;
				
				return saldo;
			}
			public double deposito(double insert) {
				saldo += insert ;
				
				return saldo;
			
	
	}

}

package entity;

import entity.enums.Cores;

public class ContaComercial extends Conta {
private double limit;




public ContaComercial(String nome, int numero, double saldo, Cores cor, double limit) {
	super(nome, numero, saldo, cor);
	this.limit = limit;
}


public String agua() {
	return toString() + "ContaComercial [limit=" + limit + "]";
}


public double getLimit() {
	return limit;
}


public void setLimit(double limit) {
	this.limit = limit;
}
	
	
	

}

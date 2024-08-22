package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.ContaCorrente;
import entidade.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bem Vindo");
        Scanner scn = new Scanner(System.in);
        List<Conta> lista = new ArrayList<>();
        
        System.out.println("Quantas contas você deseja cadastrar, patrão?");
        int amount = scn.nextInt();
        for(int i= 1 ; i <= amount ; i++) {
        	System.out.println("Digite C para Conta Corrente ou P para Poupança");
        	String x = scn.next();
        	if(x.equals("C")) {
        		System.out.println("Digite seu nome" + i);
        		String name = scn.next();
        		System.out.println("Digite o número da conta: ");
        		int number = scn.nextInt();
        		System.out.println("Digite o saldo da conta: ");
        		double balance = scn.nextInt();
        		System.out.println("Digite o limite da conta: ");
        		int limit = scn.nextInt();
    
        		
        	Conta conta = new ContaCorrente(name, number, balance, limit);	
        	lista.add(conta);
        	}
        	else {
        		System.out.println("Digite seu nome" + i);
        		String name = scn.next();
        		System.out.println("Digite o número da conta: ");
        		int number = scn.nextInt();
        		System.out.println("Digite o saldo da conta: ");
        		double balance = scn.nextInt();
        		Conta poupança = new ContaPoupanca(name, number, balance);
        		lista.add(poupança);
        	}

        		
        	}
        	System.out.println(lista);
        }
	}



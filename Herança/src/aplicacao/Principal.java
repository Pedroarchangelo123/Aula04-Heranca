package aplicacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Conta;
import entity.ContaComercial;
import entity.ContaPoupança;
import entity.enums.Cores;
public class Principal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Qual conta você quer ver");
		String Contas = scn.next();
		ContaComercial cc = new ContaComercial("Pedro", 764, 0, Cores.BLACK,0);
		ContaPoupança cc1 = new ContaPoupança("Wellington", 763, 0, Cores.RED);
		cc.deposito(100);
		//System.out.println(cc.agua());
		List<Conta> lista = new ArrayList<>();
        lista.add(cc);
        lista.add(cc1);
        System.out.println(lista.get(0));
        for(Conta e : lista) {
			if(Contas.contains(("Comercial").toLowerCase())) {
				System.out.println(lista.get(0));
				break;
				
			}else if(Contas.contains(("Poupança").toLowerCase())) {
				System.out.println(lista.get(1));
				break;
			}
			
		} 
       
	}

}

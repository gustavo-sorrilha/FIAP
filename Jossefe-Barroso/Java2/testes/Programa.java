package testes;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	       
        ContaCorrente cc = new ContaCorrente();
       
        cc.setAgencia("0001");
        cc.setNumero("14769");
        cc.setSaldo(100);
       
        cc.setChequeEspecial(500);
       
        System.out.printf("Conta Corrente: Ag: %s, Num: %s, Saldo: %.2f, Chq Esp: %.2f", cc.getAgencia(), cc.getNumero(), cc.getSaldo(), cc.getChequeEspecial() );
       
       
       
        ContaPoupanca cp = new ContaPoupanca();
       
        cp.setAgencia("0002");
        cp.setNumero("32456");
        cp.setSaldo(2000);
       
        cp.setRentabilidade(2);
       
        System.out.printf("\n\n\nConta Poupança: Ag: %s, Num: %s, Saldo: %.2f, Rent: %.2f", cp.getAgencia(), cp.getNumero(), cp.getSaldo(), cp.getRentabilidade() );
        
        ContaSalario cs = new ContaSalario();
        
        cs.setAgencia("0002");
        cs.setNumero("32456");
        cs.setSaldo(2000);
       
        cs.setReceberSalario(2);
       
        System.out.printf("\n\n\nConta Salário: Ag: %s, Num: %s, Saldo: %.2f, Rent: %.2f", cp.getAgencia(), cp.getNumero(), cp.getSaldo(), cp.getReceberSalario() );
    }
	
 
}

		

	
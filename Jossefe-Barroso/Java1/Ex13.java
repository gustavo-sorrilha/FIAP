package Aula;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	       
        double v1, v2, v3;
        
        System.out.printf("Digite um número:  ");
        v1 = ler.nextDouble();
       
        System.out.printf("Digite um número:  ");
        v2 = ler.nextDouble();
        
        System.out.printf("Digite um número:  ");
        v3 = ler.nextDouble();
        
        if (v1>v2 && v1>v3) {
        	System.out.printf("O maio valor é o: %f",v1);
 
        }
        if (v2>v1 && v2>v3) {
        	System.out.printf("O maio valor é o: %f",v2);	
        }
        if (v3>v1 && v3>v3) {
        	System.out.printf("O maio valor é o: %f",v3);	
        } 
        
	}
}
 
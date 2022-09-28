package Aula;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1, v2, v3;
	       
		 System.out.printf("Digite um número:  ");
	        v1 = ler.nextDouble();
	       
	        System.out.printf("Digite um número:  ");
	        v2 = ler.nextDouble();
	        
	        System.out.printf("Digite um número:  ");
	        v3 = ler.nextDouble();
	        
	        if ((v1 + v2 < v3) || (v1 + v3 < v2) || (v2 + v3 < v1)){
	        	 System.out.printf("Não é um triângulo");

	        }
	        else if ((v1 == v2) && (v1 == v3)){
	        	 System.out.printf("Equilatero");

	        }
	        else if ((v1 == v2) || (v1 == v3) || (v2 == v3)){
	        	 System.out.printf("Isosceles");

            }
            else {
	        	 System.out.printf("Escaleno");
            } 
	        
	}
}
 
	



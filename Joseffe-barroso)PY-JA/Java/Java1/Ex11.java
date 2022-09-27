package Aula;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	       
        double h, b, r;
        
        System.out.printf("Digite o número da altura: ");
        h = ler.nextDouble();
       
        System.out.printf("Digite o número da base: ");
        b = ler.nextDouble();
        
        r = h * b;
       
       
       
        if (r > 100) {
            System.out.printf("O retangulo tem uma área de: %f \n",r );
            System.out.printf("Terreno Grande");
        }else {   
        	System.out.printf("O retangulo tem uma área de: %f",r);
        }
    }
    





	}



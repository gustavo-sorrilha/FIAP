package Aula;

import java.util.Scanner;

public class Ex182 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
       Double a,v1,t,V;
       
       System.out.printf("Digite a aceleração:  ");
		a = ler.nextDouble();
		System.out.printf("Digite a velocidade inicial (s):  ");
		v1 = ler.nextDouble();
		System.out.printf("Digite o tempo (s): ");
		t = ler.nextDouble();
		
		V = v1 + (a * t);
		
		if (V < 40)
			System.out.printf("Veiculo muito lento");
		}else ((V < 60)) {
			System.out.printf("Veiculo permitida ");
		}else (V < 80) {
			System.out.printf("Velocidade de cruzeiro ");
		}else (V < 120) {
			System.out.printf("Veiculo rápido");
		} else;
		    System.out.printf("Veiculo muito rapido");
	   }
		
	}


package Aula;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
Double a,p,imc;
String s;
		
		System.out.printf("Digite o sexo (M/F):  ");
		s = ler.next();
		System.out.printf("Digite a altura (m):  ");
		a = ler.nextDouble();
		System.out.printf("Digite o peso (kg): ");
		p = ler.nextDouble();
		
		imc = p/(a * a);
				
	if	(s == "M") {
		if (imc<20) {
			System.out.printf("Abaixo do peso");
		} else if (imc < 25) {
			System.out.printf("Peso ideal");
		} else {
			System.out.printf("Acima do peso");
		}
		
		
	}
	
	if (s == "F") {
		if (imc<19) {
            System.out.printf("Abaixo do peso");
            } else if (( imc < 24)) {
            	System.out.printf("Peso ideal");
			} else {
				System.out.printf("Acima do peso");
			}
	}
}
}

	
		
		
	


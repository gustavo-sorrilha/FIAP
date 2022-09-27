package Aula;

import java.util.Scanner;

public class Ex10 {
 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        double v1, v2;
        
        System.out.printf("Digite a nota da V1: ");
        v1 = ler.nextDouble();
       
        System.out.printf("Digite a nota da V2: ");
        v2 = ler.nextDouble();
       
       
       
        if (v1 > v2) {
            System.out.printf("O primeiro valor é o maior ");
        } else if (v1 == v2) {   
        	System.out.printf("Os números são idênticos");
            
        }else {   
        	System.out.print("O segundo valor é o maior");
        }
    }
    


}

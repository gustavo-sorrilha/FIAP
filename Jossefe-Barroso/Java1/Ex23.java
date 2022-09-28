package Aula; 

import java.util.Scanner;

class Ex23 {

   public static void main(String[] args) {

       System.out.print("A: ");

       Scanner aVal = new Scanner (System.in);

       int a = aVal.nextInt();

       System.out.print("B: ");

       Scanner bVal = new Scanner (System.in);

       int b = bVal.nextInt();

       System.out.print("C: ");

       Scanner cVal = new Scanner (System.in);

       int c = cVal.nextInt();

       int soma = a+b;

           if (soma>c){

               System.out.println("Soma: "+soma);

               System.out.println("A+B > C");

           }

           else if (soma<c){

               System.out.println("Soma: "+soma);

               System.out.println("A+B < C");

           }

           else {

               System.out.println("Soma: "+soma);

               System.out.println("A+B = C");

           }

   }


	}



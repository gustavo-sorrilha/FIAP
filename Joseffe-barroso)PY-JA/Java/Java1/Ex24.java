package Aula;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

 public class Ex24 {

     public static void main (String[] args){

        Scanner leituraNome = new Scanner(System.in);
        System.out.println("Nome: ");

        String nome = leituraNome.nextLine();

        Scanner leituraSexo = new Scanner(System.in);
        System.out.println("Qual o seu sexo: M ou F? ");

        String sexo = leituraSexo.nextLine();

        Scanner leituraEstadoCivil = new Scanner(System.in);
        System.out.println("Seu estado civil: Casada (C) ou Solteira (S)? ");

        String estadoCivil = leituraEstadoCivil.nextLine();
        // int respostaEstadoCivil = Integer.parseInt(estadoCivil);

        if(sexo.equals("F") && estadoCivil.equals("C")){
            Scanner leituraTempo = new Scanner(System.in);
            System.out.println("Quantos anos casada? ");

            String casada = leituraTempo.nextLine();
            int anosCasada = Integer.parseInt(casada);

            System.out.println("Voce esta casada a " + anosCasada);
        }
     }
 
	}



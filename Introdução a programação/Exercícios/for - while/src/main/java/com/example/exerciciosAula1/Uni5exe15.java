package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "";
        String alternativa = "";
        double media = 0;
        do{
            System.out.println("Digite o nome do aluno");
            nome = scan.nextLine();
            System.out.println("Digite a sua primeira nota: ");
            double nota = scan.nextDouble();
            System.out.println("Digite a sua segunda nota: ");
            double nota2 = scan.nextDouble();
            
            media = (nota + nota2) / 2;
            System.out.println("As média do aluno " + nome + " foi de: " + media);
            System.out.println("Digite fim para sair ou aperte 'Enter' para continuar");
            alternativa = scan.next();
        }while(!alternativa.equals("fim"));


        scan.close();
    }
}

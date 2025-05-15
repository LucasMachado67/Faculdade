package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe24 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite em Kg a quantidade permitida para ser pescada por dia");
        int pesoTotalPermitido = scan.nextInt();
        int pesoTotalPeixe = 0;
        int pesoPorPeixe = 0;
        String continuar = "";
        while (true) {
            System.out.println("Digite o peso do peixe em gramas:");
            pesoPorPeixe = scan.nextInt();

            if ((pesoTotalPeixe + pesoPorPeixe) / 1000 > pesoTotalPermitido) {
                System.out.println("O peixe ultrapassou o limite permitido.");
                break;
            }

            pesoTotalPeixe += pesoPorPeixe;

            System.out.println("Deseja informar o peso de mais um peixe? s (SIM) / n (NÃO):");
            continuar = scan.next().toLowerCase();

            if (continuar.equals("n")) {
                break;
            }
        }

        System.out.println("Peso total pescado: " + (pesoTotalPeixe / 1000.0) + " Kg");
        scan.close();
    }
}

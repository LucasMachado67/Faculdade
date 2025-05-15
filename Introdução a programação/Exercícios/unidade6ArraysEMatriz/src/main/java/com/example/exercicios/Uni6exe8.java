package com.example.exercicios;

import java.util.Scanner;

public class Uni6exe8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de valores:");
        int n = scan.nextInt();

        if (n < 1 || n > 20) {
            System.out.println("Valor inválido");
            scan.close();
            return;
        }

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = scan.nextDouble();
        }

        System.out.println("\nValor\tOcorrências");

        for (int i = 0; i < n; i++) {
            boolean contado = false;

            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    contado = true;
                    break;
                }
            }

            if (!contado) {
                int contador = 1;
                for (int j = i + 1; j < n; j++) {
                    if (vetor[i] == vetor[j]) {
                        contador++;
                    }
                }
                System.out.println(vetor[i] + "\t" + contador);
            }
        }

        scan.close();


        scan.close();

    }
}

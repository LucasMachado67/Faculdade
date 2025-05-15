package com.example.exercicios;

import java.util.Scanner;

public class Uni6exe7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor menor que 20 posições");
        int tamanho = scan.nextInt();

        if (tamanho > 20) {
            scan.close();
            return;
        }
        int[] vetorInt = new int[tamanho];

        for (int i = 0; i < vetorInt.length; i++) {
            System.out.println("Digite o " + i + "º valor: ");
            int valor = scan.nextInt();
            boolean repetido = false;
            for (int j = 0; j < i; j++) {
                if (vetorInt[j] == valor) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("Valor já inserido. Digite outro.");
                i--;
            } else {
                vetorInt[i] = valor;
            }
        }

        boolean trocou;
        int n = vetorInt.length;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (vetorInt[i] > vetorInt[i + 1]) {
                    int temp = vetorInt[i];
                    vetorInt[i] = vetorInt[i + 1];
                    vetorInt[i + 1] = temp;
                    trocou = true;
                }
            }
            n--;
        } while (trocou);

        System.out.print("Vetor ordenado: ");
        for (int num : vetorInt) {
            System.out.print(num + " ");
        }

        scan.close();
    }
}

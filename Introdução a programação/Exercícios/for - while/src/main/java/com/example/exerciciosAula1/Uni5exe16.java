package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double mediaHomem = 0;
        double mediaMulher = 0;
        double mediaOutro = 0;
        double somaHomem = 0;
        double somaMulher = 0;
        double somaOutros = 0;
        int quantidadeHomem = 0;
        int quantidadeMulher = 0;
        int quantidadeOutros = 0;

        double altura = 1;
        System.out.println("------Calculo da média da altura de um grupo------");
        while (altura != 0) {
            System.out.println("Digite M para Homem, Digite F para Mulher, digite O para Outros");
            String letra = scan.next().toUpperCase();
            switch (letra) {
                case "M":
                    System.out.println("digite a altura do homem");
                    altura = scan.nextDouble();
                    somaHomem += altura;
                    quantidadeHomem++;
                    break;
                case "F":
                    System.out.println("digite a altura do mulher");
                    altura = scan.nextDouble();
                    somaMulher += altura;
                    quantidadeMulher++;
                    break;
                case "O":
                    System.out.println("digite a altura do outros");
                    altura = scan.nextDouble();
                    somaOutros += altura;
                    quantidadeOutros++;
                    break;

                default:
                System.out.println("Letra Inválida");
                    break;
            }
        }
        mediaHomem = somaHomem / quantidadeHomem;
        mediaMulher = somaMulher / quantidadeMulher;
        mediaOutro = somaOutros / quantidadeOutros;
        System.out.println("A média de homens foi de: " + mediaHomem);
        System.out.println("A média de mulheres foi de: " + mediaMulher);
        System.out.println("A média de outros foi de: " + mediaOutro);

        scan.close();
    }
}

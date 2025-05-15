package com.example.exercicios;

import java.util.Scanner;

public class Uni6exe9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] dados = new int[30][3];

        for (int i = 0; i < dados.length; i++) {
            System.out.println("Digite o seu sexo: 1-feminino, 2-masculino");
            dados[i][0] = scan.nextInt();
            System.out.println("Digite a sua nota de 1 a 10");
            dados[i][1] = scan.nextInt();
            System.out.println("Digite a sua idade");
            dados[i][2] = scan.nextInt();
        }

        int somaNotas = 0;
        int somaNotasHomens = 0;
        int qtdHomens = 0;
        int menorIdadeMulher = Integer.MAX_VALUE;
        int notaMulherMaisJovem = -1;
        int mulheresMais50NotaAlta = 0;
        for (int i = 0; i < dados.length; i++) {
            int sexo = dados[i][0];
            int nota = dados[i][1];
            int idade = dados[i][2];

            somaNotas += nota;

            if (sexo == 2) {
                somaNotasHomens += nota;
                qtdHomens++;
            } else if (sexo == 1) {
                if (idade < menorIdadeMulher) {
                    menorIdadeMulher = idade;
                    notaMulherMaisJovem = nota;
                }
            }
        }

        double mediaGeral = (double) somaNotas / dados.length;
        double mediaHomens = qtdHomens > 0 ? (double) somaNotasHomens / qtdHomens : 0;

        for (int i = 0; i < dados.length; i++) {
            int sexo = dados[i][0];
            int nota = dados[i][1];
            int idade = dados[i][2];

            if (sexo == 1 && idade > 50 && nota > mediaGeral) {
                mulheresMais50NotaAlta++;
            }
        }

        System.out.printf("\nNota média geral: %.2f\n", mediaGeral);
        System.out.printf("Nota média dos homens: %.2f\n", mediaHomens);
        System.out.println("Nota da mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println(
                "Quantidade de mulheres com mais de 50 anos que deram nota acima da média: " + mulheresMais50NotaAlta);

        scan.close();
    }
}

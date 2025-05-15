package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double alturaAtleta = 0;
        double alturaMaisBaixo = Double.MAX_VALUE;
        double alturaMaisAlto = 0;
        int quantidadeAtletas = 0;
        int numeroIns = 0;
        int numeroInsDoAtletaMaisAlto = 0;
        int numeroInsDoAtletaMaisBaixo = 100000;
        double somaAltura = 0;
        while (true) {
            System.out.println("Digite o número de inscrição do atleta (0 para encerrar):");
            numeroIns = scan.nextInt();

            if (numeroIns == 0) {
                break;
            }

            System.out.println("Digite a altura do atleta:");
            alturaAtleta = scan.nextDouble();

            if (alturaAtleta > alturaMaisAlto) {
                alturaMaisAlto = alturaAtleta;
                numeroInsDoAtletaMaisAlto = numeroIns;
            }

            if (alturaAtleta < alturaMaisBaixo) {
                alturaMaisBaixo = alturaAtleta;
                numeroInsDoAtletaMaisBaixo = numeroIns;
            }

            somaAltura += alturaAtleta;
            quantidadeAtletas++;
        }
        double media = somaAltura / quantidadeAtletas;

        System.out.println("a média de altura dos atletas foi de: " + media);
        System.out.println("O atleta mais baixo tem " + alturaMaisBaixo + " m e o seu número de inscrição é " + numeroInsDoAtletaMaisBaixo);
        System.out.println("O atleta mais alto tem " + alturaMaisAlto + " m e o seu número de inscrição é " + numeroInsDoAtletaMaisAlto);
        
        scan.close();
    }
}

package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe30 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor inicial da sequência (N): ");
        int N = scan.nextInt();

        System.out.print("Digite o decremento (K): ");
        int K = scan.nextInt();

        System.out.print("Digite o tamanho da mochila (M): ");
        int M = scan.nextInt();

        int valorAtual = N;
        int capacidadeAtual = 0;
        int somaMochila = 0;
        int somaFora = 0;

        String elementos = "";
        String entrou = "";
        String ficouFora = "";

        while (valorAtual > 0) {
            elementos += valorAtual + " ";

            if (capacidadeAtual + valorAtual <= M) {
                entrou += valorAtual + " ";
                capacidadeAtual += valorAtual;
                somaMochila += valorAtual;
            } else {
                ficouFora += valorAtual + " ";
                somaFora += valorAtual;
            }

            valorAtual -= K;
        }

        System.out.println("Elementos a serem colocados na mochila: " + elementos);
        System.out.println("Elementos que entraram na mochila: " + entrou);
        System.out.println("Elementos que ficaram fora da mochila: " + ficouFora);
        System.out.println("Soma dos elementos que entraram na mochila: " + somaMochila);
        System.out.println("Soma dos elementos que ficaram fora da mochila: " + somaFora);

        scan.close();
    }
}

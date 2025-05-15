package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0;
        int quantidadeIterações = scan.nextInt();
        int numerosPositivos = 0, numeroNegativo = 0;
        int quantidadeNumerosPositivos = 0;
        for (int i = 0; i < quantidadeIterações; i++) {
            n =  scan.nextInt();
            if(n >= 0){
                numerosPositivos += n;
                quantidadeNumerosPositivos++;
            }
            if(n < numeroNegativo){
                numeroNegativo = n;
            }
        }
        double media = numerosPositivos / quantidadeNumerosPositivos;

        System.out.println("A média dos números positivos são: " + media);
        System.out.println("O menor número negativo é: " + numeroNegativo);

        scan.close();
    }
}

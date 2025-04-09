package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        double valores = 0;
        double valorMaior = 0;
        double valorMenor = 1000000000;
        for (int i = 0; i < num; i++) {
            System.out.println("Digite um número real: ");
            valores = scan.nextDouble();
            if(valores > valorMaior){
                valorMaior = valores;
            }
            if(valores < valorMenor){
                valorMenor = valores;
            }
        }
        System.out.println("O maior valor foi de: " + valorMaior);
        System.out.println("O menor valor foi de: " + valorMenor);

        scan.close();
    }
}

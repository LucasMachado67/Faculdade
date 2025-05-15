package com.example.exercicios;

import java.util.Scanner;

public class Uni6exe3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] vetorReal = new double[12];

        for(int i = 0; i < vetorReal.length; i++){
            System.out.println("Digite o " + i + "º valor: ");
            double valor = scan.nextDouble();
            vetorReal[i] = valor;
        }

        for(int i = 0; i < vetorReal.length; i++){

            if(i % 2 == 0){
                vetorReal[i] = vetorReal[i] * 1.02;
            }else{
                vetorReal[i] = vetorReal[i] * 1.05;
            }
        }

        for(double numero : vetorReal){
            System.err.println(numero);
        }
        scan.close();
    }
}

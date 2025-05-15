package com.example.exercicios;

import java.util.Scanner;

public class Uni6exe2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double[] vetorReal = new double[12];

        for(int i = 0; i < vetorReal.length; i++){
            System.out.println("Digite o " + i + "º valor: ");
            double valor = scan.nextDouble();
            vetorReal[i] = valor;
        }

        double media = 0;
        for(double numero : vetorReal){
            media += numero;
        }

        media = media / vetorReal.length;
        System.out.println("A média é de: " + media);
        for(double numero : vetorReal){
            if(numero > media){
                System.out.println("O número: " + numero + " é maior que a média");
            }
        }
        scan.close();
    }
}

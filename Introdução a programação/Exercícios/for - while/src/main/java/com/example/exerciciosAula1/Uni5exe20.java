package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tempo = 0;
        System.out.println("Digite o peso");
        double pesoInicial = scan.nextDouble();
        double pesoFinal = 1000000;

        while(pesoFinal > 0.5){
            
            for(int i = 0; i < 50; i++){
                tempo+=1;
                System.out.println(i + " segundo(s)");
            }

            pesoInicial = pesoInicial / 2;
            pesoFinal = pesoInicial;
            System.out.println("Peso: " + pesoInicial);
        }

        System.out.println("O tempo foi de: " + tempo + " segundos");
        System.out.println("O pesoFinal foi de: " + pesoFinal);

        scan.close();
    }
}

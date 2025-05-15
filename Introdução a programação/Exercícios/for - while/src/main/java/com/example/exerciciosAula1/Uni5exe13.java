package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double quilolemtragem;
        double combustivel;
        double parada = 1;
        double mediaParada;
        double totalCombustivel = 0;
        double totalKm = 0;
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Digite a quilometragem da parada " + parada + ":");
            quilolemtragem = scan.nextInt();
            System.out.println("Digite a quantidade de combustivel abastecido na parada " + parada + ":");
            combustivel = scan.nextInt();
            mediaParada = quilolemtragem / combustivel;
            System.out.println(mediaParada+"Km por litro");
            totalCombustivel += combustivel;
            totalKm += quilolemtragem;
        }

        double media = totalKm / totalCombustivel;
        System.out.println("Quilometragem média obtida por litro é de: " + media);

        scan.close();
    }
}

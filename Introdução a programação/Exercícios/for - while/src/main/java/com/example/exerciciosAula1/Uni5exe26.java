package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe26 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor máximo para ser pago em pedágio");
        double valorMaximo = scan.nextDouble();
        double valorPedagio = 0;
        int distancia= 0;
        int quantidadeTrechosAcima150Km = 0;
        int quantidadeTrechos = 0;
        int trechoEvitados = 0;

        do {
           
            System.out.println("Digite o preço do pedágio");
            valorPedagio = scan.nextDouble();
            if(valorPedagio < 0){
                scan.close();
                break;
            }else{
                System.out.println("Digite a distância do pedágio");
                distancia = scan.nextInt();
            }
            quantidadeTrechos++;
            if(valorPedagio > valorMaximo){
                System.out.println("Trecho evitado");
                trechoEvitados++;
            }

            if(distancia >= 150 && valorPedagio <= valorMaximo){
                quantidadeTrechosAcima150Km++;
            }

        } while (true);

        System.out.println("A quantidade de trechos evitados foi de: " + trechoEvitados);
        System.out.println("A quantidade de trechos informados foi de: " + quantidadeTrechos);
        System.out.println("A quantidade de trechos acima de 150Km foi de: " + quantidadeTrechosAcima150Km);
    }
}

package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe29 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da compra");
        double valor = scan.nextDouble();
        int quantidadeUsada = 0;

        while(valor > 0){

            if(valor >= 20){
                System.out.println("Cedula de 20 reais usada");
                valor = valor - 20;
                quantidadeUsada++;
            }else if(valor >= 10){
                System.out.println("Cedula de 10 reais usada");
                valor = valor - 10;
                quantidadeUsada++;
            }else if(valor >= 5){
                System.out.println("Cedula de 5 reais usada");
                valor = valor - 5;
                quantidadeUsada++;
            }else if(valor >= 2){
                System.out.println("Cedula de 2 reais usada");
                valor = valor - 2;
                quantidadeUsada++;
            }else{
                System.out.println("Cedula de 1 reais usada");
                valor = valor - 1;
                quantidadeUsada++;
            }
        }
        System.out.println("A quantidade total de cedulas usadas foi de: " + quantidadeUsada);
        scan.close();

    }
}

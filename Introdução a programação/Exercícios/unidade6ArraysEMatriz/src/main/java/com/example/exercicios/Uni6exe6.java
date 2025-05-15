package com.example.exercicios;

import java.util.Scanner;

public class Uni6exe6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Qual será o tamanho do vetor?");
        int tamanho = scan.nextInt();

        double[] vetorReal = new double[tamanho];
        
        for(int i = 0; i < vetorReal.length; i++){
            System.out.println("Digite um número para a posição: " + i);
            vetorReal[i] = scan.nextDouble();
        }

        System.out.println("Digite um número para ver se está neste vetor");
        double inputUsuario = scan.nextDouble();
        boolean retorno = false;
        for( double numero : vetorReal){
            if(inputUsuario == numero){
                retorno = true;
            }
        }

        System.out.println(retorno);


        scan.close();
    }
}

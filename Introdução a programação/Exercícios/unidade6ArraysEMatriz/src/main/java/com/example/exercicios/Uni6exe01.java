package com.example.exercicios;

import java.util.Scanner;

public class Uni6exe01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorInt = new int[10];
        for(int i = 0; i < 10; i++){
            int numero = scan.nextInt();
            vetorInt[i] = numero;
        }

        for(int i = vetorInt.length - 1; i >= 0; i-- ){
            System.out.println("O vetor na posição: " + i + " tem o valor de: " + vetorInt[i]);
        }
        scan.close();
    }
}

package com.example.exercicios;

import java.util.Scanner;

public class Uni6exe4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorInt1 = new int[10];
        for(int i = 0; i < 10; i++){
            int numero = scan.nextInt();
            vetorInt1[i] = numero;
        }

        int[] vetorInt2 = new int[10];
        for(int i = 0; i < 10; i++){
            int numero = scan.nextInt();
            vetorInt2[i] = numero;
        }
        
        int[] vetorInt3Soma = new int[10];
        for(int i = 0; i < vetorInt3Soma.length; i++){
            vetorInt3Soma[i] = vetorInt1[i] + vetorInt2[i];
        }

        for(int numero : vetorInt3Soma){
            System.out.println("A soma de cada elemento é de: " + numero);
        }
        
        
        scan.close();
    }
}

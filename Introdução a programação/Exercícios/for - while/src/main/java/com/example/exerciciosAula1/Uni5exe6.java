package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double altura = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a altura da pessoa: " + i);
            altura = scan.nextDouble();    
            altura += altura;
        }
        double media = altura / 20;
        System.out.println("A média foi de: " + media);

        scan.close();
    }
}

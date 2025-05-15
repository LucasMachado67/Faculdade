package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe31 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scan.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido. Digite um inteiro positivo.");
            scan.close();
            return;
        }

        System.out.println("número\tdecomposição");
        while (numero > 1) {
            int divisor = 2;
            while (numero % divisor != 0) {
                divisor++;
            }
            System.out.println(numero + "\t" + divisor);
            numero /= divisor;
        }
        System.out.println("1");

        scan.close();
    }
}

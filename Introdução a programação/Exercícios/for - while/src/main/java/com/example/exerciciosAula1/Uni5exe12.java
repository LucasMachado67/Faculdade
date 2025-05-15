package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroLinhas = scan.nextInt();
        int n = 1;
        for (int i = 0; i <= numeroLinhas; i++) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                System.out.print(n + " ");
                n++;
            }
            
        }

        scan.close();
    }
}

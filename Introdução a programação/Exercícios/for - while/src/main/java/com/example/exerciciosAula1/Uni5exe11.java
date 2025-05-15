package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quebrados = 1;
        int horas = 0;
        for (int i = 1; i <= 16; i++) {
            
            horas++;
            if(horas != 1){

                quebrados *= 3;
            }
            System.out.println("Números de biscoitos quebrados as " + horas + "h: " + quebrados);
        }

        scan.close();
    }
}

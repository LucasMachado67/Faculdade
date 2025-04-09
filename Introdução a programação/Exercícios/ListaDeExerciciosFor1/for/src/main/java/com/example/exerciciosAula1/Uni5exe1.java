package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < 20; i++) {
            int num = scan.nextInt();
            if(num % 2 == 0){
                System.out.println("Número: " + num + " Par");
            }else{
                System.out.println("Número: " + num + " Ímpar");
            }
        }

        scan.close();
    }

}

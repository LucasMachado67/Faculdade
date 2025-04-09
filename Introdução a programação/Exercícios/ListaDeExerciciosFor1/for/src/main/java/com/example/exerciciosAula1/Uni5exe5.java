package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); 
        if(num < 2){
            System.out.println("Erro");
        }else{
            int a = 8;
            int b = 10;
            for (int i = 1; i <= num;) {
                System.out.println(a);
                i++;
                if(i < num){
                    System.out.println(b);
                    i++;
                }
                a = 2 * a;
                b = 2 + a;
            }
        }

        scan.close();
    }
}

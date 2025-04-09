package com.example.exerciciosAula1;

public class Uni5exe2 {
    public static void main(String[] args) {

        int somaPar = 0;
        int somaImpar = 0;
        for(int i = 0; i <= 100; i++){

            if(i % 2 == 0){
                somaPar += i;
            }else{
                somaImpar += i;
            }
        }

        System.out.println("Total de números pares: " + somaPar);
        System.out.println("Total de números ímpares: " + somaImpar);

    }
}

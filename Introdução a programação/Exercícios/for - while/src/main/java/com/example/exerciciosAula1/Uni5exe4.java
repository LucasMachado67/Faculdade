package com.example.exerciciosAula1;

public class Uni5exe4 {
    public static void main(String[] args) {
        
        double valor1 = 3.0;
        double valor2 = 2.0;
        double valorParaAumentar = 4.0;
        double soma = 0;
        for(int i = 1; i < 20; i++){
            soma += valor1/valor2;
            valor1 = valor1 + 2;
            valor2 += valorParaAumentar;
            valorParaAumentar += 2;
        }

        System.out.println("Soma: " + soma);
    }
}

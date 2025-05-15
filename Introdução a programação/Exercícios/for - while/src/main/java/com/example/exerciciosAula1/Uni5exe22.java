package com.example.exerciciosAula1;

public class Uni5exe22 {
    public static void main(String[] args) {
        
        double salarioAtual = 2000;
        int ano = 1996;
        double aumento = 0;
        double porcentagemAtual = 1.5;
        while(ano <= 2025){
            aumento =  salarioAtual * porcentagemAtual / 100;
            porcentagemAtual = porcentagemAtual * 2;
            ano++;
            System.out.println("O salário de " + salarioAtual + "R$, ganhou um aumento de " + aumento);
            salarioAtual += aumento;
            System.out.println("Salário Atualizado: " + salarioAtual);
        }
        System.out.println("FIM");
    }
}

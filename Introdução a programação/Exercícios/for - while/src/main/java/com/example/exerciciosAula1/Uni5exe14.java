package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double lucro = 0;
        double pc = 0;
        double pv = 0;
        int quantidadeLucro10 = 0;
        int quantidadeLucroEntre10e20 = 0;
        int quantidadeLucro20 = 0;
        double valorTotalCompra = 0;
        double valorTotalVenda = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o preço de Compra da mercadoria " + i + ": ");
            pc = scan.nextDouble();
            System.out.println("Digite o preço de venda da mercadoria " + i + ": ");
            pv = scan.nextDouble();

            lucro = (pv - pc) / pc * 100;
            if(lucro < 10){
                quantidadeLucro10++;
            }else if(lucro >= 10 && lucro <= 20){
                quantidadeLucroEntre10e20++;
            }else{
                quantidadeLucro20++;
            }
            valorTotalCompra += pc;
            valorTotalVenda += pv;
            
        }
        System.out.println("A quantidade de mercadorias que tiveram 10% de lucro foi de: " + quantidadeLucro10);
        System.out.println("A quantidade de mercadorias que tiveram entre 10% e 20% de lucro foi de: " + quantidadeLucroEntre10e20);
        System.out.println("A quantidade de mercadorias que tiveram mais de 20% de lucro foi de: " + quantidadeLucro20);
        System.out.println("O valor total de compra foi de: " + valorTotalCompra);
        System.out.println("O valor total de venda foi de: " + valorTotalVenda);
        
        scan.close();
    }
}

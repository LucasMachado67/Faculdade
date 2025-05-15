package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int numeroVendas = 0;
        String nome = "";
        double totalVendas = 0;
        double precoUnitario = 0;
        double salario = 0;
        boolean loop = true;
        double comissao = 0;
        String alternativa = "";
        do { 
            System.out.println("Digite 'SIM' para mostrar os dados de mais um cliente ou 'NÃO' para sair:");
            alternativa = scan.nextLine().toUpperCase();

            if (alternativa.equals("SIM")) {
                System.out.println("Digite o nome do vendedor:");
                nome = scan.nextLine();

                System.out.println("Digite o salário do " + nome + ":");
                salario = scan.nextDouble();

                System.out.println("Digite o número de vendas realizadas pelo " + nome + ":");
                numeroVendas = scan.nextInt();

                System.out.println("Digite o valor unitário dos produtos:");
                precoUnitario = scan.nextDouble();
                scan.nextLine(); // consome o \n pendente

                totalVendas = precoUnitario * numeroVendas;
                comissao = totalVendas * 30 / 100;

                System.out.println("Nome: " + nome);
                System.out.println("Salário: " + salario);
                System.out.println("Número de Vendas: " + numeroVendas);
                System.out.println("Valor total das Vendas: " + totalVendas);
                System.out.println("Comissão a receber: " + comissao);
            } else if (alternativa.equals("NÃO")) {
                loop = false;
            } else {
                System.out.println("Opção inválida. Digite 'SIM' ou 'NÃO'.");
            }
        } while (loop);

        System.out.println("Programa encerrado.");
        scan.close();
        
        

        scan.close();
    }
}

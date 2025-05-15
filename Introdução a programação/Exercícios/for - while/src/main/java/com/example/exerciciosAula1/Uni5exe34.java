package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int contasEncerradas = 0;
        int opcao = 0;

        do {
            System.out.println("\nEscolha uma das opções:");
            System.out.println("1 - Encerrar a conta de um hóspede");
            System.out.println("2 - Verificar número de contas encerradas");
            System.out.println("3 - Sair");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do hóspede: ");
                    String nome = scan.next();

                    System.out.print("Digite o número de diárias: ");
                    int diarias = scan.nextInt();

                    double valorDiaria = 50.00;
                    double taxaServico = 0.00;

                    if (diarias < 15) {
                        taxaServico = 7.50;
                    } else if (diarias == 15) {
                        taxaServico = 6.50;
                    } else {
                        taxaServico = 5.00;
                    }

                    double total = (valorDiaria * diarias) + (taxaServico * diarias);
                    System.out.printf("\nNome: %s\nTotal a pagar: R$ %.2f\n", nome, total);

                    contasEncerradas++;
                    break;

                case 2:
                    System.out.println("\nNúmero de contas encerradas: " + contasEncerradas);
                    break;

                case 3:
                    System.out.println("\nSaindo...");
                    scan.close();
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 3);

    }
}

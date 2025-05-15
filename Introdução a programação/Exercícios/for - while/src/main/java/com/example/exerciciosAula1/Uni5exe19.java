package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalRecebido = 0;
        double valorCompra = 0;
        double valorAPagar = 0;
        double percentual = 0;
        while (true) {
            System.out.println("digite o valor da compra");
            valorCompra = scan.nextDouble();
            if (valorCompra == 0) {
                break;
            }

            if (valorCompra > 500.00) {
                percentual = valorCompra * 0.20;
                valorAPagar = valorCompra - percentual;
            }
            if (valorCompra <= 500.00) {
                percentual = valorCompra * 0.15;
                valorAPagar = valorCompra - percentual;
            }
            System.out.println("Valor a pagar será de: " + valorAPagar);
            totalRecebido += valorAPagar;
        }

        System.out.println("O total recebido pela loja será de: " + totalRecebido);
        scan.close();
    }
}

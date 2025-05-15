package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe32 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana do primeiro dia do mês (1=Dom, 2=Seg, ..., 7=Sáb): ");
        int p = scanner.nextInt();

        System.out.print("Digite o número de dias do mês: ");
        int n = scanner.nextInt();

        System.out.println("D\tS\tT\tQ\tQ\tS\tS");

        int i = 1;
        while (i < p) {
            System.out.print("\t");
            i++;
        }

        int dia = 1;
        int diaDaSemana = p;
        while (dia <= n) {
            System.out.print(dia + "\t");

            if (diaDaSemana == 7) {
                System.out.println();
                diaDaSemana = 1;
            } else {
                diaDaSemana++;
            }

            dia++;
        }

        scanner.close();
    }
}

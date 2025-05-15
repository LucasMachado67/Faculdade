package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe33 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int canditado1 = 0;
        int canditado2 = 0;
        int canditado3 = 0;
        int canditado4 = 0;
        int votoNulo = 0;
        int votoBranco = 0;
        double total = 0;
        double percentualVotosBrancosENulos = 0;
        int escolha = 0;
        do {
            System.out.println("Escolha umas das opções");
            System.out.println("Votar em candidato 1? digite 1");
            System.out.println("Votar em candidato 2? digite 2");
            System.out.println("Votar em candidato 3? digite 3");
            System.out.println("Votar em candidato 4? digite 4");
            System.out.println("Votar em nulo? digite 5");
            System.out.println("Votar em branco? digite 6");
            System.out.println("Sair? digite 0");
            escolha = scan.nextInt();
            if (escolha == 0) {
                scan.close();
                break;
            }
            while (escolha < 0 && escolha > 6) {
                System.out.println("Entrada inválida, digite novamente");
                escolha = scan.nextInt();
            }

            if (escolha == 1) {
                canditado1++;
            } else if (escolha == 2) {
                canditado2++;

            } else if (escolha == 3) {
                canditado3++;

            } else if (escolha == 4) {
                canditado4++;

            } else if (escolha == 5) {
                votoNulo++;
            } else {
                votoBranco++;
            }
        
        } while (escolha != 0);
        total = canditado1 + canditado2 + canditado3 + canditado4 + votoBranco + votoNulo;
        percentualVotosBrancosENulos = (votoNulo + votoBranco) / total * 100;
        System.out.println("TOTAL VOTOS PARA CADA CANDIDATO");
        System.out.println("candidato 1: " + canditado1);
        System.out.println("candidato 2: " + canditado2);
        System.out.println("candidato 3: " + canditado3);
        System.out.println("candidato 4: " + canditado4);
        System.out.println("TOTAL DE VOTOS NULOS");
        System.out.println("total: " + votoNulo);
        System.out.println("TOTAL DE VOTOS BRANCOS");
        System.out.println("total: " + votoBranco);
        System.out.println("PERCENTUAL DE VOTOS BRANCOS E NULOS SOBRE O TOTAL");
        System.out.println("percentual: " + percentualVotosBrancosENulos);
    }
}

package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe25 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int D = 0;
        int E = 0;
        String ganhadorRodada = "";
        boolean vencedor = false;
        while (!vencedor) {
            System.out.println("Rodada começou");
            System.out.println("Digite qual lado ganhou (E para Esquerdo, D para Direito):");
            ganhadorRodada = scan.next().toUpperCase();

            if (ganhadorRodada.equals("E")) {
                System.out.println("Jogador do lado esquerdo ganhou a rodada");
                E++;
            } else if (ganhadorRodada.equals("D")) {
                System.out.println("Jogador do lado direito ganhou a rodada");
                D++;
            } else {
                System.out.println("Entrada inválida. Digite apenas E ou D.");
                continue;
            }

            if ((E >= 21 && E - D >= 2)) {
                System.out.println("Jogador do lado esquerdo ganhou a partida");
                vencedor = true;
            } else if ((D >= 21 && D - E >= 2)) {
                System.out.println("Jogador do lado direito ganhou a partida");
                vencedor = true;
            } 
            
        }
        System.out.println("Jogo encerrado");

        scan.close();
    }
}

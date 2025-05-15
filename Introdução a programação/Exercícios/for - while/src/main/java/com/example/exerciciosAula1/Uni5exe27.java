package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe27 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int diaMesAbril = 0;
        int diaMesAbrilMaiorProducao = 0;
        String periodoDeMaiorProducao = "";
        int tarde = 0;
        int manha = 0;
        int quantidadePeçasNoDia = 0;
        int maiorQuantidadePeçasNoDiaMes = 0;
        double valorTotalNoDia = 0;
        int totalManha = 0;
        int totalTarde = 0;
        int escolha = 0;

        do {
            System.out.println("Digite o dia do mês de Abril (1 a 30)");
            diaMesAbril = scan.nextInt();
            while (diaMesAbril > 30 || diaMesAbril < 1) {
                System.out.println("Dia inválido, digite entre 01 a 30 de Abril");
                diaMesAbril = scan.nextInt();
            }
            System.out.println("Digite a quantidade produzida no período da manhã");
            manha = scan.nextInt();
            System.out.println("Digite a quantidade produzida no período da tarde");
            tarde = scan.nextInt();
            quantidadePeçasNoDia = manha + tarde;
            if(quantidadePeçasNoDia > 100 && manha > 30 && tarde > 30 && diaMesAbril < 16){
                valorTotalNoDia = quantidadePeçasNoDia * 0.80;
            }else if(diaMesAbril < 16){
                valorTotalNoDia = quantidadePeçasNoDia * 0.5;
            }else if(diaMesAbril > 15){
                valorTotalNoDia += manha * 0.4;
                valorTotalNoDia += tarde * 0.3;
            }
            
            totalManha += manha;
            totalTarde += tarde;
            if(maiorQuantidadePeçasNoDiaMes < quantidadePeçasNoDia){
                diaMesAbrilMaiorProducao = diaMesAbril;
            }
            if(totalManha > totalTarde){
                periodoDeMaiorProducao = "O periodo que mais produzio foi de manha";
            }else{
                periodoDeMaiorProducao = "O periodo que mais produzio foi de tarde";
            }
            System.out.println("valor Total recebido foi de: " + valorTotalNoDia);
            System.out.println("");
            System.out.println("");
            System.out.println("Novo funcionário (1.sim 2.não)?");
            escolha = scan.nextInt();
            if(escolha == 1){

            }else{
                scan.close();
                break;
            }
        } while (true);

        System.out.println("O dia que ocorreu a maior produção foi em " + diaMesAbrilMaiorProducao);
        System.out.println(periodoDeMaiorProducao);
    }
}

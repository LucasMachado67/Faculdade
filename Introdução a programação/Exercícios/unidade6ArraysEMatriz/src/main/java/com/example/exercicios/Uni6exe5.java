package com.example.exercicios;

import java.util.Scanner;

public class Uni6exe5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int repeticao = 0;
        String[] respostasRapaz = new String[5];
        String[] respostasMoca = new String[5];
        int somaRespostas = 0;
        System.out.println("Digite: SIM, NÃO ou IND para testar o nível de afinidade");
        while(repeticao != 2){

            System.out.println("Gosta de Música Sertaneja?");
            if(repeticao == 0){
                respostasRapaz[0] = scan.next();
            }else{
                respostasMoca[0] = scan.next();
            }
            System.out.println("Gosta de Futebol?");
            if(repeticao == 0){
                respostasRapaz[1] = scan.next();
            }else{
                respostasMoca[1] = scan.next();
            }
            System.out.println("Gosta de seriados");
            if(repeticao == 0){
                respostasRapaz[2] = scan.next();
            }else{
                respostasMoca[2] = scan.next();
            }
            System.out.println("Gosta de Redes Socias?");
            if(repeticao == 0){
                respostasRapaz[3] = scan.next();
            }else{
                respostasMoca[3] = scan.next();
            }
            System.out.println("Gosta de Oktoberfest?");
            if(repeticao == 0){
                respostasRapaz[4] = scan.next();
            }else{
                respostasMoca[4] = scan.next();
            }

            repeticao++;
        }

        if(respostasRapaz[0].equals("SIM") && respostasMoca[0].equals("SIM")){
            somaRespostas += 3;
        }else if(respostasRapaz[0].equals("IND") || respostasMoca[0].equals("IND")){
            somaRespostas += 1;
        }else{
            somaRespostas -= 2;
        }

        if(respostasRapaz[1].equals("SIM") && respostasMoca[1].equals("SIM")){
            somaRespostas += 3;
        }else if(respostasRapaz[1].equals("IND") || respostasMoca[1].equals("IND")){
            somaRespostas += 1;
        }else{
            somaRespostas -= 2;
        }

        if(respostasRapaz[2].equals("SIM") && respostasMoca[2].equals("SIM")){
            somaRespostas += 3;
        }else if(respostasRapaz[2].equals("IND") || respostasMoca[2].equals("IND")){
            somaRespostas += 1;
        }else{
            somaRespostas -= 2;
        }

        if(respostasRapaz[3].equals("SIM") && respostasMoca[3].equals("SIM")){
            somaRespostas += 3;
        }else if(respostasRapaz[3].equals("IND") || respostasMoca[3].equals("IND")){
            somaRespostas += 1;
        }else{
            somaRespostas -= 2;
        }

        if(respostasRapaz[4].equals("SIM") && respostasMoca[4].equals("SIM")){
            somaRespostas += 3;
        }else if(respostasRapaz[4].equals("IND") || respostasMoca[4].equals("IND")){
            somaRespostas += 1;
        }else{
            somaRespostas -= 2;
        }


        if(somaRespostas == 15){
            System.out.println("Casem!");
        }else if(somaRespostas >= 10 || somaRespostas <= 14){
            System.out.println("Vocês tem muita coisa em comum");
        }else if(somaRespostas >= 5 || somaRespostas <= 9){
            System.out.println("Talvez não de certo :(");
        }else if(somaRespostas >= 0 || somaRespostas <= 4){
            System.out.println("Vá em um encontro");
        }else if(somaRespostas <= -1 || somaRespostas >= -9){
            System.out.println("Melhor não perder tempo");
        }else{
            System.out.println("Vocês se odeiam!");
        }

        scan.close();
    }
}

package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe28 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int grupoEscolhido = 0;
        double grupo1 = 0;
        double grupo2 = 0;
        double grupo3 = 0;
        double grupo4 = 0;
        double totalVotos = 0;
        String escolha = "";
        
        do{
            
            System.out.println("----Votação----");
            System.out.println("Digite 1 - Nenhum de nós \n" + 
                               "Digite 2 - CPM22 \n" + 
                               "Digite 3 - Skank \n" + 
                               "Digite 4 - JotaQuest");
            grupoEscolhido = scan.nextInt();
            if(grupoEscolhido == 1){
                System.out.println("Escolhido votar em - Nenhum de nós");
                grupo1++;
            }else if(grupoEscolhido == 2){
                System.out.println("Escolhido votar em - CPM22");
                grupo2++;
            }else if(grupoEscolhido == 3){
                System.out.println("Escolhido votar em - Skank");
                grupo3++;
            }else{
                System.out.println("Escolhido votar em - JotaQuest");
                grupo4++;
            }
            
            System.out.println("mais um voto: s (SIM) / n (NÃO)?");
            escolha = scan.next().toLowerCase();
            if(escolha.equals("s")){

            }else{
                scan.close();
                break;
            }
        }while(true);   
        totalVotos = grupo1 + grupo2 + grupo3 + grupo4;
        System.out.println("TOTAL DE VOTOS POR GRUPO");
        System.out.println( "Grupo 1 - Nenhum de nós:" + grupo1 + "\n" + 
                               "Grupo 2 - CPM22: "+ grupo2 + "\n" + 
                               "Grupo 3 - Skank: "+ grupo3 + "\n" + 
                               "Grupo 4 - JotaQuest:" + grupo4 + "\n" 
        );
        System.out.println("GRUPO VENCEDOR");
        if(grupo1 > grupo2 && grupo1 > grupo3 && grupo1 > grupo4){
            System.out.println("Grupo 1 - Nenhum de nós");
        }else if(grupo2 > grupo1 && grupo2 > grupo3 && grupo2 > grupo4){
            System.out.println("Grupo 2 - CPM22");
        }else if(grupo3 > grupo1 && grupo3 > grupo2 && grupo3 > grupo4){
            System.out.println("Grupo 3 - Skank");
        }else{
            System.out.println("Grupo 4 - JotaQuest");
        }
        System.out.println("PERCENTUAL DE VOTOS");
        grupo1 = grupo1 / totalVotos * 100; 
        grupo2 = grupo2 / totalVotos * 100; 
        grupo3 = grupo3 / totalVotos * 100; 
        grupo4 = grupo4 / totalVotos * 100; 
        System.out.println("Grupo 1 - Nenhum de nós: " + grupo1 + "\n" + 
                               "Grupo 2 - CPM22: "+ grupo2 + "\n" + 
                               "Grupo 3 - Skank: "+ grupo3 + "\n" + 
                               "Grupo 4 - JotaQuest: " + grupo4 + "\n" );
    }
}

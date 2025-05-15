package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroCanal = 0;
        int numeroPessoasCanal4 = 0;
        int numeroPessoasCanal5 = 0;
        int numeroPessoasCanal9 = 0;
        int numeroPessoasCanal12 = 0;
        int totalPessoas = 0;
        double porcentagemCanal4 = 0;
        double porcentagemCanal5 = 0;
        double porcentagemCanal9 = 0;
        double porcentagemCanal12 = 0;
        while(true){
            System.out.println("digite o número do canal: 4, 5, 9, 12" );
            numeroCanal = scan.nextInt();
            if(numeroCanal == 0){
                break;
            }
            if(numeroCanal == 4){
                numeroPessoasCanal4++;
            }else if(numeroCanal == 5){
                numeroPessoasCanal5++;
            }else if(numeroCanal == 9){
                numeroPessoasCanal9++;
            }else{
                numeroPessoasCanal12++;
            }
            totalPessoas++;
        }

        porcentagemCanal4 = numeroPessoasCanal4 * 100 / totalPessoas;
        porcentagemCanal5 = numeroPessoasCanal5 * 100 / totalPessoas;
        porcentagemCanal9 = numeroPessoasCanal9 * 100 / totalPessoas;
        porcentagemCanal12 = numeroPessoasCanal12 * 100 / totalPessoas;

        System.out.println("A porcentagem foi do canal 4 foi de: " + porcentagemCanal4);
        System.out.println("A porcentagem foi do canal 5 foi de: " + porcentagemCanal5);
        System.out.println("A porcentagem foi do canal 9 foi de: " + porcentagemCanal9);
        System.out.println("A porcentagem foi do canal 12 foi de: " + porcentagemCanal12);

        scan.close();
    }
}

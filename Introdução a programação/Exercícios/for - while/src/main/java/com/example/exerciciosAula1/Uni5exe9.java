package com.example.exerciciosAula1;

import java.util.Scanner;

public class Uni5exe9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeAluno = scan.nextInt();

        String nomeAluno = "";
        int idadeAluno = 0;
        int quantidadeAcimaDe20 = 0;
        String alunos18 = "Nomes dos alunos que tem 18 anos: ";
        for (int i = 0; i < quantidadeAluno; i++) {
            System.out.println("Digite o nome do aluno: ");
            nomeAluno = scan.next();
            System.out.println("Digite a idade do aluno: ");
            idadeAluno = scan.nextInt();
            if(idadeAluno == 18){
                alunos18 += nomeAluno + " ";
            }
            if(idadeAluno > 20){
                quantidadeAcimaDe20++;
            }
        }

        System.out.println(alunos18);
        System.out.println("A quantidade de alunos acima de 20 é de: " + quantidadeAcimaDe20);

        scan.close();
    }
}

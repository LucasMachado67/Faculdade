package com.example.desafio;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] alunos = new double[20][3];
        String[][] situacaoAlunos = new String[20][2];

        // Dados
        alunos[0] = new double[] { 123456, 7.5, 16 };
        situacaoAlunos[0] = new String[] { "Aprovado", "123456" };

        alunos[1] = new double[] { 123457, 6.3, 14 };
        situacaoAlunos[1] = new String[] { "Reprovado por frequência", "123457" };

        alunos[2] = new double[] { 123458, 9.2, 18 };
        situacaoAlunos[2] = new String[] { "Aprovado", "123458" };

        alunos[3] = new double[] { 123459, 4.8, 15 };
        situacaoAlunos[3] = new String[] { "Reprovado por nota", "123459" };

        alunos[4] = new double[] { 123460, 8.7, 17 };
        situacaoAlunos[4] = new String[] { "Aprovado", "123460" };

        alunos[5] = new double[] { 123461, 5.2, 12 };
        situacaoAlunos[5] = new String[] { "Reprovado por frequência", "123461" };

        alunos[6] = new double[] { 123462, 7.8, 20 };
        situacaoAlunos[6] = new String[] { "Aprovado", "123462" };

        alunos[7] = new double[] { 123463, 6.8, 15 };
        situacaoAlunos[7] = new String[] { "Recuperação", "123463" };

        alunos[8] = new double[] { 123464, 9.5, 19 };
        situacaoAlunos[8] = new String[] { "Aprovado", "123464" };

        alunos[9] = new double[] { 123465, 6.0, 14 };
        situacaoAlunos[9] = new String[] { "Recuperação", "123465" };

        alunos[10] = new double[] { 123466, 8.1, 16 };
        situacaoAlunos[10] = new String[] { "Aprovado", "123466" };

        alunos[11] = new double[] { 123467, 5.4, 15 };
        situacaoAlunos[11] = new String[] { "Recuperação", "123467" };

        alunos[12] = new double[] { 123468, 4.9, 16 };
        situacaoAlunos[12] = new String[] { "Reprovado por nota", "123468" };

        alunos[13] = new double[] { 123469, 8.2, 10 };
        situacaoAlunos[13] = new String[] { "Reprovado por frequência", "123469" };

        alunos[14] = new double[] { 123470, 7.0, 15 };
        situacaoAlunos[14] = new String[] { "Aprovado", "123470" };

        alunos[15] = new double[] { 123471, 6.5, 15 };
        situacaoAlunos[15] = new String[] { "Recuperação", "123471" };

        alunos[16] = new double[] { 123472, 9.0, 22 };
        situacaoAlunos[16] = new String[] { "Aprovado", "123472" };

        alunos[17] = new double[] { 123473, 5.6, 13 };
        situacaoAlunos[17] = new String[] { "Recuperação", "123473" };
        int quantidadeAlunos = 18;
        do {
            System.out.println("----MENU----");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Exibir dados de todos os alunos");
            System.out.println("3 - Calcular estatistica da turma");
            System.out.println("4 - Verificar situacao de um aluno especifico");
            System.out.println("5 - Sair");

            int escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    if (quantidadeAlunos >= 20) {
                        System.out.println("Não é possível cadastrar mais alunos");
                        break;
                    }
                    System.out.println("Digite o numero da matricula do aluno");
                    alunos[quantidadeAlunos][0] = scan.nextDouble();
                    boolean matriculaRepetida = false;

                    for (int i = 0; i < quantidadeAlunos; i++) {
                        if (alunos[i][0] == alunos[quantidadeAlunos][0]) {
                            matriculaRepetida = true;
                            break;
                        }
                    }
                    while (matriculaRepetida) {
                        System.out.println("Matrícula já cadastrada! Digite um número de matrícula diferente.");
                        alunos[quantidadeAlunos][0] = scan.nextDouble();

                        matriculaRepetida = false;
                        for (int i = 0; i < quantidadeAlunos; i++) {
                            if (alunos[i][0] == alunos[quantidadeAlunos][0]) {
                                matriculaRepetida = true;
                                break;
                            }
                        }
                    }
                    System.out.println("Digite a nota da prova");
                    alunos[quantidadeAlunos][1] = scan.nextDouble();
                    while (alunos[quantidadeAlunos][1] < 0 || alunos[quantidadeAlunos][1] > 10) {
                        System.out.println("Nota invalida, digite entre 0 e 10");
                        alunos[quantidadeAlunos][1] = scan.nextDouble();
                    }
                    System.out.println("Digite a frequencia do aluno");
                    alunos[quantidadeAlunos][2] = scan.nextDouble();
                    while (alunos[quantidadeAlunos][2] < 0 || alunos[quantidadeAlunos][2] > 20) {
                        System.out.println("Frequencia invalida, digite entre 0 e 20");
                        alunos[quantidadeAlunos][2] = scan.nextDouble();
                    }
                    quantidadeAlunos++;
                    System.out.println("Aluno cadastrado!");
                    break;

                case 2:
                    for (int i = 0; i < quantidadeAlunos; i++) {
                        int alunoFrequencia = (int) alunos[i][2];
                        if (alunos[i][1] >= 7.0 && alunoFrequencia >= 15) {
                            situacaoAlunos[i][0] = "Aprovado";
                        } else if (alunos[i][1] >= 5.0 && alunos[i][1] < 7.0 && alunoFrequencia >= 15) {
                            situacaoAlunos[i][0] = "Recuperacao";
                        } else if (alunos[i][1] < 5.0 && alunoFrequencia >= 15) {
                            situacaoAlunos[i][0] = "Reprovado por nota";
                        } else if (alunoFrequencia < 15) { 
                            situacaoAlunos[i][0] = "Reprovado por frequencia";
                        }
                        situacaoAlunos[i][1] = String.valueOf(alunos[i][0]);

                        System.out.println("Aluno " + (i + 1) + " está: " + situacaoAlunos[i][0]);
                        System.out.println("Matrícula: " + alunos[i][0]);
                        System.out.println("Nota: " + alunos[i][1]);
                        System.out.println("Frequência: " + alunos[i][2]);
                        System.out.println("--------------------------");
                    }
                    break;

                case 3:
                    double maiorNota = 0.0;
                    double menorNota = 999.0;
                    double somaNotas = 0.0;
                    int quantidadeNotas = 0;

                    for (int i = 0; i < quantidadeAlunos; i++) {
                        if (maiorNota < alunos[i][1]) {
                            maiorNota = alunos[i][1];
                        }
                        if (menorNota > alunos[i][1]) {
                            menorNota = alunos[i][1];
                        }

                        somaNotas += alunos[i][1];
                        quantidadeNotas++;
                    }

                    double mediaNotas = somaNotas / quantidadeNotas;

                    int quantidadeAprovado = 0;
                    int quantidadeRecuperacao = 0;
                    int quantidadeReprovado = 0;

                    for (int i = 0; i < quantidadeAlunos; i++) {
                        if (situacaoAlunos[i][0].equals("Aprovado")) {
                            quantidadeAprovado++;
                        } else if (situacaoAlunos[i][0].equals("Recuperacao")) {
                            quantidadeRecuperacao++;
                        } else if (situacaoAlunos[i][0].equals("Reprovado por nota")
                                || situacaoAlunos[i][0].equals("Reprovado por frequencia")) {
                            quantidadeReprovado++;
                        }
                    }

                    double percentualAprovados = (quantidadeAprovado * 100.0) / quantidadeNotas;

                    System.out.println("A maior nota foi de: " + maiorNota + " e a menor nota foi de: " + menorNota);
                    System.out.println("A média de notas foi de: " + mediaNotas);
                    System.out.println("A quantidade de alunos em cada situação foi de:");
                    System.out.println("Aprovado: " + quantidadeAprovado);
                    System.out.println("Recuperação: " + quantidadeRecuperacao);
                    System.out.println("Reprovado: " + quantidadeReprovado);
                    System.out.println("O Percentual de aprovação foi de: " + percentualAprovados + "%");
                    break;

                case 4:

                    System.out.println("Digite o número de matrícula do aluno");
                    int numeroMatricula = scan.nextInt();

                    for (int i = 0; i < quantidadeAlunos; i++) {
                        if (numeroMatricula == alunos[i][0]) {
                            System.out.println("Matrícula: " + alunos[i][0]);
                            System.out.println("Nota: " + alunos[i][1]);
                            System.out.println("Frequência: " + alunos[i][2]);

                            if (situacaoAlunos[i][0].equals("Aprovado")) {
                                System.out.println("O aluno está Aprovado!");
                            } else if (situacaoAlunos[i][0].equals("Recuperacao")) {
                                System.out.println("O aluno está em Recuperação");
                            } else {
                                System.out.println("O aluno está Reprovado");
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scan.close();
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (true);

    }
}

package com.example.exercicios;

import java.util.Scanner;

public class Uni6exe10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[50];
        int tamanho = 0;
        int opcao;
        do {
            System.out.println("--- MENU ---");
            System.out.println("1 – Incluir valor");
            System.out.println("2 – Pesquisar valor");
            System.out.println("3 – Alterar valor");
            System.out.println("4 – Excluir valor");
            System.out.println("5 – Mostrar valores");
            System.out.println("6 – Ordenar valores");
            System.out.println("7 – Inverter valores");
            System.out.println("8 – Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    if (tamanho < 50) {
                        System.out.print("Digite o valor a ser incluído: ");
                        int valor = scan.nextInt();
                        vetor[tamanho] = valor;
                        tamanho++;
                        System.out.println("Valor incluído com sucesso");
                    } else {
                        System.out.println("Vetor cheio. Não é possível incluir mais valores.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor a ser pesquisado: ");
                    int busca = scan.nextInt();
                    boolean encontrado = false;
                    for (int i = 0; i < tamanho; i++) {
                        if (vetor[i] == busca) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.println("Valor encontrado no vetor.");
                    } else {
                        System.out.println("Valor não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o número a ser alterado: ");
                    int antigo = scan.nextInt();
                    System.out.print("Digite o novo número: ");
                    int novo = scan.nextInt();
                    boolean alterado = false;
                    for (int i = 0; i < tamanho; i++) {
                        if (vetor[i] == antigo) {
                            vetor[i] = novo;
                            alterado = true;
                            break;
                        }
                    }
                    if (alterado) {
                        System.out.println("Valor alterado com sucesso.");
                    } else {
                        System.out.println("Número não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o valor a ser excluído: ");
                    int excluir = scan.nextInt();
                    int indice = -1;
                    for (int i = 0; i < tamanho; i++) {
                        if (vetor[i] == excluir) {
                            indice = i;
                            break;
                        }
                    }
                    if (indice != -1) {
                        for (int i = indice; i < tamanho - 1; i++) {
                            vetor[i] = vetor[i + 1];
                        }
                        tamanho--;
                        System.out.println("Valor excluído com sucesso.");
                    } else {
                        System.out.println("Valor não encontrado.");
                    }
                    break;

                case 5:
                    if (tamanho == 0) {
                        System.out.println("Vetor vazio.");
                    } else {
                        System.out.println("Valores no vetor:");
                        for (int i = 0; i < tamanho; i++) {
                            System.out.print(vetor[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    for (int i = 0; i < tamanho - 1; i++) {
                        for (int j = 0; j < tamanho - i - 1; j++) {
                            if (vetor[j] > vetor[j + 1]) {
                                int temp = vetor[j];
                                vetor[j] = vetor[j + 1];
                                vetor[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Valores ordenados com sucesso.");
                    break;

                case 7:
                    for (int i = 0; i < tamanho / 2; i++) {
                        int temp = vetor[i];
                        vetor[i] = vetor[tamanho - 1 - i];
                        vetor[tamanho - 1 - i] = temp;
                    }
                    System.out.println("Valores invertidos com sucesso.");
                    break;

                case 8:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 8);

        scan.close();
    }
}

package com.lucas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean sair = false;

        
        Object[][] armario = new Object[5][2];
        armario[0][0] = 10;
        armario[0][1] = "Borracha";
        armario[1][0] = 5;
        armario[1][1] = "Metano";
        armario[2][0] = 15;
        armario[2][1] = "Prata";
        int quantidadeArmazenada = 3;
        System.out.println("Digite a carga máxima suportada pelo armario");
        int cargaMaxima = scan.nextInt();

        int cargaAtual = 0;
        do{
            System.out.println("--------------Menu--------------");
            System.out.println("1- Inserir Produto");
            System.out.println("2- Listar produtos");
            System.out.println("3- Produto mais volumoso");
            System.out.println("4- Ordenar produtos");
            System.out.println("5- Excluir produto");
            System.out.println("6- Sair");

            System.out.println("Digite a opção");
            int escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    if(cargaAtual >= cargaMaxima){
                        System.out.println("Não é possível colocar mais nada devido a carga estar no máximo");
                        break;
                    }
                    if(quantidadeArmazenada >= armario.length){
                        System.out.println("O armário está cheio");
                        break;
                    }

                    System.out.println("Digite o Volume do produto");
                    armario[quantidadeArmazenada][0] = scan.nextInt();
                    cargaAtual += (Integer) armario[quantidadeArmazenada][0];
                    if(cargaAtual > cargaMaxima){
                        System.out.println("Erro: Carga ultrapassou o limite");
                        break;
                    }
                    System.out.println("Digite o nome do produto");
                    armario[quantidadeArmazenada][1] = scan.next();
                    System.out.println("--------------------------");
                    System.out.println("Volume: " + armario[quantidadeArmazenada][0]);
                    System.out.println("Nome: " + armario[quantidadeArmazenada][1]);
                    System.out.println("-------------------------");
                    quantidadeArmazenada++;
                    break;
                case 2:
                    System.out.println("Lista de produtos");
                    System.out.println("");
                    for(int i = quantidadeArmazenada - 1; i >= 0; i--){
                        System.out.println("Produto: " + "    Volume: " + armario[i][0] +"    Nome: " + armario[i][1]);
                    }
                    break; 
                case 3:
                    int produtoMaisVolumoso = 0;
                    String nomeProdutoMaisVolumoso = "";

                    for (int i = 0; i < quantidadeArmazenada; i++) {
                        if((Integer) armario[i][0] > produtoMaisVolumoso){
                            produtoMaisVolumoso = (Integer) armario[i][0];
                            nomeProdutoMaisVolumoso = armario[i][1].toString();
                        }    
                    }
                    System.out.println("O nome do produto mais volumoso é: " + nomeProdutoMaisVolumoso + " e o seu volume é de: " + produtoMaisVolumoso);
                    break;
                case 4:
                    for (int i = 0; i < quantidadeArmazenada - 1; i++) {
                        
                        for (int j = 0; j < quantidadeArmazenada - 1 - i; j++) {
                            int volumeAtual = (Integer) armario[j][0];
                            int volumeProximo = (Integer) armario[j + 1][0];

                            if (volumeAtual < volumeProximo) {
                                Object[] aux = armario[j];
                                armario[j] = armario[j + 1];
                                armario[j + 1] = aux;
                            }    
                            
                        }
                    }
                    for(int i = 0; i < quantidadeArmazenada; i++){
                        System.out.println("Peso: " + armario[i][0]);
                        System.out.println("Nome: " + armario[i][1]);
                    }
                    System.out.println();
                    break;
                case 5:

                    boolean produtoExiste = false;

                    System.out.println("Digite o nome do produto");
                    String nomeParaProcurar = scan.next();

                    for (int i = 0; i < quantidadeArmazenada; i++) {
                        if (armario[i][1] != null && nomeParaProcurar.equals(armario[i][1])) {
                            int volumeRemovido = (Integer) armario[i][0]; 
                            produtoExiste = true;
                            for (int j = i; j < quantidadeArmazenada - 1; j++) {
                                armario[j] = armario[j + 1];
                            }
 
                            quantidadeArmazenada--;
                            cargaAtual -= volumeRemovido; 
                            break; 
                        }
                    }

                    if(!produtoExiste){
                        System.out.println("Não foi encontrado nenhum produto");
                    }else{
                        System.out.println("Item removido com sucesso");
                    }

                    break;
                case 6:
                    System.out.println("Saindo.....");
                    sair = true;
                    scan.close();
                    break;
                default:
                    System.out.println("Valor inválido, tente novamente");
                    break;
            }
        }while(sair != true);
    }
}
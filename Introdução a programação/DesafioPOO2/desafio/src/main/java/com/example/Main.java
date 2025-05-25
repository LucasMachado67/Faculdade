package com.example;

import java.util.Scanner;

import com.example.classes.Estoque;
import com.example.classes.Produto;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scan = new Scanner(System.in);

        boolean sair = true;
        int escolha = 0;
        Estoque estoque = new Estoque();
        do {

            System.out.println("1. Cadastrar produto\r\n" + //
                    "2. Entrada de mercadoria (adicionar estoque)\r\n" + //
                    "3. Saída de mercadoria (remover estoque)\r\n" + //
                    "4. Listar todos os produtos\r\n" + //
                    "5. Listar produtos por categoria\r\n" + //
                    "6. Buscar produto por código\r\n" + //
                    "7. Calcular valor total do estoque\r\n" + //
                    "8. Sair");
            escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Digite o código do produto");
                    int codigo = scan.nextInt();
                    System.out.println("Digite o nome do produto");
                    String nome = scan.next();
                    System.out.println("Digite a quantidade do produto");
                    int quantidade = scan.nextInt();
                    System.out.println("Digite o preço do produto");
                    Double preco = scan.nextDouble();
                    System.out.println("Digite a categoria do produto");
                    String categoria = scan.next();
                    Produto produto = new Produto(codigo, nome, quantidade, preco, categoria);
                    estoque.cadastrarProduto(produto);
                    break;
                case 2:
                    estoque.listarProdutos();
                    System.out.println("Digite o código do produto que você quer aumentar o estoque");
                    int codigoParaAdicionar = scan.nextInt();
                    Produto adicionarMaisEmProduto = estoque.buscarProduto(codigoParaAdicionar);
                    if (adicionarMaisEmProduto != null) {
                        System.out.println("Informe a quantidade para adicionar");
                        int quantity = scan.nextInt();
                        adicionarMaisEmProduto.adicionarEstoque(quantity);
                        System.out.println("Estoque atualizado com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado");
                    }
                    break;
                case 3:
                    estoque.listarProdutos();
                    System.out.println("Digite o código do produto que você quer remover do estoque");
                    int codigoParaRemover = scan.nextInt();
                    Produto removerProduto = estoque.buscarProduto(codigoParaRemover);
                    if (removerProduto != null) {
                        System.out.println("Informe a quantidade para remover");
                        int quantity = scan.nextInt();
                        removerProduto.removerProduto(quantity);
                        System.out.println("Estoque atualizado com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado");
                    }
                    break;
                case 4:
                    estoque.listarProdutos();
                    break;
                case 5:
                    System.out.println("Digite a categoria de produto para buscar");
                    String categoriaParaListar = scan.next();
                    estoque.listarProdutosPorCategoria(categoriaParaListar);
                    break;
                case 6:
                    System.out.println("Digite o código do produto para localizar");
                    int code = scan.nextInt();
                    estoque.buscarProduto(code);
                    break;
                case 7:
                    estoque .calcularValorTotalEstoque();
                    break;
                case 8:
                    System.out.println("Saindo.....");
                    sair = false;
                    scan.close();
                    break;
                default:
                    scan.close();
                    break;
            }
        } while (sair != false);
        scan.close();
    }
}
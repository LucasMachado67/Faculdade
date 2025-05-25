package com.example.classes;


public class Estoque {

    Produto[] produtos = new Produto[30];
    int quantidadeProdutos;

    public Estoque(){
        produtos = new Produto[30];
        quantidadeProdutos = 0;
    }

    public void cadastrarProduto(Produto produto){
        if(quantidadeProdutos >= produtos.length){
            System.out.println("Tamanho máximo atingido");
        }else{
            produtos[quantidadeProdutos] = produto;
            quantidadeProdutos++;
            System.out.println("Produto adicionado com sucesso");
        }
    }

    public Produto buscarProduto(int codigo){
        
        for(int i = 0; i < quantidadeProdutos; i++){
            if(produtos[i].codigo == codigo){
                System.out.println("Produto: " + produtos[i]);
                return produtos[i];
            }
        }
        return null;

    }

    public void listarProdutos(){
        for(int i = 0; i < quantidadeProdutos; i++){
            System.out.println(produtos[i]);
            System.out.println("-----------------------------");
        }
    }

    public void listarProdutosPorCategoria(String categoria){
        for (int i = 0; i  < quantidadeProdutos; i++) {
            if(produtos[i].categoria.equalsIgnoreCase(categoria)){
                System.out.println("Produto por categoria: " + produtos[i]);
                System.out.println("----------------------");
            }
        }   
    }

    public Double calcularValorTotalEstoque(){
        double valorTotal = 0;
        for(int i = 0; i < quantidadeProdutos; i++){
            valorTotal += produtos[i].calcularValorTotal();
        }
        System.out.println("O valor total foi de " + valorTotal);
        return valorTotal;
    }
}

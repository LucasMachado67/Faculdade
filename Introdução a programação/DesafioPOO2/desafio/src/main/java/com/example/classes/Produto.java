package com.example.classes;

public class Produto {

    public int codigo;
    public String nome;
    public int quantidade;
    public double preco;
    public String categoria;

    public Produto(int codigo,String nome, int quantidade, double preco, String categoria){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.categoria = categoria;
    }
    public Produto(){};

    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public boolean removerProduto(int quantidade){
       if(this.quantidade >= quantidade){
        this.quantidade -= quantidade;
        return true;
       }else{
        return false;
       }

    }

    public double calcularValorTotal(){
        return this.quantidade * this.preco;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Quantidade: " + quantidade +
               ", Preço: R$ " + preco + ", Categoria: " + categoria;
    }
}

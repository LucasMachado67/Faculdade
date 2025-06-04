package com.example;

import com.example.matrizes.MatrizTesouros;
import com.example.matrizes.MatrizUsuario;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MatrizTesouros tesouro = new MatrizTesouros();
        MatrizUsuario matrizUsuario = new MatrizUsuario();
        tesouro.preencherMatriz();
        matrizUsuario.preencherMatrizUsuario();
    }
}
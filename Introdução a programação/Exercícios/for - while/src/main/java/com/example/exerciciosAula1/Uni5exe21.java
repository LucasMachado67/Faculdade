package com.example.exerciciosAula1;

public class Uni5exe21 {
    public static void main(String[] args) {
        
        double alturaChico = 1.50;
        double alturaZe = 1.10;
        int contadorAnos = 0;
        while(alturaChico > alturaZe){
            alturaChico += 0.02;
            alturaZe += 0.03;
            contadorAnos++;
        }

        System.out.println("Levou " + contadorAnos + " anos, para zé ficar maior que chico");
        
    }
}

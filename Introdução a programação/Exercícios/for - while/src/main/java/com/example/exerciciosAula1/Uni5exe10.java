package com.example.exerciciosAula1;

public class Uni5exe10 {
    public static void main(String[] args) {
        int count = 0;
        int num = 1;

        while (count < 10) {
            int squared = num * num;
            String squaredStr = String.valueOf(squared);
            int len = squaredStr.length();
            for (int i = 1; i < len; i++) {
                String left = squaredStr.substring(0, i);
                String right = squaredStr.substring(i);

                int numeroEsquerdo = Integer.parseInt(left);
                int numeroDireito = Integer.parseInt(right);

                if (numeroDireito == 0) continue;

                if ((numeroEsquerdo + numeroDireito) == num) {
                    System.out.println(num + "² = " + squared + " → " + numeroEsquerdo + " + " + numeroDireito + " = " + num);
                    count++;
                    break;
                }
            }

            num++;
        }
    }
}

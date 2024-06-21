package Aula6.Matrizes;

import java.util.Scanner;
import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random aleatorio = new Random();
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                matriz[l][c] = aleatorio.nextInt(1, 50);
                System.out.printf("%02d ", matriz[l][c]);
            }
            System.out.println();
        }
        System.out.println("\nDiagonal da matriz...");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (l == c) {
                    System.out.print(matriz[l][c] + " ");
                }
            }
        }
        System.out.println("\nDiagonal da matriz opc 2");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println("\nDiagonal da inversa matriz");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if (l + c == matriz.length - 1) {
                    System.out.print(matriz[l][c] + " ");
                }
            }
        }
    }

}


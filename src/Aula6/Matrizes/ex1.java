package Aula6.Matrizes;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        //tipo[][] nome = new tipo[linhas][colunas]
        int[][] matriz = new int[4][3];
        Scanner ler = new Scanner(System.in);
        //lendo matrizes do teclado
        for(int l=0;l<4;l++){
            for(int c=0;c<3;c++){
                System.out.printf("matriz[%d][%d]",l,c);
                matriz[l][c] = ler.nextInt();
            }
        }
        //Mostrando a matriz na tela
        for(int l=0;l<4;l++){
            for(int c=0;c<3;c++){
                System.out.printf("%02d ",matriz[l][c]);
            }
            System.out.printf("\n");
        }
    }
}

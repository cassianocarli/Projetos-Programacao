package Aula4.exer;
/*Escreva um algoritmo que leia 10 valores e conte quantos deles estão no intervalo entre 10 e 20. Depois escreva essa informação*/
import java.util.Scanner;
public class exer2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = 0;
        int cont = 0;
        for (i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + " número");
            int valor = ler.nextInt();
            if (valor > 10 && valor < 20) {
                cont++;
            }
        }
        System.out.println("Há " + cont + " números no intervalo entre 10 e 20");
    }
}


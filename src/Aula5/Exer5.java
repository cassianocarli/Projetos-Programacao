package Aula5;
//- Declarar um vetor números com 20 elementos, gerar valores inteiros para ele
//aleatoriamente. Declare outros dois vetores, par e impar. No vetor par armazenar todos os
//elementos pares do vetor números. No vetor ímpar armazenar todos os elementos ímpares
//de números. Imprima os dois vetores.
import java.util.Random;
import java.util.Scanner;
public class Exer5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        int[] vetor = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int ip=0;
        int ii=0;
        for(int i=0;i<vetor.length;i++) {
            vetor[i] = aleatorio.nextInt(1, 50);
            if (vetor[i] % 2 == 0) {
                par[ip] = vetor[i];
                ip++;
            } else {
                impar[ii] = vetor[i];
                ii++;
            }

            System.out.println("\n");
        }
        System.out.println("Numeros pares");
        for(int i=0;i<ip;i++){
            System.out.println(par[i]+" ");
        }
        System.out.println("Numeros impares");
        for(int i=0;i<ip;i++){
            System.out.println(impar[i]+" ");
        }

    }
}

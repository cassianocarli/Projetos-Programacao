package Aula2.Exemplos;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número:");
        numero = ler.nextInt();
        System.out.println("O número é\n"+numero);

        float numeroR;
        System.out.print("Digite um número real:");
        numeroR = ler.nextFloat();
        System.out.println("O número é "+numeroR);
        System.out.printf("O número é %.2f\n",numeroR);

    }
}

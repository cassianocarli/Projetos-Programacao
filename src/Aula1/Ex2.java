package Aula1;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner ler =new Scanner(System.in);
        int numero;
        System.out.print("Digite um número:");
        numero = ler.nextInt();
        System.out.println(numero);
        //numero real
        System.out.print("Digite um número real");
        float numeroR = ler.nextFloat();
        System.out.println(numeroR);
    }
}

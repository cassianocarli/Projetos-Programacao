package Aula3.exercícios;
import java.util.Scanner;

public class ex4 {//4) Escreva um programa em Java que recebe um inteiro e diga se é par ou ímpar. Use o operador matemático % (resto da divisão ou módulo)
    // e o teste condicional if
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = ler.nextInt();
        if(numero %2==0)
            System.out.println("O número é par");
        else
            System.out.println("O número é impar");
    }
}

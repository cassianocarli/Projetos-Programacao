package Aula3.exercícios;
import java.util.Scanner;
public class ex5 {
 //5) Crie um programa que teste se o valor que usuário digitou está entre 10 e 15 e exibe alguma mensagem na tela.
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = ler.nextInt();
        if(numero>=10 && numero<=15)
            System.out.println("Este número esta entre 10 e 15");
        else
            System.out.println("Este número não está entre 10 e 15!");
    }
}

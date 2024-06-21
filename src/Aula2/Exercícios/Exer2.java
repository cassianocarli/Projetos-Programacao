package Aula2.Exercícios;
import java.util.Scanner;
public class Exer2 {
    //Escreva um programa que leia o nome e o sobrenome de uma pessoa separadamente e mostre uma mensagem, “Bem vindo Nome Sobrenome”.
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        String nome;
        String sobrenome;
        System.out.println("Digite seu nome:");
        nome =  ler.next();
        System.out.println("Digite seu sobrenome");
        sobrenome = ler.next();
        System.out.println("Bem vindo\n"+nome+ " "+sobrenome);



    }
}

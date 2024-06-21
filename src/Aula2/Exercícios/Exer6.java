package Aula2.Exercícios;

import java.util.Scanner;

public class Exer6 {
    //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int Rhora;
        System.out.println("Digite quanto voce ganha por hora trabalhada:");
        Rhora = ler.nextInt();
        int horaT;
        System.out.println("Digite as horas trabalhadas:");
        horaT = ler.nextInt();
        int total;
        total = Rhora * horaT;
        System.out.println("O seu salário é de"+" "+total+" "+"reais");


    }
}
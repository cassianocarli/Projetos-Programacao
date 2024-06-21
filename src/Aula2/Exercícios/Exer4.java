package Aula2.Exercícios;

import java.util.Scanner;
public class Exer4 {//Escreva uma classe Java que converta metros para centímetros.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int metro;
        int cent;
        System.out.println("Digite a medida em metros:");
        metro = ler.nextInt();
        cent = metro * 100;
        System.out.println("Os metros Digitados convertidos são" + " " + cent + " "+("centímetros."));

    }
}
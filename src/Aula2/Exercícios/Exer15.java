package Aula2.Exercícios;
import java.util.Scanner;
public class Exer15 {//Uma equipe de Fórmula 1 deseja calcular o número mínimo de litros que deverá colocar no tanque de
    // seu carro para que ele possa percorrer um determinado número de voltas até o primeiro reabastecimento.
    // Escreva um programa que leia o comprimento da pista (em metros),
    // o número total de voltas a serem percorridas no grande prêmio,
    // o número de reabastecimentos desejados e o consumo de combustível do carro (em Km/L).
    // Calcular e escrever o número mínimo de litros necessários para percorrer até o primeiro reabastecimento. Observação: Considere que o número de voltas entre os reabastecimentos é o mesmo.
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Sobre o GP informe:");
        System.out.println("Comprimento da pista em metros:");
        float comprimentoPista = ler.nextFloat()/1000;
        System.out.println("Número de voltas:");
        int voltas = ler.nextInt();
        System.out.println("Número de abastecimentos:");
        int abastecimentos = ler.nextInt();
        System.out.println("Autonomia em km/l:");
        float autonomia = ler.nextFloat();
        float distancia = comprimentoPista * voltas;
        float litrosTotal = distancia/autonomia;
        float litrosPabastece = litrosTotal/abastecimentos;
        System.out.println("Serão necessários"+String.format("%.2f", litrosPabastece)+"a cada abastecimento");


    }

}

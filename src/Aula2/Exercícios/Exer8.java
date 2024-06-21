package Aula2.Exercícios;
import java.util.Scanner;
public class Exer8 {//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9)
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheits:");
        float tempF;
        tempF = ler.nextFloat();
        float tempC;
        tempC = (5*(+tempF-32)/9);
        System.out.println("A temperatura em Graus celsius é"+" "+tempC);



    }

}

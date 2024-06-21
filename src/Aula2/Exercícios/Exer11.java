package Aula2.Exercícios;
import java.util.Scanner;
public class Exer11 {//Escreva um programa que calcula a área de um triângulo
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float altura;
        System.out.println("Digite a altura do triângulo:");
        altura = ler.nextFloat();
        float base;
        System.out.println("Digite a base do triângulo: ");
        base = ler.nextFloat();
        float area;
        area = (base * altura)/2;
        System.out.println("A area do triângulo é"+" "+area);





    }

}

package Aula2.Exercícios;
import java.util.Scanner;
public class Exer5 {
    //Faça um programa em Java que calcule a área de um círculo
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float area;
        float raio;
        System.out.println("Digite o raio do circulo:");
        raio = ler.nextFloat();
        area = (raio*raio)*(float)3.14;
    System.out.println("A area do circulo é" +" "+area);

    }
}
package Aula2.Exercícios;
import java.util.Scanner;
public class Exer10 {//Escreva um programa que calcule a área e o perímetro de um quadrado
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float lado;
        System.out.println("Digite a medida de um dos lados do quadrado:");
        lado = ler.nextFloat();
        float area;
        float perimetro;
        area = lado*lado;
        perimetro = lado *4;
        System.out.println("A area do quadrado é"+" "+area+"e o perimetro é:"+" "+perimetro);




    }

}

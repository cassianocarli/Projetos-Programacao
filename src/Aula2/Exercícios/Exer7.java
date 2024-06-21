package Aula2.Exercícios;
import java.util.Scanner;
public class Exer7 {//Faça uma classe Java que leia a altura e o peso de uma pessoa e calcule seu IMC IMC = peso/altura²
 public static void main(String[] args){
     Scanner ler = new Scanner(System.in);
     float altura;
     float peso;
     System.out.println("Digite a sua altura em metros:");
     altura = ler.nextFloat();

     System.out.println("Digite o seu peso em kg:");
     peso = ler.nextFloat();
     float imc;
     imc = (float)peso/(altura*altura);
     System.out.println("O seu IMC é:"+" "+imc);
 }

}

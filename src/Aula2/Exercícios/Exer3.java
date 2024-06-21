package Aula2.Exercícios;

import java.util.Scanner;

public class Exer3 {
    //Faça uma classe Java que peça as 4 notas bimestrais e mostre a média
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int media;
        System.out.println("Digite a primeira nota:");
        nota1 = ler.nextInt();
        System.out.println("Digite a segunda nota:");
        nota2 = ler.nextInt();
        System.out.println("Digite a terceira nota:");
        nota3 = ler.nextInt();
        System.out.println("Digite a quarta nota:");
        nota4 = ler.nextInt();

        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A média das notas é" +" "+media);


    }


}

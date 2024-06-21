package Aula3.exercícios;
 import java.util.Scanner;
public class ex2 {
    //2) Faça um programa que leia o nome e a idade de 1 nadador e exiba na tela o nome da categoria a qual este nadador pertence. A categoria dos nadadores é dada pela seguinte tabela:
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do nadador:");
        String nome = ler.next();
        System.out.println("Digite a idade do nadador:");
        int idade = ler.nextInt();

        if(idade>=5 && idade<=7)
            System.out.println("o nadador"+" "+nome+" é da Categoria Infantil A");

        else if(idade>=8 && idade<=10)
            System.out.println("o nadador"+" "+nome+" é da Categoria Infantil B");

        else if(idade>=11 && idade<=13)
            System.out.println("o nadador"+" "+nome+" é da Categoria Juvenil A");

        else if(idade>=14 && idade<=17)
            System.out.println("o nadador"+" "+nome+" é da Categoria Juvenil B");

        else if(idade>=18)
            System.out.println("o nadador"+" "+nome+" é da Categoria Adulto");

        else
            System.out.println("Está idade não esta em nenhuma categoria!");
    }
}

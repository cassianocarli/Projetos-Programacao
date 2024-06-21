package Aula3.exercícios;

import java.util.Scanner;

public class ex1 {
    //1) Crie um programa em que o usuário informa o nome de um mês (ex: janeiro) e o programa exibe o número correspondente a esse mesmo mês (ex: 1);
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome de um mês:");
        String mes = ler.next();
        switch(mes){
            case "janeiro" -> System.out.println("Este é o mes 1");
            case "fevereiro" -> System.out.println("Este é o mes 2");
            case "março" -> System.out.println("Este é o mes 3");
            case "abril" -> System.out.println("Este é o mes 4");
            case "maio" -> System.out.println("Este é o mes 5");
            case "junho" -> System.out.println("Este é o mes 6");
            case "julho" -> System.out.println("Este é o mes 7");
            case "agosto" -> System.out.println("Este é o mes 8");
            case "setembro" -> System.out.println("Este é o mes 9");
            case "outubro" -> System.out.println("Este é o mes 10");
            case "novembro" -> System.out.println("Este é o mes 11");
            case "dezembro" -> System.out.println("Este é o mes 12");
            default -> System.out.println("Este mes não existe!");


        }
    }
}

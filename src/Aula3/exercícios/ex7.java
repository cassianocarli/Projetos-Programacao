package Aula3.exercícios;
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        //7) Crie um algoritmo que pergunte ao usuário se ele deseja converter uma temperatura de graus Celsius em graus Fahrenheit ou Fahrenheit em Celsius.
        // Em seguida mostre na tela o valor final correspondente à opção escolhida pelo usuário. F = 1.8 * C + 32 | C = (F – 32) / 1.8;
        Scanner ler = new Scanner(System.in);
        System.out.println("Para converter graus celsius para fahrenheits digite 1, para converter fahrenheits para celsius digite 2:");
            int numero = ler.nextInt();
        switch(numero){
            case 1 -> {
                System.out.println("Digite a temperatura em graus celsius:");
                float celsius = ler.nextFloat();
                double fh = celsius * 1.8 + 32;
                System.out.println("A temperatura convertida para Fahrenheits é:"+fh);
            }
            case 2 -> {
                System.out.println("Digite a temperatura em graus Fahrenheits:");
                float fh = ler. nextFloat();
                double celsius = (fh-32)/1.8;
                System.out.println("A temperatura convertida para graus Celsius é:"+celsius);

            }
        }
    }
}



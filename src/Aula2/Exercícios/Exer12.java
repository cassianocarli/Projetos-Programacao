package Aula2.Exercícios;
import java.util.Scanner;
public class Exer12 {/*Crie uma classe java que leia dois números inteiros e que depois mostre:
O primeiro valor elevado ao segundo valor use Math.pow(número, expoente)
O primeiro valor vezes o segundo valor
O número inverso do primeiro valor (1/número)
A soma do segundo número com a metade do primeiro número
A diferença do primeiro número com o segundo
O número oposto ao primeiro valor (número *(-1))
*/

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n1;
        int n2;
        int conta1;
        System.out.println("Digite um número inteiro:");
            n1 = ler.nextInt();
        System.out.println("Digite outro número inteiro:");
            n2 = ler.nextInt();
            conta1 = (int) Math.pow(n1,n2);



    }

}

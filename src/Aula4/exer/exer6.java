package Aula4.exer;
/*Escreva um algoritmo que leia três notas de um aluno e calcule sua média. Ao final do algoritmo pergunte se deseja efetuar o cálculo para mais algum aluno.
 Se o usuário receber digitar S, leia novamente as três notas até que o usuário responda não.
 */
import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char resp;
        do{
            System.out.println("Digite a primeira nota:");
            int notaUm = ler.nextInt();
            System.out.println("Digite a segunda nota:");
            int notaDois = ler.nextInt();
            System.out.println("Digite a terceira nota:");
            int notaTres = ler.nextInt();
            int media = (notaUm+notaDois+notaTres)/3;
            System.out.println("A média das tres notas são: "+media);
            System.out.println("Voce deseja efetuar estes calculos para mais um aluno? 's' para sim, e 'n' para não.");
            resp = ler.next().charAt(0);
        }
        while(resp =='s');

    }
}

package Aula4.ex;
import java.util.Scanner;
public class exDoWhile3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int nota = 11;
        while (nota<0 || nota>10){
            System.out.println("Digite uma nota:");
            nota = ler.nextInt();
        }
        System.out.println("\nexemplo com do..while");
        int notaDois;
        do{
            System.out.println("Digite uma nota:");
            notaDois = ler.nextInt();
            if(notaDois<0 || notaDois>10)
                System.out.println("Nota inválida");
        }
        while(notaDois<0 || notaDois>10);
    }
}

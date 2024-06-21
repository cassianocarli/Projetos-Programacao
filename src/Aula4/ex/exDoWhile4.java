package Aula4.ex;
import java.util.Scanner;
public class exDoWhile4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char resp;

        do{
            System.out.println("Deseja continuar s - sim, n - não");
            resp = ler.next().charAt(0);
        }
        while(resp=='s');

    }
}
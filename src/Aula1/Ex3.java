package Aula1;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("qual o seu nome? ");
        String nome = new Scanner(System.in).next();
        String sobrenome = new Scanner(System.in).next();
        System.out.println("bem vindo " + nome + " " + sobrenome);
        System.out.print("qual seu nome completo? ");
        String nomeCompleto = new Scanner(System.in).nextLine();
        System.out.println("Bem vindo " + nomeCompleto);
    }
}
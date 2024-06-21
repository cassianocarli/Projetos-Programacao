package Aula3;

import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Nota um:");
        int nota = ler.nextInt();

        if(nota>=0 && nota<=10)
            System.out.println("Nota válida");
        else
            System.out.println("Nota inválida");


    }
}

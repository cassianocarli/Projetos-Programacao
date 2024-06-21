package Aula3.exercícios;
import java.util.Scanner;
public class ex12 {// Ler o código de um produto e exibir seu tipo de acordo com a tabela a seguir:


    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("-----TABELA DE CÓDIGOS-----");
        System.out.println("-----código- produto ----");
        System.out.println("-----  1 --- Caderno ----");
        System.out.println("-----  2 ---- Lápis ----");
        System.out.println("-----  3 --- Borracha ----");
        System.out.println("--- outros - Diversos ----");

        System.out.println("Digite o código do produto:");
        int cod = ler.nextInt();
        if(cod == 1){
            System.out.println("Este código esta cadastrado como caderno!");
        }
        else if(cod == 2){
            System.out.println("Este código esta cadastrado como lápis!");
        }
        else if(cod == 3){
            System.out.println("Este código esta cadastrado como borracha!");
        }
        else{
            System.out.println("Diversos!");
        }

    }
}
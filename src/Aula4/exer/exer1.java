package Aula4.exer;
/*Faça um algoritmo para escrever de 1 a 10 na tela, utilizando a estrutura ENQUANTO e um CONTADOR.*/
import java.util.Scanner;

public class exer1 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int cont = 1;
            do{
                System.out.println(cont+" ");
                cont++;
            }
            while(cont<=10);


        }

}

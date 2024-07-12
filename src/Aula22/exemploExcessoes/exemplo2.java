package Aula22.exemploExcessoes;
import java.util.Scanner;
import java.util.InputMismatchException;
public class exemplo2 {
        public static int leNumero(String mensagem){
        boolean correto = false;
        int numero = 0;
        Scanner ler = new Scanner(System.in);
            do{
                try {
                    System.out.println(mensagem+": ");
                    numero = ler.nextInt();
                    correto = true;
                }
                catch(InputMismatchException e){
                    System.out.println("O valor precisa ser númerico.");
                    ler.next();
                    correto = false;
                }
                }
            while(!correto);

        return numero;
        }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1 = leNumero("Digite um número:");
        int n2 = leNumero("Digite outro número");
    }
}

package Aula22.exemploExcessoes;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Exemplo1 {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite um número:");
            int n1 = ler.nextInt();
            System.out.println("Digite outro número:");
            int n2 = ler.nextInt();
            int resultado = n1 / n2;
            System.out.println(resultado);
        } catch (InputMismatchException erro) {
            System.out.println("n1 e n2 precisam ser números");
        } catch (ArithmeticException erro) {
            System.out.println("Não é possivel dividir por zero");
        }
    }
}

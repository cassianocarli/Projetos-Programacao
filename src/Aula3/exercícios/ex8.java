package Aula3.exercícios;
import java.util.Scanner;
public class ex8 {//A calculadora de Luciana pifou, justo quando ela precisa fazer vários cálculos.
    // Ela tem um computador, mas não sabe que um dos acessórios do Windows é uma calculadora.
    // Sendo estudante de programação, Luciana resolveu fazer um programa.
    // A especificação que bolou prevê que programa leia dois números inteiros (o que atende suas necessidades) e em seguida um símbolo de operação.
    // Se este for '+', o programa soma os números, se '-', subtrai, se '*' multiplica e se '/' divide. Se o símbolo for diferente desses, é mostrada uma mensagem de erro.
    //  O programa, antes de dividir, critica se o divisor é zero e mostra uma mensagem de erro. Implemente um programa que construa essa calculadora para Luciana
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("---------------------Calculadora Luciana--------------------");
        System.out.println("Digite a operação que deseja fazer (+),(-),(*),(/):");
        String opera = ler.next();
        if(opera.equals("+")) {
            System.out.println("Digite um número:");
            int n1 = ler.nextInt();
            System.out.println("Digite o número que voce deseja soma-lo:");
            int n2 = ler.nextInt();
            int soma = n1 + n2;
            System.out.println("RESULTADO:" + soma);
        }
        else if(opera.equals("-")) {
            System.out.println("Digite um número:");
            int n1 = ler.nextInt();
            System.out.println("Digite o número que voce deseja subtrair:");
            int n2 = ler.nextInt();
            int subtracao = n1 - n2;
            System.out.println("RESULTADO:" + subtracao);
        }
        else if(opera.equals("*")){
            System.out.println("Digite um número:");
            int n1 = ler.nextInt();
            System.out.println("Digite o número que voce deseja multiplicar:");
            int n2 = ler.nextInt();
            int multi = n1 * n2;
            System.out.println("RESULTADO:" +multi);

        }
        else if(opera.equals("/")){
            System.out.println("Digite um número:");
            int n1 = ler.nextInt();
            System.out.println("Digite o número que voce deseja dividir:");
            int n2 = ler.nextInt();
            if(n1 == 0 || n2 == 0){
                System.out.println("ERRO! o número digitado não pode ser dividido.");
            }
            else {
                int divi = n1 / n2;
                System.out.println("RESULTADO:" + divi);
            }

        }
        else{
            System.out.println("Esta operação não existe!");
        }

    }
}

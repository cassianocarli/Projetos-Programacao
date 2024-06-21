package Aula3.exercícios;
    import java.util.Scanner;
public class ex6 {
    //6) Faça um programa que solicite ao usuário digitar dois valores, em seguida, exiba na tela qual dos dois é o maior.
    // OBS: o usuário poderá informar valores iguais, logo, o sistema deve dizer que foram digitados valores iguais.
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número:");
            int n1 = ler.nextInt();
        System.out.println("Digite outro número:");
            int n2 = ler.nextInt();
        if(n1>n2)
            System.out.println("O primeiro número digitado é maior");
        else if(n2>n1)
            System.out.println("O segundo número digitado é maior");
        else
            System.out.println("Os dois números são iguais");
    }
}

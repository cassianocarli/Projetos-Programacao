package Aula3.exercícios;
import java.util.Scanner;
public class ex11 {//Solicite o nome e a idade de duas pessoas. Em seguida exiba o nome da pessoa mais velha e o nome da pessoa mais nova.
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa:");
        String nomeUm = ler.next();
        System.out.println("Digite a idade da primeira pessoa:");
        int idadeUm = ler.nextInt();
        System.out.println("Digite o nome da segunda pessoa:");
        String nomeDois = ler.next();
        System.out.println("Digite a idade da segunda pessoa:");
        int idadeDois = ler.nextInt();
        if(idadeUm>idadeDois){
            System.out.printf("A primeira pessoa chamado (a) "+nomeUm+(" é mais velho (a) do que a segunda pessoa chamado (a): "+nomeDois));
        }
        else{
            System.out.printf("A segunda pessoa chamado (a) "+nomeDois+(" é mais velho (a) do que a primeira pessoa chamado (a): "+nomeUm));
        }

    }
}

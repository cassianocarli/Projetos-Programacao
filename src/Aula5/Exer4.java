package Aula5;
import java.util.Scanner;
import java.util.Random;
public class Exer4 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[10];
        int[]vetorM = new int[10];
        System.out.println("Dados no vetor...");
        for(int i=0;i<vetor.length;i++){
            vetor[i] = aleatorio.nextInt(1,20);
            System.out.println(vetor[i]+" ");
        }
        System.out.println("\n Digite um valor para multiplicar o vetor:");
        int x = ler.nextInt();
        System.out.println("Vetor multiplicado");
        for(int i=0;i<vetorM.length;i++){
            vetorM[i] = vetor[i]*x;
            System.out.println(vetorM[i]+" ");
        }
    }
}

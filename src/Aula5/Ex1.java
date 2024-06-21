package Aula5;
import java.util.Scanner;
public class Ex1 {
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        //vetor de 10 elementos com índices de 0 a 9;
        int[] vetor = new int[10];
        for(int i=0;i<10;i++){
            System.out.println("vetor["+i+"]: ");
            vetor[i] = ler.nextInt();
        }
        for(int i=0;i<10; i++){
            System.out.println(vetor[i]+" ");
        }
    }
}

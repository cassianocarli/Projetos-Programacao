package Aula5;
import java.util.Random;
public class Exer3 {
    public static void main(String [] args){
        Random aleatorio = new Random();
        int[] vetor = new int[10];
        int[] vetorInv = new int[10];
        for(int i=0;i<vetor.length;i++){
            vetor[i] = aleatorio.nextInt(1,20);
            System.out.println(vetor[i]+" ");
        }
        System.out.println("\n Vetor inverso");
        for(int i=0,j=9;i<10;i++,j--){
            vetorInv[i]=vetor[j];
            System.out.println( vetorInv[i]+" ");
        }

    }

}

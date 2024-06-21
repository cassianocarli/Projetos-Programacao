package Aula5;
import java.util.Scanner;
import java.util.Random;
public class Exer9 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] vr = new int[5];
        int[] vs = new int[10];
        int[] vx = new int[15];
        System.out.println("Dados no vetor R:");
        for (int i = 0; i < vr.length; i++) {
            vr[i] = aleatorio.nextInt(20);
            System.out.println(vr[i] + " ");
        }
        System.out.println("Dados no vetor s:");
        for (int i = 0; i < vs.length; i++) {
            vs[i] = aleatorio.nextInt(20);
            System.out.println(vs[i] + " ");
        }
        System.out.println("Dados no vetor x:");
        for (int i = 0; i < vx.length; i++) {
            if (i < 5) {
                vx[i] = vr[i];
            } else {
                vx[i] = vs[i - 5];

            }
            System.out.println(vx[i] + " ");
        }
    }
}

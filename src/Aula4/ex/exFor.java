package Aula4.ex;
import java.util.Scanner;
public class exFor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //for(inicialização;teste;passo);
        for(int i=0; i<10;i++){
            System.out.println(i+" ");
        }
        System.out.println("\nExemplo Dois:");
        int i;
        for(i=0;i<20;i+=2){
            System.out.println(i+" ");
        }
        System.out.println("\nExemplo Tres:");
        for(int j=0,  l=9; j<10 && l>=0; j++, l--){
            System.out.println("j =" +j+", l = "+l);
        }
        System.out.println("\nExemplo Quatro:");
        int t = 10;
        for(;t<=20;t++){
            System.out.println(t+" ");
        }
        System.out.println("\nExemplo Cinco:");
        t=0;
        for(;t<10;){
            System.out.println(t+" ");
            t++;
        }
    }


}

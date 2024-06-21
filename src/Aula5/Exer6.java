package Aula5;
import java.util.Scanner;
public class Exer6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[] nomes = {"ana","joao","bia","pedro","sofia"};
        System.out.println("Qual nome devo pesquisar na lista:");
        String nome = ler.next();
        boolean achei = false;
        for(int i=0;i<nomes.length;i++){
            if(nomes[i].equalsIgnoreCase(nome)){
                achei = true;
            }
        }
        if(achei){
            System.out.println(nome+" esta na lista");
        }
        else {
            System.out.println(nome + "não esta na lista");
        }

        }
    }
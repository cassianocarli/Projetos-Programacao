package Aula1;

public class Ex1 {
    public static void main(String[] args){
        System.out.println("imprime e quebra linha!");
        System.out.print("imprime sem quebrar linha!");
        System.out.printf("Esse texto fica ao lado!\n");
        //
        int altura = 180;
        String nome = "Cassiano";
        String sobrenome = "Carli";

        System.out.println("Nome: "+nome+" "+sobrenome+ "\naltura: "+altura+" cm");

        System.out.printf("Nome: %s %s \naltura: %d cm",nome,sobrenome,altura);

        float valor= (float) 1.6;
        System.out.println("o valor é" +valor);
        System.out.printf("o valor é %.2f\n",valor);
    }
}
